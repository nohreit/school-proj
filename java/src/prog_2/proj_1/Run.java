package prog_2.proj_1;

import prog_2.hw6.ReadAndEditFile;

import java.net.URL;

public class Run {
    private static final String SCHOOL_DB = "SchoolDB_Initial.txt";

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        new Driver_SchoolDB().readAndFromFile(loadFile());
    }

    private static URL loadFile() { // get the file
        return Run.class.getResource(SCHOOL_DB);
    }
}
