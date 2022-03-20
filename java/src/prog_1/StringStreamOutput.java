package prog_1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class StringStreamOutput { // A copy-paste from the course platform. Only filled the while-loop
    public static void run() {
        Scanner inSS = new Scanner(System.in);
        String userItem, firstName, lastName;
        int userAge;

        StringWriter itemCharStream = new StringWriter();
        PrintWriter itemsOSS = new PrintWriter(itemCharStream);

        System.out.println("Enter items (type Exit to quit):");
        userItem = inSS.next();

        while (!userItem.equals("Exit")) {

            /* Your solution goes here  */
            firstName = inSS.next();
            lastName = inSS.next();
            userAge = inSS.nextInt();

            userItem = inSS.next();
        }

        userItem = itemCharStream.toString();
        System.out.println(userItem);
    }
}
