// ─── ElectricCar.java ────────────────────────────
package Inheritancess;

public class ElectricCar extends Car {

    // ElectricCar's OWN field
    int batteryLevel;

    // CONSTRUCTOR — calls Car constructor which calls Vehicle constructor
    ElectricCar(String brand, int speed, int numDoors, int batteryLevel) {
        super(brand, speed, numDoors);   // calls Car constructor
        this.batteryLevel = batteryLevel;
    }

    // OVERRIDE move()
    @Override
    public void move() {
        System.out.println("Electric car " + brand
            + " is moving silently. Battery: " + batteryLevel + "%");
    }
}