/*
* This program is my Vehicle class.
*
* @author  Hsen Mansour
* @version 1.0
* @since   2021-12-014
*/

/**
* This is the Vehicle class program.
*/

public class Vehicle {

    /**
    * Color.
    */
    private String color = "Blue";

    /**
    * Number of doors.
    */
    private String nbdoors = "4 Doors";

    /**
    * Plate.
    */
    private int plate = 1;

    /**
    * Speed.
    */
    private int speed = 1;

    /**
    * Max Speed.
    */
    private int maxspeed = 1;

    /**
    * Accelerate.
    */
    private String accelerate;

    /**
    * Break.
    */
    private String brake;

    // --------------START------------------

    // License plate number.
    // Getter.

    public final int getPlate() {
        return plate;
    }

    // -------------------------------------

    // Vehicle Colour.
    // Getter

    public final String getColour() {
        return color;
    }

    // -------------------------------------

    // Number of doors.
    // Read only property.

    public final String getNbDoors() {
        return nbdoors;
    }

    // -------------------------------------

    // Speed of the Vehicle.
    // Read only property.

    public final int getSpeed() {
        return speed;
    }

    // -------------------------------------

    // Max speed of the Vehicle.
    // Read only property.

    /**
    * Method maxspeed.
    *
    * @return maxspeed.
    */

    public final int maxSpeed() {
        return maxspeed;
    }

    // -------------------------------------

    // Accelerate the Vehicle.
    // Setter.
    // Constructor.

    public final void setAccelerate(String accelerate) {
        this.accelerate = accelerate;
    }

    // Accelerate the Vehicle.
    // Getter.

    public final String getAccelerate() {
        return accelerate;
    }

    // -------------------------------------

    // Break.
    // Setter.
    // Constructor.

    public final void setBrake(String brake) {
        this.brake = brake;
    }

    // Break.
    // Getter.

    public final String getBreak() {
        return brake;
    }

    // ---------------DONE------------------
}
