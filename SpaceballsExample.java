// Base class for characters
class SpaceballsCharacter {
    String name;
    String role;

    // Constructor to initialize the character's name and role
    public SpaceballsCharacter(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Method to display basic information about the character
    public void displayInfo() {
        System.out.println("Character: " + name + ", Role: " + role);
    }
}

// Hero subclass that inherits from SpaceballsCharacter
class Hero extends SpaceballsCharacter {
    String specialAbility;

    // Constructor for Hero class
    public Hero(String name, String specialAbility) {
        super(name, "Hero");
        this.specialAbility = specialAbility;
    }

    // Method to display hero's special ability
    public void displayAbility() {
        System.out.println(name + "'s Special Ability: " + specialAbility);
    }
}

// Main class to demonstrate inheritance and exception handling
public class SpaceballsExample {
    public static void main(String[] args) {
        // Create a Hero object
        Hero loneStarr = new Hero("Lone Starr", "Schwartz");

        // Display information and special ability
        loneStarr.displayInfo();
        loneStarr.displayAbility();

        // Demonstrate handling of an exception
        try {
            // Simulated scenario that may cause an error
            int speed = Integer.parseInt("ludicrous");  // Non-numeric string
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage() + ". Please input a valid number for speed.");
        }
    }
}
