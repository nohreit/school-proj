package prog_2.proj_1;

public class Employee extends Person {

    private String deptName;
    private static int numEmployees = 0;
    private final int employeeID;

    public Employee() {
        this("", 0, "");
    }

    public Employee(String dn) {
        this("", 0, dn);
    }

    public Employee(String name, int birthYear, String deptName) {
        super(name, birthYear);
        this.deptName = deptName;
        numEmployees++;
        this.employeeID = numEmployees;
    }

    public String getDeptName() {
        return deptName;
    }

    public static int getNumEmployees() {
        return numEmployees;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setDeptName(String dept) {
        this.deptName = dept;
    }

    @Override
    public boolean equals(Object p) {
        return (p instanceof Employee e) && super.equals(e) && deptName.equals(e.deptName)
                && employeeID == e.employeeID;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Employee: Department: %20s | Employee Number: %3d",
                getDeptName(), getEmployeeID());
    }

    @Override
    public int compareTo(Person p) {
        if (p instanceof Employee e) return Integer.compare(employeeID, e.employeeID);
        return super.compareTo(p);
    }
}
