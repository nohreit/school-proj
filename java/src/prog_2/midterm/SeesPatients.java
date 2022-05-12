package prog_2.midterm;

public interface SeesPatients {
	
	int MAX_PATIENTS = 100;
	void addPatient(Patient p) throws PatientException;
	Patient [] getPatients();
	String getPatientsAsString();
	boolean isPatient(Patient p);


}
