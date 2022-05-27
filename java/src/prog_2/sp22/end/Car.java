package prog_2.sp22.end;

import java.util.Arrays;

public class Car extends Vehicle implements Comparable<Car>, Announcements {

    private int numDoors;
    private int numWindows;


    public Car(int numDoors, int numWindows) {
        super(2, 2);
        this.numDoors = Math.max(numDoors, 0);
        this.numWindows = Math.max(numWindows, 0);
    }

    public Car(int numDoors, int numWindows, int numSeatsPerRow) {
        super(2, numSeatsPerRow);
        this.numDoors = Math.max(numDoors, 0);
        this.numWindows = Math.max(numWindows, 0);
    }

    public Car(int numDoors, int numWindows, int[] numSeatsPerRow) {
        super(numSeatsPerRow);
        this.numDoors = Math.max(numDoors, 0);
        this.numWindows = Math.max(numWindows, 0);
    }

    public Car(int numDoors, int numWindows, Person driver, int[] numSeatsPerRow) {
        super(driver, numSeatsPerRow);
        this.numDoors = Math.max(numDoors, 0);
        this.numWindows = Math.max(numWindows, 0);
    }

    public boolean canOpenDoor(Person p) {
        int[] location = getLocationOfPersonInVehicle(p);
        return (!(Arrays.equals(location, new int[]{-1, 1}) && location[1] == 0 || (location[1] == numSeatsPerRow[(location[0])] - 1))
                && p.getAge() > 5 && numDoors >= (2 * numberOfRows) || location[0] <= (numDoors / 2));
    }

    public boolean canOpenWindow(Person p) {
        int[] location = getLocationOfPersonInVehicle(p);
        return (!(Arrays.equals(location, new int[]{-1, -1})) && (location[1] == 0 || (location[1] == numSeatsPerRow[(location[1] - 1)]))
                && p.getAge() > 2 && getNumWindows() >= (2 * numberOfRows) || location[0] <= (getNumWindows() / 2));
    }

    public int getNumWindows() {
        return numWindows;
    }

    public int getNumDoors() {
        return numDoors;
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car c = (Car) o;
            if (numDoors == c.numDoors && numWindows == c.numWindows && numberOfRows == c.numberOfRows && maxSeatsPerRow == c.maxSeatsPerRow) {
                for (int i = 0; i < numSeatsPerRow.length; ++i) {
                    if (numSeatsPerRow[i] != c.numSeatsPerRow[i]) return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String seatsOnRows = "[";

        for (int i = 0; i < numSeatsPerRow.length; ++i) {
            seatsOnRows += numSeatsPerRow[i];

            if (i < numSeatsPerRow.length - 1) seatsOnRows += ",";
        }
        seatsOnRows += "]";

        String s = String.format("Car: number of doors = %02d | number of windows = %02d | number of rows = %02d | seats per row = %s | names of people on board = [", numDoors, numWindows, numberOfRows, seatsOnRows, numSeatsPerRow.length);

        for (Person[] people : personsOnBoard) {
            for (Person person : people) {
                s += person.getName() + ",";
            }
        }

        return s.replaceAll(",$", "]\n");
    }

    public int compareTo(Car c) {
        int cTotalSeats = c.getNumberOfAvailableSeats() + c.getNumberOfPeopleOnBoard();
        int currTotalSeats = getNumberOfAvailableSeats() + getNumberOfPeopleOnBoard();
        return Integer.compare(currTotalSeats, cTotalSeats);
    }

    @Override
    public boolean loadPassenger(Person p) {
        for (int row = 0; row < this.numberOfRows && p != null; row++) {
            for (int col = 0; col < this.numSeatsPerRow[row]; col++) {
                if (this.isEmpty(this.personsOnBoard[row][col])) {
                    if (p.hasDriverLicense() && (row == 0 && col == 0)) {
                        this.personsOnBoard[0][0] = p;
                        return true;
                    } else if (p.getAge() >= 5 && p.getHeight() >= 36 && this.isEmpty(this.personsOnBoard[row][col])
                            && (row == 0 && col > 0)) {
                        this.personsOnBoard[row][col] = p;
                        return true;
                    } else {
                        this.personsOnBoard[row][col] = p;
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
        int numPeopleToLoad = peeps.length;
        int avail = getNumberOfAvailableSeats();
        while (avail > 0 && numPeopleToLoad > 0) {
            for (Person p : peeps) {
                loadPassenger(p);
                count++;
                avail--;
                numPeopleToLoad--;
            }
        }

        return count;
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

//    public static void main(String[] args) {
//        Car p = new Car(2, 4);
//        Person personA = new Person("Daphne", true, 19, 65);
//        Person personB = new Person("Daphne", true, 18, 65);
//        Person personC = new Person("Daphne", true, 17, 65);
//
//        p.personsOnBoard[0][0] = personC;
//
//        System.out.println("Is personA driver? " + p.isPersonDriver(personA));
//        System.out.println("Is personA driver? " + p.isPersonDriver(personB));
//        System.out.println("Is personA driver? " + p.isPersonDriver(personC));
//
//    }
}
