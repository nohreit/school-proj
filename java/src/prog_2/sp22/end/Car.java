package prog_2.sp22.end;

public class Car extends Vehicle implements Comparable<Car>, Announcements {
    private int numDoors;
    private int numWindows;

    public Car(int numDoors, int numWindows) {
        super(2, 2);
        setNumDoors(numDoors); // this.numDoors = Math.max(numDoors, 0);
        setNumWindows(numWindows); // this.numWindows = Math.max(numWindows, 0);
    }

    public Car(int numDoors, int numWindows, int numSeatsPerRow) {
        super(2, numSeatsPerRow);
        setNumDoors(numDoors);
        setNumWindows(numWindows);
    }

    public Car(int numDoors, int numWindows, int[] numSeatsPerRow) {
        super(numSeatsPerRow);
        setNumDoors(numDoors);
        setNumWindows(numWindows);
    }

    public Car(int numDoors, int numWindows, Person driver, int[] numSeatsPerRow) {
        super(driver, numSeatsPerRow);
        setNumDoors(numDoors);
        setNumWindows(numWindows);
    }

    private void setNumDoors(int numDoors) {
        this.numDoors = Math.max(numDoors, 0);
    }

    private void setNumWindows(int numWindows) {
        this.numWindows = Math.max(numWindows, 0);
    }

    public boolean canOpenDoor(Person p) {
        int[] location = getLocationOfPersonInVehicle(p);
        // if (p.getAge() > 5 && location[1] == 0 || location[1] == numSeatsPerRow.length - 1) return true;
        return p.getAge() > 5 && location[1] == 0 || location[1] == numSeatsPerRow.length - 1;
    }

    // If the number of windows is less than 2 * numberOfRows, the row/s  past numWindows / 2 has/have no windows.
    public boolean canOpenWindow(Person p) {
        int r = 0;

        if (numWindows < 2 * numberOfRows) r = numWindows / 2; // get from which row we have no windows.

        int[] location = getLocationOfPersonInVehicle(p);

//        if (location[0] != r && p.getAge() > 2 && location[1] == 0 || location[1] == numSeatsPerRow.length - 1)
//            return true;
        return location[0] <= r && p.getAge() > 2 && location[1] == 0 || location[1] == numSeatsPerRow.length - 1;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Car c) {
            if (numDoors == c.numDoors && numWindows == c.numWindows && numberOfRows == c.numberOfRows
                    && maxSeatsPerRow == c.maxSeatsPerRow) {
                for (int row = 0; row < numSeatsPerRow.length; row++) {
                    if (numSeatsPerRow[row] != c.numSeatsPerRow[row])
                        return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String seatsPerRows = "[";
        for (int row = 0; row < numSeatsPerRow.length; row++) {

            seatsPerRows += numSeatsPerRow[row]; // returns the number of seats at the current row

            if (row < numSeatsPerRow.length - 1) // check if the current row is not the last row
                seatsPerRows += ","; // if not last row, keep adding this ", "
        }
        seatsPerRows += "]";

        String peopleOnBoard = "[";

        for (int row = 0; row < personsOnBoard.length; row++) {
            Person[] people = getPeopleInRow(row);
            for (int p = 0; p < people.length; p++) {
                peopleOnBoard += people[p].getName();
//                if (p < people.length - 1) // check if the current row is not the last row
                peopleOnBoard += ","; // if not last row, keep adding this ", "
            }
        }

        return String.format("Car: number of doors = %02d | number of windows = %02d | number of rows = %02d " +
                "| seats per row= %s | names of people on board= %s\n", numDoors, numWindows, numberOfRows, seatsPerRows, peopleOnBoard);
    }

    @Override
    public int compareTo(Car c) {
//        if (this.getTotalNumSeats() < c.getTotalNumSeats()) return -1;
//        if (getTotalNumSeats() > c.getTotalNumSeats()) return 1;
//        return 0;
        return Integer.compare(getTotalNumSeats(), c.getTotalNumSeats()); // What the ide gave me. Don't copy it if you don't get it!!!!
    }

    // Custom helper method not asked by the assignment.
    private int getTotalNumSeats() {
        return numberOfRows * maxSeatsPerRow;
    }

    @Override
    public String departure() {
        return "All Aboard\n";
    }

    @Override
    public String arrival() {
        return "Everyone Out\n";
    }

    @Override
    public String doNotDisturbTheDriver() {
        return "No Backseat Driving\n";
    }

    @Override
    public boolean loadPassenger(Person p) {
        if (getNumberOfAvailableSeats() == 0) return false;
        for (int row = 0; row < numberOfRows; row++) {
            if (row == 0 && p.getAge() >= 5 && p.getHeight() > 36) {
                for (int seat = 0; seat < personsOnBoard[row].length; seat++) {
                    if (personsOnBoard[row][seat] == null) { // It even loads a person without a license.
                        if (p.hasDriverLicense() && seat == 0) {
                            personsOnBoard[row][seat] = p;
                        } else {
                            seat++;
                            personsOnBoard[row][seat] = p;
                        }
                        return true;
                    }
                }
            } else {
                for (int seat = 0; seat < personsOnBoard[row].length; seat++) {
                    if (personsOnBoard[row][seat] == null) {
                        personsOnBoard[row][seat] = p;
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public int loadPassengers(Person[] peeps) {
        int count = 0;

        for (Person peep : peeps)
            if (loadPassenger(peep)) count++;

        return count;
    }
}
