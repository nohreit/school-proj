package prog_2.sp22.proj_1;

public class Person implements Comparable<Person> {

    private String name;
    private int birthYear;

    public Person() {
        this("", 0);
    }

    public Person(String n, int by) {
        this.name = n;
        this.birthYear = by;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setBirthYear(int by) {
        this.birthYear = by;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Person p) && this.name.equals(p.name) && this.birthYear == p.birthYear;
    }

    @Override
    public String toString() {
        return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(birthYear, p.birthYear);
    }
}
