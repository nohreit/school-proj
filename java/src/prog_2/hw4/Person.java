package prog_2.hw4;

public class Person extends Passenger {

    private int numOffspring;

    public Person() {
        super();
        numOffspring = 0;
    }

    public Person(int numOffspring) {
        super();
        if (numOffspring > 0)
            this.numOffspring = numOffspring;
        else numOffspring = 0;
    }

    public Person(String name, int birthYear, double weight, double height,
                  char gender, int numCarryOn, int numOffspring) {
        super(name, birthYear, weight, height, gender, numCarryOn);
        if (numOffspring > 0)
            this.numOffspring = numOffspring;
        else numOffspring = 0;
    }

    public void setNumOffspring(int numOffspring) {
        if (numOffspring < 0) numOffspring = 0;
        this.numOffspring = numOffspring;
    }

    public int getNumOffspring() {
        return numOffspring;
    }

    @Override
    public void printDetails() {
        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f |  Height: %10.2f | Gender: %c | NumCarryOn: %2d | NumOffspring: %2d\n",
                getName(), getBirthYear(), getWeight(), getHeight(), getGender(), getNumCarryOn(), getNumOffspring());
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Person: Number of Offspring: %4d\n",
                        this.numOffspring);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person otherPerson) {
            if (super.equals(otherPerson)) {
                return this.numOffspring == otherPerson.numOffspring;
            }
        }
        return false;
    }
}
