package prog_2.proj_1;

public class Student extends Person {
    private final int MAX = 50;
    private static int numStudents;
    private final int studentID;
    private final Course[] coursesTaken;
    private int numCoursesTaken;
    private boolean isGraduate;
    private String major;

    public Student() {
        this("", 0, "", false);
    }

    public Student(boolean graduate) {
        this("", 0, "", graduate);
    }

    public Student(String major, boolean graduate) {
        this("", 0, major, graduate);
    }

    public Student(String name, int by, String major, boolean graduate) {
        super(name, by);
        coursesTaken = new Course[MAX];
        this.numCoursesTaken = 0;
        setIsGraduate(graduate);
        setMajor(major);
        numStudents++;
        this.studentID = numStudents;
    }

    //returns false it should have been true
    public boolean isGraduate() {
        return this.isGraduate;
    }

    //error return "0" it should have been equal to 0
    public int getNumCoursesTaken() {
        return this.numCoursesTaken;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setIsGraduate(boolean graduate) {
        this.isGraduate = graduate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourseTaken(Course course) {
        if (isValid(numCoursesTaken)) coursesTaken[numCoursesTaken++] = course;
    }

    public void addCoursesTaken(Course[] courses) {
        for (Course course : courses) addCourseTaken(course);
    }

    public Course getCourseTaken(int index) {
        if (isValid(index)) return coursesTaken[index];
        return null;
    }

    public String getCourseTakenAsString(int index) {
        return getCourseTaken(index).toString();
    }

    public String getAllCoursesTakenAsString() {
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < numCoursesTaken; i++)
            t.append(getCourseTakenAsString(i)).append(i != numCoursesTaken ? "," : "");
        return t.toString();
    }

    public boolean isValid(int index) {
        return index >= 0 && index < MAX;
    }

    @Override
    public boolean equals(Object p) {
        return (p instanceof Student s) && (super.equals(s)) && (this.studentID == s.studentID) && (this.numCoursesTaken == s.numCoursesTaken) && (this.isGraduate == s.isGraduate) && (this.major.equals(s.major)) && (this.coursesTaken == s.coursesTaken);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | " +
                "Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, (isGraduate() ?
                "Graduate" : "Undergraduate"), numCoursesTaken, getAllCoursesTakenAsString());
    }

    @Override
    public int compareTo(Person p) {
        int sumThis = 0;
        int sumS = 0;
        if (p instanceof Student s) {
            for (int i = 0; i < numCoursesTaken; i++)
                sumThis += coursesTaken[i].getNumCredits();
            for (int i = 0; i < s.numCoursesTaken; i++)
                sumS += s.coursesTaken[i].getNumCredits();
        }
        return Integer.compare(sumThis, sumS);
    }
}
