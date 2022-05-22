package prog_2.sp22.end;

public class Bus extends Car {
    public Bus(int[] numSeatsPerRow) {
        super(2, (2 * numSeatsPerRow.length) - 1, numSeatsPerRow);
    }

    public Bus(Person driver, int[] numSeatsPerRow) {
        super(2, (2 * numSeatsPerRow.length) - 1, driver, numSeatsPerRow);
    }

    public boolean canOpenDoor(Person p) {
        return super.canOpenDoor(p) && p.getHeight() > 40;
    }

    public boolean canOpenWindow(Person p) {
        return super.canOpenWindow(p) && p.getAge() > 5;
    }

    public String toString() {
        return "Bus is an extension of " + super.toString();
    }

    @Override
    public boolean loadPassenger(Person p) {
        return super.loadPassenger(p);
    }

    @Override
    public int loadPassengers(Person[] peeps) {
        return super.loadPassengers(peeps);
    }
}
