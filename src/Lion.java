// Lion class representing a specific type of animal
public class Lion extends Animal {
    // Encapsulated attribute for has mane
    private boolean hasMane;

    // Constructor for Lion class
    public Lion(int numTeeth, boolean hasSpots, int weight, boolean hasMane) {
        // Call superclass constructor
        super(numTeeth, hasSpots, weight);
        this.hasMane = hasMane;
    }

    // Getter for has mane
    public boolean getHasMane() {
        return hasMane;
    }

    // Override the makeSound method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}