package prog_2.sp22.proj_1;

public class Faculty extends Employee {

    private final Course[] coursesTaught;
    private int numCoursesTaught; //controlled variable
    private boolean isTenured;

    public Faculty() {
        this(false);
    }

    public Faculty(boolean t) {
        this("", t);
    }

    public Faculty(String deptName, boolean t) {
        this("", 0, deptName, t);
    }

    public Faculty(String name, int by, String dn, boolean t) {
        super(name, by, dn);
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = t;
    }

    public boolean isTenured() {
        return this.isTenured;
    }

    public int getNumCoursesTaught() {
        return numCoursesTaught;
    }

    public void setIsTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }

    public void addCourseTaught(Course course) {
        if (isValid(numCoursesTaught)) coursesTaught[numCoursesTaught++] = course;
    }

    public void addCoursesTaught(Course[] courses) {
        for (Course course : courses) addCourseTaught(course);
    }

    public Course getCourseTaught(int index) {
        return isValid(index) ? coursesTaught[index] : null;
    }

    public String getCourseTaughtAsString(int index) {
        return getCourseTaught(index).toString();
    }

    public String getAllCoursesTaughtAsString() {
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < numCoursesTaught; i++)
            t.append(getCourseTaughtAsString(i)).append(i != numCoursesTaught ? "," : "");
        return t.toString();
    }

    public boolean isValid(int index) {
        return index >= 0 && index < 100;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Faculty f) && super.equals(f) && (this.coursesTaught == f.coursesTaught)
                && (this.numCoursesTaught == f.numCoursesTaught) && this.isTenured == f.isTenured;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s",
                (isTenured() ? "Is Tenured" : "Not Tenured"), getNumCoursesTaught(), getAllCoursesTaughtAsString());
    }

    @Override
    public int compareTo(Person p) {
        if (p instanceof Faculty f) return Integer.compare(numCoursesTaught, f.numCoursesTaught);
        return super.compareTo(p);
    }

}
