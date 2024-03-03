// Main class to demonstrate the usage of Animal and Lion classes
public class Main {
    public static void main(String[] args) {
        // Create a Lion object
        Lion lion = new Lion(30, false, 150, true);

        // Print out the attributes of the Lion object
        System.out.println("Number of teeth: " + lion.getNumTeeth());
        System.out.println("Has spots: " + lion.getHasSpots());
        System.out.println("Weight: " + lion.getWeight());
        System.out.println("Has a mane: " + lion.getHasMane());

        // Call the makeSound method on the Lion object
        lion.makeSound();
    }
}