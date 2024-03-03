// Animal class representing a generic animal
public class Animal {
    // Encapsulated attributes for the animal
    private int numTeeth;
    private boolean hasSpots;
    private int weight;

    // Constructor for Animal class
    public Animal(int numTeeth, boolean hasSpots, int weight) {
        this.numTeeth = numTeeth;
        this.hasSpots = hasSpots;
        this.weight = weight;
    }

    // Getter for number of teeth
    public int getNumTeeth() {
        return numTeeth;
    }

    // Getter for has spots
    public boolean getHasSpots() {
        return hasSpots;
    }

    // Getter for weight
    public int getWeight() {
        return weight;
    }

    // Abstract method for making a sound
    public void makeSound() {
        // Abstract method has no implementation in the parent class
    }
}