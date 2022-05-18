package prog_1.sp21.hw8;

import java.awt.*;

public class Farm {
    private String farmName;
    private int numAnimals;
    private Animal[] animals;


    public Farm() {
        this("", 10);
    }

    public Farm(String farmName) {
        this(farmName, 10);
    }

    public Farm(int maxAnimal) {
        this("", maxAnimal);
    }

    public Farm(String name, int maxAnimal) {
        this.farmName = name;
        this.numAnimals = 0;
        if (maxAnimal < 0) maxAnimal = 0;
        this.animals = new Animal[maxAnimal];
    }

    public void addAnimal(Animal a) { //this
        if (numAnimals >= animals.length)
            resizeAnimalArray();
        animals[numAnimals++] = a;
    }

    private void resizeAnimalArray() {
        if (this.animals.length == 0)
            this.animals = new Animal[1];
        else {
            Animal[] temp = this.animals;
            this.animals = new Animal[this.animals.length * 2];
            System.arraycopy(temp, 0, this.animals, 0, temp.length);
        }
    }

    public String getFarmName() {
        return this.farmName;
    }

    public void setFarmName(String s) {
        this.farmName = s;
    }

    public Animal getAnimal(int index) {
        return (index < 0 || index >= numAnimals) ? null : animals[index];
    }

    public int getNumAnimals() {
        return this.numAnimals;
    }

    public Animal getFirstAnimal() {
        return this.animals[0];
    }

    public Animal getLastAnimal() {
        return this.animals[numAnimals - 1];
    } // this

    public Animal[] getAnimals() {
        return animals;
    }

    public void printAllDetails() {
        System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n",
                this.farmName, this.numAnimals, this.animals.length);
        for (int i = 0; i < this.numAnimals; i++) {
            animals[i].printDetails();
        }
    }


    public Animal removeAnimal(int index) { //this
        if (index < 0 || index >= animals.length) return null;

        Animal removed = animals[index]; // removed animal
        numAnimals--;

        if (index == numAnimals) animals[index] = null;// check if it is the last animal then remove it.
        else System.arraycopy(animals, index + 1, animals, index, numAnimals - index);

        return removed;
    }

    public void removeAllAnimals() {
        animals = new Animal[0];
        numAnimals = 0;
    }

    public double getTotalWeightOfAllAnimals() {
        double total = 0;
        for (int i = 0; i < numAnimals; i++) {
            total += animals[i].getWeight();
        }
        return total;
    }

    public double getAverageWeightOfAllAnimals() {
        return getTotalWeightOfAllAnimals() / numAnimals;
    }

    public int getNumberOfAnimalsAboveWeight(double check) {
        int count = 0;
        for (int i = 0; i < numAnimals; i++) {
            if (animals[i].getWeight() > check)
                count++;
        }
        return count;
    }


    public int getNumberOfAnimalsBelowWeight(double check) {
        int count = 0;
        for (int i = 0; i < numAnimals; i++) {
            if (animals[i].getWeight() < check)
                count++;
        }
        return count;
    }

    public void increaseWeightOfAllAnimals() {
        increaseWeightOfAllAnimals(1);
    }

    public void increaseWeightOfAllAnimals(double extra) {
        for (int i = 0; i < numAnimals; i++) {
            animals[i].gainWeight(extra);
        }
    }

}
