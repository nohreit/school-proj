package prog_2.sp22.end;

public class Bicycle extends Vehicle implements Comparable<Bicycle> {
    private double weight;

    public Bicycle() {
        super(1, 1);
        weight = 0.0;
    }

    public Bicycle(Person driver) {
        super(driver, new int[]{1});
        weight = 0.0;
    }

    public Bicycle(Person driver, double weight) {
        super(driver, new int[]{1});
        setWeight(weight);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Bicycle) {
            Bicycle a = (Bicycle) o;
            return Math.abs(weight - a.getWeight()) <= 0.5;
        }
        return false;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double w) {
        this.weight = Math.max(w, 0);
    }

    @Override
    public void setDriver(Person p) throws InvalidDriverException {
        if (p.getAge() >= 3) personsOnBoard[0][0] = p;
        else throw new InvalidDriverException();
    }

    @Override
    public String toString() { // "Bicycle [ rider= " + getDriver().getName() + " | weight= " + weight + " ]"
        return String.format("Bicycle [ rider= %s | weight= %f ]", getDriver().getName(), weight);
    }

    public int compareTo(Bicycle o) {
//        if (weight - o.weight < 0.5) return -1;
//        if (weight - o.weight > 0.5) return 1;
//        return 0;
        return Double.compare(weight - o.weight, 0.5);
    }

    @Override
    public boolean loadPassenger(Person p) {
        System.out.println("Cannot have any passenger."); // Optional. I don't know what the assignment expect here.
        return false; // But this one should be expected.
    }

    @Override
    public int loadPassengers(Person[] peeps) {
        System.out.println("Cannot have any passenger."); // Optional. I don't know what the assignment expect here.
        return 0; // But this one should be expected.
    }
}
