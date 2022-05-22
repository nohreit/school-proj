package prog_2.sp22.proj_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver_SchoolDB {

    public ArrayList<Course> courses = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();
    public ArrayList<Faculty> faculties = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<GeneralStaff> generalStaffs = new ArrayList<>();
    public ArrayList<Person> persons = new ArrayList<>();

    public void readAndFromFile(URL fileName) {
        Scanner reader = null;
        try {
            File file = new File(fileName.getFile());
            reader = new Scanner(file);

            if (file.exists() && file.canRead()) {
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    System.out.println(line);

                    // Check if data exist for that line. If not set an empty string.
                    String data = ((line.split(":").length > 1) ? line.split(":")[1] : "")
                            .trim().replace(", ", ",");

                    if (line.startsWith("Course")) {
                        courses.add(createCourse(data));
                    } else if (line.startsWith("Student")) {
                        students.add(createStudent(data));
                    } else if (line.startsWith("Faculty")) {
                        faculties.add(createFaculty(data));
                    } else if (line.startsWith("Employee")) {
                        employees.add(createEmployee(data));
                    } else if (line.startsWith("GeneralStaff")) {
                        generalStaffs.add(createGeneralStaff(data));
                    } else if (line.startsWith("Person")) {
                        persons.add(createPerson(data));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot read from file " + fileName.getFile());
            e.printStackTrace();
        } finally {
            if (reader != null) reader.close();
        }

        writeInFile(printSchoolDB(courses, persons, employees, generalStaffs, faculties, students));
    }

    private static final String MAIN_DIR = System.getProperty("user.dir");


    private void writeInFile(String printSchoolDB) {
        System.out.println(printSchoolDB);
        try {
            String filename = "SchoolDB_Output.txt";
            File file = new File(MAIN_DIR + "/src/prog_2/proj_1/" + filename);
            System.out.println(file.createNewFile() ? "\n\nFile created: "
                    + file.getName() : "\n\nFile already exists!");
            FileWriter writer = new FileWriter(file);
            writer.write(printSchoolDB);
            System.out.println("Data written on " + file.getName());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred. File cannot be created or data cannot be written on");
            e.printStackTrace();
        }
    }

    private String printSchoolDB(ArrayList<Course> courses, ArrayList<Person> persons, ArrayList<Employee> employees,
                                 ArrayList<GeneralStaff> generalStaffs, ArrayList<Faculty> faculties,
                                 ArrayList<Student> students) {

        StringBuilder cStr = new StringBuilder(), fStr = new StringBuilder(), eStr = new StringBuilder(), gStr = new StringBuilder(), sStr = new StringBuilder(), pStr = new StringBuilder();

        for (Course course : courses) cStr.append(course).append("\n");
        for (Person person : persons) pStr.append(person).append("\n");
        for (Employee employee : employees) eStr.append(employee).append("\n");
        for (GeneralStaff generalStaff : generalStaffs) gStr.append(generalStaff).append("\n");
        for (Faculty faculty : faculties) fStr.append(faculty).append("\n");
        for (Student student : students) sStr.append(student).append("\n");

        return """
                **************************************************************
                SCHOOL DATABASE INFO:
                **************************************************************
                COURSES:
                """ +
                cStr +
                addStars() +
                """
                        PERSONS:
                        """ +
                pStr +
                addStars() +
                """
                        EMPLOYEES:
                        """ +
                eStr +
                addStars() +
                """
                        GENERAL STAFFS:
                        """ +
                gStr +
                addStars() +
                """
                        FACULTY:
                        """ +
                fStr +
                addStars() +
                """
                        STUDENTS:
                        """ +
                sStr +
                addStars();
    }

    private String addStars() {
        return """
                **************************************************************
                **************************************************************
                """;
    }

    private Course createCourse(String data) {
        if (data.isEmpty()) return new Course();
        String[] courseData = data.split(",");
        boolean isGraduate = Boolean.parseBoolean(courseData[0]);
        int numberCourse = Integer.parseInt(courseData[1]);
        String nameCourse = courseData[2];
        int credit = Integer.parseInt(courseData[3]);
        return new Course(isGraduate, numberCourse, nameCourse, credit); // add a course in the list
    }

    private Student createStudent(String data) { // I am sure there will be a problem here with null pointer or size = 0
        if (data.isEmpty()) return new Student();
        String[] studentData = data.split(",");
        if (studentData.length == 1) return new Student(Boolean.parseBoolean(studentData[0]));
        if (studentData.length == 2) return new Student(studentData[0], Boolean.parseBoolean(studentData[1]));
        return new Student(studentData[0], Integer.parseInt(studentData[1]), studentData[2], Boolean.parseBoolean(studentData[3]));
    }

    private Faculty createFaculty(String data) {
        if (data.isEmpty()) return new Faculty();
        String[] facultyData = data.split(",");
        if (facultyData.length == 1) return new Faculty(Boolean.parseBoolean(facultyData[0]));
        if (facultyData.length == 2) return new Faculty(facultyData[0], Boolean.parseBoolean(facultyData[1]));
        return new Faculty(facultyData[0], Integer.parseInt(facultyData[1]), facultyData[2], Boolean.parseBoolean(facultyData[3]));
    }

    private Employee createEmployee(String data) {
        if (data.isEmpty()) return new Employee();
        String[] employeeData = data.split(",");
        if (employeeData.length == 1) return new Employee(employeeData[0]);
        return new Employee(employeeData[0], Integer.parseInt(employeeData[1]), employeeData[2]);
    }

    private GeneralStaff createGeneralStaff(String data) {
        if (data.isEmpty()) return new GeneralStaff();
        String[] genStaffData = data.split(",");
        if (genStaffData.length == 1) return new GeneralStaff(genStaffData[0]);
        if (genStaffData.length == 2) return new GeneralStaff(genStaffData[0], genStaffData[1]);
        return new GeneralStaff(genStaffData[0], Integer.parseInt(genStaffData[1]), genStaffData[2], genStaffData[3]);
    }

    private Person createPerson(String data) {
        if (data.isEmpty()) return new Person();
        String[] personData = data.split(",");
        return new Person(personData[0], Integer.parseInt(personData[1]));
    }
}



