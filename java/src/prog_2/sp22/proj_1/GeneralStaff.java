package prog_2.sp22.proj_1;

public class GeneralStaff extends Employee {

    private final String duty;

    public GeneralStaff() {
        this("", 0, "", "");
    }

    public GeneralStaff(String duty) {
        this("", 0, "", duty);
    }

    public GeneralStaff(String dn, String duty) {
        this("", 0, dn, duty);
    }

    public GeneralStaff(String name, int by, String dn, String duty) {
        super(name, by, dn);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    @Override
    public boolean equals(Object p) {
        return (p instanceof GeneralStaff g) && (super.equals(g)) && duty.equals(g.duty);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" GeneralStaff: Duty: %10s", getDuty());
    }
}
