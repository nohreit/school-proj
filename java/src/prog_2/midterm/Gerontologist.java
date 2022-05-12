package prog_2.midterm;

public class Gerontologist extends Doctor {
    private boolean performsHouseCalls;//default
    private double visitFee;

    public Gerontologist(String name) {
        this(name, true, 0.0);
    }

    public Gerontologist(String name, boolean calls, double fee) {
        super(name);
        this.performsHouseCalls = calls;
        setVisitFee(fee);
    }

    public boolean performsHouseCalls() {
        return performsHouseCalls;
    }

    public double getVisitFee() {
        return visitFee;
    }

    public void setPerformsHouseCalls(boolean calls) {
        performsHouseCalls = calls;
    }

    public void setVisitFee(double money) {
        this.visitFee = Math.max(money, 0.0);
    }


    @Override
    public void addPatient(Patient p) throws PatientException {
        if ((2022 - p.getBirthYear()) > 65) super.addPatient(p);
    }
//
//    @Override
//    public String toString() {
//        return super.toString() + String.format("\nGerontologist: %s | visit fee= %02.2f",
//                (performsHouseCalls ? "performs house calls" : "no house calls"), visitFee);
//    }

    @Override
    public String toString() {
        String str = "";
        if (performsHouseCalls) {
            str = "performs house calls";
        } else {
            str = "no house calls";
        }
        return super.toString() + String.format("\nGerontologist: %s | visit fee= %02.2f", str, visitFee);

    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Gerontologist g) && (super.equals(g)) && (Math.abs(this.visitFee - g.visitFee) < 0.5)
                && (this.performsHouseCalls == g.performsHouseCalls);
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
