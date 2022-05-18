package prog_1.sp21.hw8;

public class Animal {

    private String name;
    private int birthYear;
    private double weight;
    private char gender;

    public Animal() {
        this("", 1900, 0, 'u');
    }

    public Animal(String name, int birthYear, double weight, char gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.setWeight(weight);
        this.setGender(gender);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setWeight(double weight) {
        if (weight < 0) this.weight = -1;
        else this.weight = weight;
    }

    public void setGender(char gender) {
        gender = Character.toLowerCase(gender);
        if (gender == 'm') this.gender = 'm';
        else if (gender == 'f') this.gender = 'f';
        else this.gender = 'u';
    }

    public int calculateAge(int currentYear) {
        return (currentYear < birthYear) ? -1 : (currentYear - birthYear);
    }

    public boolean isMale() {
        return gender == 'm';
    }

    public boolean isFemale() {
        return gender == 'f';
    }

    public void printDetails() {
        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n",
                this.name, this.birthYear, this.weight, this.gender);
    }

    public void gainWeight() {
        gainWeight(1);
    }

    public void gainWeight(double weight) {
        if (weight > 0) this.weight += weight;
    }

    public void loseWeight() {
        loseWeight(1);
    }

    public void loseWeight(double weight) {
        if ((weight > 0) && (this.weight - weight > 0))
            this.weight -= weight;
    }

}
