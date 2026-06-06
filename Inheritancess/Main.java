// ─── Main.java ───────────────────────────────────
package Inheritancess;

public class Main {

    public static void main(String[] args) {

        // Create objects
        Vehicle v = new Vehicle("Generic", 100);
        Car c = new Car("Tata", 120, 4);
        ElectricCar e = new ElectricCar("Tesla", 200, 4, 85);

        // Each calls their own version of move()
        v.move();  // Vehicle is moving
        c.move();  // Car Tata is moving on 4 wheels
        e.move();  // Electric car Tesla is moving silently. Battery: 85%

        // Car can use Vehicle's fields (inherited)
        System.out.println(c.brand);  // Tata
        System.out.println(c.speed);  // 120

        // ElectricCar can use both Car and Vehicle fields
        System.out.println(e.brand);        // Tesla
        System.out.println(e.numDoors);     // 4
        System.out.println(e.batteryLevel); // 85
    }
}

