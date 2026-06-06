// ─── Car.java ────────────────────────────────────
package Inheritancess;

public class Car extends Vehicle {

    // Car's OWN field
    int numDoors;

    // CONSTRUCTOR — must call super() first to initialize parent fields
    Car(String brand, int speed, int numDoors) {
        super(brand, speed);       // calls Vehicle constructor
        this.numDoors = numDoors;
    }

    // OVERRIDE parent method
    @Override
    public
    void move() {
        System.out.println("Car  is moving on 4 wheels");
    }
}