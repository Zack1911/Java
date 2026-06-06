package OOps;

public class testCar {
    public static void main(String[] args) {
        // Car c = new Car();
        Car c = new Car("Tesla", 255);
        System.out.println(c.getBrand());  // Tesla
        System.out.println(c.getSpeed());  // 255

        c.setSpeed(400);                   // Invalid speed!
        c.setSpeed(100);
        System.out.println(c.getSpeed());  // 100
        // c.Color = "red";
        // c.brand = "BYD";
        // c.Model_name = "M34595L";
        // c.speed = 0;
        // c.year = 2025;

        // c.accelerate(1);
        // System.out.println(c.speed);






    }
}
