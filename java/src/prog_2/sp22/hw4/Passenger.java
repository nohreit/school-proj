package prog_2.sp22.hw4;

public class Passenger {

    private String name;
    private int birthYear;
    private double weight;
    private char gender;
    private int numCarryOn;
    private double height;

    public Passenger() {
        this("", 1900, 0.0, 0.0, 'u', 0);
    }

    public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {
        this(name, birthYear, weight, 0.0, gender, numCarryOn);
    }

    public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
        this.name = name;
        this.setBirthYear(birthYear);
        this.setWeight(weight);
        this.setHeight(height);
        this.setGender(gender);
        this.setNumCarryOn(numCarryOn);
    }

    public int calculateAge(int currentYear) {
        int age = currentYear - this.birthYear;
        return age < 0 ? -1 : age;
    }

    public void gainWeight() {
        weight++;
    }

    public void gainWeight(double weight) {
        this.weight += weight;
        if (this.weight < 0) this.weight = 0;
    }


    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public int getNumCarryOn() {
        return numCarryOn;
    }

    public double getHeight() {
        return height;
    }

    public boolean isFemale() {
        return this.getGender() == 'f';
    }

    public boolean isMale() {
        return this.getGender() == 'm';
    }

    public void loseWeight() {
        this.weight--;
        if (this.weight < 0) this.weight = 0;
    }

    public void loseWeight(double w) {
        this.weight -= w;
        if (this.weight < 0) this.weight = 0;
    }


    public void printDetails() {
        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f |  Height: %10.2f | Gender: %c | NumCarryOn: %2d\n ",
                name, birthYear, weight, height, gender, numCarryOn);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setWeight(double weight) {
        this.weight = (weight < 0) ? weight : -1;
    }

    public void setGender(char gender) {
        this.gender = (gender != 'f' && gender != 'm') ? gender : 'u';
    }

    public void setNumCarryOn(int numCarryOn) {
        if (numCarryOn < 0) numCarryOn = 0;
        if (numCarryOn > 2) numCarryOn = 2;
        this.numCarryOn = numCarryOn;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? height : -1;
    }

    public double calculateBMI() {
        return (height != 0) ? (this.weight * 703) / Math.pow(this.height, 2) : 0;
    }

    @Override
    public String toString() {
        return String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",
                name, birthYear, weight, height, gender, numCarryOn);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Passenger p && birthYear == p.birthYear && gender == p.gender && name.equals(p.name) &&
                weight - p.weight <= 0.5 && height - p.height <= 0.5);
    }


}


