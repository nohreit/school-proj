package prog_2.sp22.midterm;


public class Pediatrician extends Doctor {
    private boolean hasPrivatePractice;
    private String hospitalName;


    public Pediatrician(String name) {
        this(name, false, "");
    }

    public Pediatrician(String name, boolean hasPrivatePractice, String hospitalName) {
        super(name);
        this.hasPrivatePractice = hasPrivatePractice;
        this.hospitalName = hospitalName;
    }

    public boolean hasPrivatePractice() {
        return hasPrivatePractice;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String name) {
        this.hospitalName = name;
    }

    @Override
    public void addPatient(Patient p) throws PatientException {
        if ((2022 - p.getBirthYear()) < 18 && getNumberOfPatients() < getPatients().length) super.addPatient(p);
    }


    //    @Override
//    public String toString() {
//        return super.toString() + String.format("\nPediatrician: %s | hospital name= %15s",
//                (hasPrivatePractice ? "has private practice" : "does not have private practice"), hospitalName);
//    }
    @Override
    public String toString() {
        String str = "";
        if (hasPrivatePractice) {
            str = "has private practice";
        } else {
            str = "does not have private practice";
        }
        return super.toString() + String.format("\nPediatrician: %s | hospital name= %15s", str, hospitalName);

    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Pediatrician p) && (super.equals(p)) && (hasPrivatePractice == p.hasPrivatePractice)
                && (this.hospitalName.equals(p.hospitalName));
    }

    @Override
    public Patient[] getPatients() {
        return super.getPatients();
    }

    @Override
    public String getPatientsAsString() {
        return super.getPatientsAsString();
    }


    @Override
    public boolean isPatient(Patient p) {
        return super.isPatient(p);
    }
}
