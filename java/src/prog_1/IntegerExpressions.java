package prog_1;

import java.util.Scanner;

public class IntegerExpressions {

    public static void run(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int firstInt, secondInt, thirdInt, firstResult, secondResult, thirdResult;

        System.out.println("Enter firstInt: ");
        firstInt = scnr.nextInt();

        System.out.println("Enter secondInt: ");
        secondInt = scnr.nextInt();

        System.out.println("Enter thirdInt: ");
        thirdInt = scnr.nextInt();

        firstResult = (firstInt + secondInt) / thirdInt;
        secondResult = (secondInt * thirdInt) / (secondInt + firstInt);
        thirdResult = (firstInt * thirdInt) % secondInt;

        System.out.println("First Result = " + firstResult);
        System.out.println("Second Result = " + secondResult);
        System.out.println("Third Result = " + thirdResult);
    }
}
