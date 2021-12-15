/*
* This program is the Main for my Vehicle class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-07
*/

import java.util.Scanner;

/**
* This is the Main class program.
*/
final class Main {
    /**
    * Space.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Vehicle classVeh = new Vehicle();

        // Vehicle start.
        System.out.print("Vehicle Menu: " + SPACE);

        // License plate number.
        final int result = classVeh.getPlate();
        // Display the value of the private properties.
        System.out.println(SPACE + "License plate number: " + result);

        // Vehicle Colour.
        final String resultt = classVeh.getColour();
        // Display the value of the private properties.
        System.out.println(SPACE + "Vehicle Colour: " + resultt);

        // Number of doors.
        final String res = classVeh.getNbDoors();
        // Display the value of the private properties.
        System.out.println(SPACE + "Number of Doors: " + res);

        // Speed of the Vehicle.
        final int ress = classVeh.getSpeed();
        // Display the value of the private properties.
        System.out.println(SPACE + "Speed of the Vehicle: " + ress);

        // Max speed of the Vehicle.
        final int ree = classVeh.maxSpeed();
        // Display the value of the private properties.
        System.out.println(SPACE + "Max speed of the Vehicle: " + ree);

        // User Input.
        final Scanner myObj = new Scanner(System.in);
        System.out.print(SPACE + "Break (yes or no): ");
        final String userInput = myObj.nextLine();
        // Break.
        final String yes = "yes";
        final String no = "no";
        final String invip = "Invailed Input!";
        if (userInput.equals(yes)) {
            System.out.println(SPACE + "Breaking..." + SPACE);
            classVeh.setBrake(userInput);
            System.out.println(classVeh.getBreak());
        } else if (userInput.equals(no)) {
            System.out.println(SPACE + "No Breaking..." + SPACE);
        } else {
            System.out.println(SPACE + invip + SPACE);
        }
        // User Input.
        final Scanner myObjj = new Scanner(System.in);
        System.out.print(SPACE + "Accelerate (yes or no): ");
        final String userInputt = myObjj.nextLine();
        // Accelerate.
        if (userInputt.equals(yes)) {
            System.out.println(SPACE + "Accelerating..." + SPACE);
            classVeh.setAccelerate(userInputt);
            System.out.println(classVeh.getAccelerate());
        } else if (userInputt.equals(no)) {
            System.out.println(SPACE + "No Accelerating..." + SPACE);
        } else {
            System.out.println(SPACE + invip + SPACE);
        }
        // Done.
        System.out.print(SPACE + "Done." + SPACE);
    }
}
