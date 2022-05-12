package prog_2.proj_1;

import java.util.Objects;

public class Course {

    private final boolean isGraduateCourse;
    private final int courseNum;
    private final String courseDept;
    private final int numCredits;

    public Course() {
        this.isGraduateCourse = false;
        this.courseNum = 0;
        this.courseDept = "";
        this.numCredits = 0;
    }

    public Course(boolean graduate, int num, String dept, int credits) {
        this.isGraduateCourse = graduate;
        this.courseNum = num;
        this.courseDept = dept;
        this.numCredits = credits;
    }

    public boolean isGraduateCourse() {
        return isGraduateCourse;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public String getCourseDept() {
        return courseDept;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public String getCourseName() {
        return (isGraduateCourse ? "G" : "U") + courseDept + courseNum;
    }

    public boolean equals(Object o) {
        return (o instanceof Course c && this.isGraduateCourse == c.isGraduateCourse
                && this.courseDept.equals(c.courseDept) && this.courseNum == c.courseNum
                && this.numCredits == c.numCredits);
    }

    public String toString() {
        return String.format("Course: %3s-%3d | Number of Credits: %02d | " +
                (isGraduateCourse ? "Graduate" : "Undergraduate"), courseDept, courseNum, numCredits);
    }

    public int compareTo(Course c) {
        return Integer.compare(courseNum, c.courseNum);
    }
}
