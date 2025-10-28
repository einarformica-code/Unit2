package conditionals_english_exercises;
import java.util.Random;
/*
 * This class represents a Dot that can move and a Random Number Generator (RNG).
 /
public class DotAndRNG {
    private int x;
    private int y;
    private Random random;
/**
 * Constructor to initialize the Dot's position and the RNG.
 *
 * @param x The initial x-coordinate of the Dot.
 * @param y The initial y-coordinate of the Dot.
 */
public DotAndRNG(int x, int y) {
    this.x = x;
    this.y = y;
    this.random = new Random();
}

/**
 * Getter for the x-coordinate of the Dot.
 *
 * @return Returns the current x-coordinate of the Dot.
 */
public int getX() {
    return x;
}

/**
 * Getter for the y-coordinate of the Dot.
 *
 * @return Returns the current y-coordinate of the Dot.
 */
public int getY() {
    return y;
}

/**
 * Moves the Dot to a new position.
 *
 * @param newX The new x-coordinate of the Dot.
 * @param newY The new y-coordinate of the Dot.
 */
public void moveDot(int newX, int newY) {
    x = newX;
    y = newY;
}

/**
 * Generates a random number between a specified range.
 *
 * @param min The minimum value of the range (inclusive).
 * @param max The maximum value of the range (exclusive).
 * @return Returns a random number between min (inclusive) and max (exclusive).
 */
public int generateRandomNumber(int min, int max) {
    return random.nextInt(max - min) + min;
}

/**
 * Main method to demonstrate the usage of the Dot and RNG.
 *
 * @param args The command line arguments (not used).
 */
public static void main(String[] args) {
    // Create a Dot at position (0, 0)
    DotAndRNG dot = new DotAndRNG(0, 0);

    // Move the Dot to a new position (5, 3)
    dot.moveDot(5, 3);

    // Print the current position of the Dot
    System.out.println("Dot position: (" + dot.getX() + ", " + dot.getY() + ")");

    // Generate a random number between 1 and 10
    int randomNumber = dot.generateRandomNumber(1, 10);
    System.out.println("Random number: " + randomNumber);
}

}

	
	
	

