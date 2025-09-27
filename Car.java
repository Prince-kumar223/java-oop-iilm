public class Car {
    String colour;
    int speed;
    void drive() {
        System.out.println("The car is driving...");
    }

    // main method
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.colour = "red";
        myCar.speed = 60;

        // using methods and variables
        myCar.drive();
        System.out.println("Colour: " + myCar.colour);
        System.out.println("Speed: " + myCar.speed);
    }
}
