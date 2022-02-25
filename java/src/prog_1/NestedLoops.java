package prog_1;

public class NestedLoops {

    public static void main(String[] args) {



//        Scanner scnr = new Scanner(System.in);
/*        int currentRow;
        int numRows = scnr.nextInt();
        char currentColumnLetter = 'A';

        int currentColumn;
        int numColumns = scnr.nextInt();

        for (currentRow = 1; currentRow <= numRows; currentRow++) {
            for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
                System.out.print(currentRow);
                System.out.print(currentColumnLetter + "");
                currentColumnLetter++;
            }
            currentColumnLetter = 'A';
            System.out.println();
        }

        int stop;
        int result;
        int n;

        stop = scnr.nextInt(); // 8
        result = 0;

        for (n = 0; n < 10; ++n) {                  //  n = 0; 2 < 10; n = 2
            result += n * 4;                        //  result = 4 + 2 * 4 = 12
            if (result > stop) {                    //  12 > 8
                System.out.println("n=" + n);       //  n = 2 if true
                break;                              // break
            }
            System.out.println(result);             //  0 4
        }

        int result;
        int n;

        result = 0;

        for (n = 0; n < 8; ++n) {           // n = 0; 3 < 8; 4
            result = n + 4;                 // result = 3 + 4 = 7
            if ((result % 2) != 0) {        // 6 % 2 != 0 => true
                System.out.print("_");      // __
                continue;                   //
            }
            System.out.print(result);       // 46
        }
        System.out.println();
        int result;
        int a = 5;
        int b = 23;
        int c = 20;

        a = scnr.nextInt();
        b = scnr.nextInt();
        c = scnr.nextInt();

        result = 0;

        while (a < b) {
            result = a * 2;
            System.out.println(result);
            if (result > c) {
                break;
            }
            a += 5;
        }
        int result;
        int stop = 11;
        int a;
        int b;

        stop = scnr.nextInt();
        result = 0;

        for (a = 3; a < 6; ++a) {
            for (b = 0; b < 5; ++b) {
                result += a;
                System.out.println(result);
                if (result > stop) {
                    break;
                }
            }
            if (result > stop) {
                break;
            }
        }//*/
    }
}
