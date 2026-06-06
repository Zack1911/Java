// ─── Vehicle.java ───────────────────────────────
package Inheritancess;

public class Vehicle {

    // FIELDS — directly inside class, NOT inside any method
    String brand;
    int speed;

    // CONSTRUCTOR — initializes the object
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // METHOD — behaviour of Vehicle
    public
    void move() {
      //  System.out.println("Vehicle is moving");
    }
}