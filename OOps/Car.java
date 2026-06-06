package OOps;

public class Car{

    // properties of the class

    String Color;

    private String brand;

    String Model_name;

    int year;

    private int speed;

    //  behaviour of the class (methods)

    public void accelerate (int increment){
        speed += increment;
    }

    public void brake (int decrement){
        speed -= decrement;
        if (speed <0){
            speed =0;
        }
    }

// Create a Car class with:

// Private fields — brand, speed
// A constructor to set both
// A getter for both
// A setter for speed that only allows values between 0 and 300
    // constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        setSpeed(speed);  // use setter so validation runs
    }

    // getter for brand — returns value
    public String getBrand() {
        return brand;
    }

    // setter for brand — sets value
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // getter for speed — returns value
    public int getSpeed() {
        return speed;
    }

    // setter for speed — sets value with validation
    public void setSpeed(int speed) {
        if (speed >= 0 && speed < 301) {   // && not ||
            this.speed = speed;
        } else {
            System.out.println("Invalid speed!");
        }
    }


}