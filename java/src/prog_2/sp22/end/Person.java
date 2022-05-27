package prog_2.sp22.end;

public class Person {

    private String name;
    private boolean hasDriverLicense;
    private int age; // years
    private int height; //inches

    public Person(String name, boolean hasDriverLicense, int age, int height) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.age = age;
        setHeight(height); // this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasDriverLicense() {
        return this.hasDriverLicense;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    private void setHeight(int height) {
        this.height = Math.max(height, -1);
    }

    @Override
    public Person clone() { // returns a copy of the Person with all the same values without revealing the original memory address
        return new Person(this.name, this.hasDriverLicense, this.age, this.height);
    }

    @Override
    public boolean equals(Object o) {    //2 Person objects are equal if all their variables are equal
//        return (o instanceof Person p && name.equals(p.name) && hasDriverLicense == p.hasDriverLicense && age == p.age
//                && height == p.height);
        if (o instanceof Person p) {
            if (this.name.equals(p.name) && this.hasDriverLicense == p.hasDriverLicense &&
                    this.age == p.age)
                return this.height == p.height;
        }
        return false;
    }

    @Override
    public String toString() { //"Person [name= %10s | age= %02d | height= %02d | has license/no license]", name, age, height, hasDriverLicense
        return String.format("Person [name= %10s | age= %02d | height= %02d | %s]",
                name, age, height, (hasDriverLicense ? "has license" : "no license"));
    }

}
