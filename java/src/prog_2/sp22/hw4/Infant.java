package prog_2.sp22.hw4;

public class Infant extends Person {

    private final InfantToy[] toys;
    private int numInfantToys;

    // This is the infant toy class
    private record InfantToy(String infantToyName, int infantToyRating) {
        public String toString() {
            return String.format("InfantToy: Toy Name: %20s | Rating: %d", infantToyName, infantToyRating);
        }
    }

    public Infant() {
        this("", 1900, 0.0, 0.0, 'u', 0, 0);
    }

    public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOffSpring) {
        super(name, birthYear, weight, height, gender, numCarryOn, 0);
        numInfantToys = 0;
        toys = new InfantToy[10];
    }

    public void addInfantToy(String infantToyName, int infantToyRating) {
        if (numInfantToys >= toys.length) System.out.println("can't add anymore toys!");
        else toys[numInfantToys++] = new InfantToy(infantToyName, infantToyRating);
    }

    public String getInfantToyAsString(int index) {
        return (checkIndex(index)) ? toys[index].toString() : "invalid index";
    }

    public int getNumInfantToys() {
        return numInfantToys;
    }

    public int getHighestInfantToyRating() {
        if (numInfantToys == 0) return 0;
        int highest = 0;
        for (int i = 0; i < numInfantToys; i++)
            highest = Math.max(highest, toys[i].infantToyRating);
        return highest;
    }

    public void printDetails() {
        super.printDetails();
        System.out.printf("Infant: Number of Toys: %4d | Infant Toys: \n", this.numInfantToys);
        for (int i = 0; i < numInfantToys; i++)
            System.out.println(toys[i].toString());
    }

    public String toString() {
        return super.toString();
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < numInfantToys;
    }
}
