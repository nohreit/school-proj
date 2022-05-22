package prog_2.sp22.end;

import java.util.Arrays;

public abstract class Vehicle {
    protected Person[][] personsOnBoard;
    protected int numberOfRows;
    protected int maxSeatsPerRow; // has the maximum seat for each row.
    protected int[] numSeatsPerRow; // array with x rows with each row containing z seats

    public Vehicle(int numRows, int numSeatsPerRow) {
        this.numberOfRows = numRows;
        this.maxSeatsPerRow = numSeatsPerRow;
        this.numSeatsPerRow = new int[numRows];
        for (int row = 0; row < numRows; row++) {
            this.numSeatsPerRow[row] = numSeatsPerRow;
        }
        personsOnBoard = new Person[numRows][maxSeatsPerRow];
    }

    public Vehicle(int[] numSeatsPerRow) {
        this.numberOfRows = numSeatsPerRow.length;
        for (int seat : numSeatsPerRow) {
            this.maxSeatsPerRow = Math.max(this.maxSeatsPerRow, seat);
        }
        this.numSeatsPerRow = numSeatsPerRow;
        personsOnBoard = new Person[numberOfRows][maxSeatsPerRow];
    }

    public Vehicle(Person driver, int[] numSeatsPerRow) {
        this(numSeatsPerRow); // it calls the Vehicle(int[]) to avoid repetition just like calling function.
        if (driver.hasDriverLicense()) {
            assert false; // You don't have to add this part. It's my IDE screaming at me to add it.
            personsOnBoard[0][0] = driver;
        }
    }

    /*
     * This abstract method will be implemented by derived classes to load the specified person into the vehicle at the first available seat.
     * Searching for an available seat must start in the first row, please note that a person below the age of 5 or has a height less than 36
     * is not allowed to sit in the first row. This method returns true if there is room for the specified person, otherwise the method returns false.
     */
    abstract boolean loadPassenger(Person p);

    /*
     *This method attempts to load as many of the persons specified in the peeps array as possible.
     * This method returns the number of people that were loaded into the Vehicle.
     */
    abstract int loadPassengers(Person[] peeps);

    public void setDriver(Person p) throws InvalidDriverException {
        if (p.hasDriverLicense()) {
            assert false; // You don't have to add this part. It's my IDE screaming at me to add it.
            personsOnBoard[0][0] = p;
        } else throw new InvalidDriverException(p.getName() + " doesn't have a driver licence");
    }

    public Person getDriver() {
//        if(hasDriver()) return personsOnBoard[0][0];
//        return null;
        return hasDriver() ? personsOnBoard[0][0] : null;
    }

    public boolean hasDriver() {
        return personsOnBoard[0][0] != null;
    }

    public int getNumberOfAvailableSeats() {
        int count = 0;
        for (Person[] people : personsOnBoard) { // for (int i = 0; i < personsOnBoard.length; i++) // row
            for (Person seat : people) { // for ( int j = 0; j < personsOnBoard[i].length; j++)
                if (seat == null) count++; // if (personsOnBoard[i][j] == null) count++
            }
        }
        return count;
    }

    public int getNumberOfAvailableSeatsInRow(int row) {
        if (isValid(row)) {
            int count = 0;
            for (int seat = 0; seat < personsOnBoard[row].length; seat++) {
                if (personsOnBoard[row][seat] == null) count++;
            }
            return count;
        }
        return -1;
    }

    public int getNumberOfPeopleOnBoard() {
        int count = 0;
        for (Person[] row : personsOnBoard) { /// for (int i = 0; i < personsOnBoard.length; i++) // row
            for (Person person : row) { // for ( int j = 0; j < personsOnBoard[i].length; j++)
                if (person != null) count++; // if (personsOnBoard[i][j] == null) count++
            }
        }
        return count;
    }

    public int getNumberOfPeopleInRow(int row) {
        if (isValid(row)) {
            int count = 0;
            for (int p = 0; p < personsOnBoard[row].length; p++) {
                if (personsOnBoard[row][p] != null) count++;
            }
            return count;
        }
        return -1;
    }

    public Person getPersonInSeat(int row, int col) {
        if (!isValid(row)) return null;
        if (col < 0 || col >= personsOnBoard.length) return null;
        return personsOnBoard[row][col];
    }

    public int[] getLocationOfPersonInVehicle(Person p) {
        // int row = -1, col = -1;
        // int[] location = new int[]{1, 2, 3}
        for (int row = 0; row < personsOnBoard.length; row++) {
            for (int col = 0; col < personsOnBoard[row].length; col++) {
                if (p.equals(personsOnBoard[row][col]))
                    return new int[]{row, col}; // row = i; seatColumn = j; || location[0] = i; location[1] = j;
            }
        }
        // location[0] = row; location[1] = col;
        return new int[]{-1, -1}; // return location;
    }

    public Person[] getPeopleInRow(int row) {
        if (!isValid(row)) return null;
        Person[] personInRow = new Person[numSeatsPerRow[row] - getNumberOfAvailableSeatsInRow(row)];
        for (int i = 0; i < personInRow.length; i++) {
            if (personsOnBoard[row][i] != null)
                personInRow[i] = personsOnBoard[row][i].clone();
        }

//        for (int i = 0; i < personInRow.length; i++) {
//            if (personInRow[i] != null) return personInRow;
//        }
//
//        return null;
        return Arrays.asList(personInRow).isEmpty() ? null : personInRow;
    }

    public Person[][] getPeopleOnBoard() {
        Person[][] clone = new Person[numberOfRows][maxSeatsPerRow];
        for (int i = 0; i < personsOnBoard.length; i++) {
            clone[i] = getPeopleInRow(i);
        }
        return clone;
    }

    public boolean isPersonInVehicle(Person p) {
        int[] isThere = getLocationOfPersonInVehicle(p);
        return isThere[0] != -1 && isThere[1] != -1;
    }

    public boolean isPersonDriver(Person p) {
        if (!hasDriver()) return false; // check if the vehicle has a driver
        int[] isThere = getLocationOfPersonInVehicle(p);
        return isPersonInVehicle(p) && p.hasDriverLicense() && (isThere[0] == 0 && isThere[1] == 0);
    }

    private boolean isValid(int index) {
        return index >= 0 && index < personsOnBoard.length; // returns true if within range or false if not.
    }

}
