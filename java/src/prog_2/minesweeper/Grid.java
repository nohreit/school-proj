package prog_2.minesweeper;

import java.util.concurrent.ThreadLocalRandom;

public class Grid {
    private boolean bombGrid[][];
    private int countGrid[][];
    private int numRows;
    private int numColumns;
    private int numBombs;

    public Grid() {
        this(10, 10, 25);
    }

    public Grid(int rows, int columns) {
        this(rows, columns, 25);
    }

    public Grid(int rows, int columns, int numBombs) {
        numRows = rows;
        numColumns = columns;
        numBombs = numBombs;
        bombGrid = new boolean[numRows][numColumns];
        countGrid = new int[numRows][numColumns];
        createBombGrid();
        createCountGrid();
    }

    private void createCountGrid() {
//        countGrid = new int[numRows][numColumns];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {

                if (isValidLocation(row, col))
                    countGrid[row][col] += getCountAtLocation(row, col); // [0][0]
                if (isValidLocation(row, col - 1))
                    countGrid[row][col - 1] += getCountAtLocation(row, col - 1); //[x][0]// left
                if (isValidLocation(row, col + 1))
                    countGrid[row][col + 1] += getCountAtLocation(row, col + 1); // [0][1] right
                if (isValidLocation(row - 1, col))
                    countGrid[row - 1][col] += getCountAtLocation(row - 1, col); // top
                if (isValidLocation(row + 1, col))
                    countGrid[row + 1][col] += getCountAtLocation(row + 1, col); // bottom
                if (isValidLocation(row - 1, col - 1))
                    countGrid[row - 1][col - 1] += getCountAtLocation(row - 1, col - 1); // top-left
                if (isValidLocation(row - 1, col + 1))
                    countGrid[row - 1][col + 1] += getCountAtLocation(row - 1, col + 1); // top-right
                if (isValidLocation(row - 1, col - 1))
                    countGrid[row + 1][col - 1] += getCountAtLocation(row - 1, col - 1); // bottom-left
                if (isValidLocation(row - 1, col - 1))
                    countGrid[row - 1][col - 1] += getCountAtLocation(row - 1, col - 1); // bottom-right
            }
        }
    }

    public boolean[][] getBombGrid() {
        boolean[][] cpyBGrid = new boolean[numRows][numColumns];
        for (int row = 0; row < numRows; row++)
            if (numColumns >= 0) System.arraycopy(bombGrid[row], 0, cpyBGrid[row], 0, numColumns);
        return cpyBGrid;
    }

    public int[][] getCountGrid() {
        int[][] cpyCGrid = new int[numRows][numColumns];
        for (int row = 0; row < numRows; row++)
            if (numColumns >= 0) System.arraycopy(countGrid[row], 0, cpyCGrid[row], 0, numColumns);
        return cpyCGrid;
    }

    private boolean isValidLocation(int row, int col) {
        return row >= 0 && col >= 0 && row < numRows && col < numColumns;
    }

    private int getCountAtLocation(int row, int col) {
        int count = 0;
        if (isBombAtLocation(row, col)) {
            count++;
        }

        if (row + 1 < numRows) {
            if (isBombAtLocation(row + 1, col))
                count++;
            if (col + 1 < numColumns) {
                if (isBombAtLocation(row + 1, col + 1))
                    count++;
            }

            if (col - 1 >= 0) { // check for all columns except first column
                if (isBombAtLocation(row + 1, col - 1)) // Add count by 1 if element at next row,previous column is a bomb
                    count++;
            }

            if (row - 1 >= 0) { // check for all rows except first row
                if (isBombAtLocation(row - 1, col)) // Add count by 1 if element at next row,same column is a bomb
                    count++;
                if (col - 1 >= 0) { // check for all columns except first column
                    if (isBombAtLocation(row - 1, col - 1)) // Add count by 1 if element at previous row,previous column
                        // is a bomb
                        count++;
                }

                if (col + 1 < numColumns) { // check for all columns except last column
                    if (isBombAtLocation(row - 1, col + 1)) // Add count by 1 if element at previous row,next column is a
                        // bomb
                        count++;
                }


                if (col + 1 < numColumns) { // check for all columns except last column
                    if (isBombAtLocation(row, col + 1)) // Add count by 1 if element at same row,next column is a bomb
                        count++;
                }

                if (col - 1 >= 0) { // check for all columns except first column
                    if (isBombAtLocation(row, col - 1)) // Add count by 1 if element at same row,previous column is a bomb
                        count++;
                }

            }
        }
        return count;
    }

    public boolean isBombAtLocation(int row, int column) {
        return bombGrid[row][column];
    }

    private void createBombGrid() {
        bombGrid = new boolean[numRows][numColumns];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                bombGrid[row][col] = false; // This will create a grid that has all cells as false.
            }
        }
        // Set the bombs
        int x;
        int y;
        for (int i = 0; i < numBombs; i++) { // Set the bombs randomly in the grid. 0
            do {
                x = genLocation(numRows); // generate a location
                y = genLocation(numColumns);
            } while (bombGrid[x][y]); // When the mine is already set.
            bombGrid[x][y] = true; // Set a mine at that location.
        }
    }

    private int genLocation(int val) {
        return ThreadLocalRandom.current().nextInt(0, val);
    }

}
