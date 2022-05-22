package prog_2;

import prog_2.sp22.end.Car;
import prog_2.sp22.end.InvalidDriverException;
import prog_2.sp22.end.Person;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InvalidDriverException {
//        Infant imCrying = new Infant();
//
//        imCrying.addInfantToy("Hotwheels", 4);      // 0
//        imCrying.addInfantToy("Barbie Doll", 1);    // 1
//        imCrying.addInfantToy("Beyblade", 5);       // 2
//        imCrying.addInfantToy("Yu Gi Oh!", 2);      // 3
//        imCrying.addInfantToy("Pokemon", 3);        // 4
//        imCrying.printDetails();
//        System.out.println("Get toy: " + imCrying.getInfantToyAsString(2));
//        System.out.println("Get toy: " + imCrying.getInfantToyAsString(5));
//        System.out.println("Get toy: " + imCrying.getInfantToyAsString(-1));
//        System.out.println("Get toy: " + imCrying.getInfantToyAsString(100));
//        System.out.println("Get toy: " + imCrying.getInfantToyAsString(imCrying.getNumInfantToys()));
//        System.out.println("Get the mvp: " + imCrying.getHighestInfantToyRating());
//        String[] array = {
//                "I", "didn't", "get", "an", "error", "it", "just", "shows", "that", "some", "of", "the", "list", "of",
//                "strings", "they", "used", "didnt", "search", "correctly"
//        };
//
//        System.out.println(SortingAlgorithm.binarySearch("correctly", array));

        Car[] cars = new Car[10];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(0, 0);
        }

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            if (i == 2) {
                people[i] = new Person("Person_" + i, true, (i + 1) * 2, (int) ((i + 25) * 1.5));
                i++;
            }
            people[i] = new Person("Person_" + i, false, (i + 1) * 2, (int) ((i + 25) * 1.5));
        }


        System.out.println(Arrays.toString(people));
        System.out.println();

//        cars[0].loadPassengers(people);
        cars[0].setDriver(people[2]);

//        System.out.println(cars[0]);
//        System.out.println(Arrays.toString(cars[0].getPeopleInRow(0)));
//        System.out.println(cars[0].getNumDoors() + ":"+cars[0].getNumWindows());

    }
}
