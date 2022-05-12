package prog_2.midterm;

public class Patient {

    private static int numPatients = 0;
    private String name;
    private int birthYear;
    private int patientNumber;
    private String ailment;

    public Patient(String name, int birthYear, String ailment) {
        patientNumber = ++numPatients;
        this.name = name;
        this.birthYear = Math.max(birthYear, 0);
        this.ailment = ailment;
    }

    public static int getNumPatients() {
        return numPatients;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public String getAilment() {
        return ailment;
    }

    @Override
    public String toString() {
        return String.format("Patient [name= %20s | birthYear= %04d | patient number= %06d | ailment= %20s]\n",
                name, birthYear, patientNumber, ailment);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Patient p) && name.equals(p.name) && (birthYear == p.birthYear) &&
                this.ailment.equals(p.ailment);
    }


}
