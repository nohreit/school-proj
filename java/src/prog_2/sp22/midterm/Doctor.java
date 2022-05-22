package prog_2.sp22.midterm;


public class Doctor implements SeesPatients, Comparable<Doctor> {

    private static int numDoctors = 0; //increment inside the constructor
    private String name;
    private int licenseNumber;
    private Patient[] patients;
    private int numOfPatients;

    public Doctor(String name) {
        this.name = name;
        licenseNumber = numDoctors++;
        patients = new Patient[MAX_PATIENTS];
        numOfPatients = 0;
    }

    public static int getNumDoctors() {
        return numDoctors;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPatients() {
        return this.numOfPatients;
    }

    @Override
    public String toString() {
        return String.format("Doctor: name= %20s | license number= %06d | %s", name, licenseNumber, getPatientsAsString());
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Doctor d && name.equals(d.name) && getNumberOfPatients() == d.getNumberOfPatients());
    }

    @Override
    public int compareTo(Doctor d) {
        if (numOfPatients > d.numOfPatients) return 1;
        else if (numOfPatients < d.numOfPatients) return -1;
        return 0;
    }

    @Override
    public void addPatient(Patient p) throws PatientException {
        if (numOfPatients < MAX_PATIENTS) patients[numOfPatients++] = p;
        else throw new PatientException();
    }

    @Override
    public Patient[] getPatients() {
        return patients;
    }

//    @Override
//    public String getPatientsAsString() {
//        StringBuilder patients = new StringBuilder("patients= ");
//        for (int i = 0; i < numOfPatients; i++) {
//            patients.append(this.patients[i].toString()).append(i != (this.numOfPatients - 1) ? ", " : "");
//        }
//        return patients.toString();
//    }

    @Override
    public String getPatientsAsString() {
        String str = "patients= ";
        for (int i = 0; i < numOfPatients; i++) {
            str += patients[i].toString();

            if (i < (numOfPatients - 1)) {
                str += ", ";
            }
        }
        return str;
    }

    @Override
    public boolean isPatient(Patient p) {
        for (int i = 0; i < numOfPatients; i++)
            if (patients[i].equals(p))
                return true;
        return false;
    }
}
