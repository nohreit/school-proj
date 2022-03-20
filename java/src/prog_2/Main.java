package prog_2;

import prog_2.hw4.Infant;

public class Main {

    public static void main(String[] args) {
        Infant imCrying = new Infant();

        imCrying.addInfantToy("Hotwheels", 4);      // 0
        imCrying.addInfantToy("Barbie Doll", 1);    // 1
        imCrying.addInfantToy("Beyblade", 5);       // 2
        imCrying.addInfantToy("Yu Gi Oh!", 2);      // 3
        imCrying.addInfantToy("Pokemon", 3);        // 4
        imCrying.printDetails();
        System.out.println("Get toy: " + imCrying.getInfantToyAsString(2));
        System.out.println("Get toy: " + imCrying.getInfantToyAsString(5));
        System.out.println("Get toy: " + imCrying.getInfantToyAsString(-1));
        System.out.println("Get toy: " + imCrying.getInfantToyAsString(100));
        System.out.println("Get toy: " + imCrying.getInfantToyAsString(imCrying.getNumInfantToys()));
        System.out.println("Get the mvp: " + imCrying.getHighestInfantToyRating());

    }
}
