package Day14;

 
 public class Car {
    public String color;
    public int speed;

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate() {
        speed += 10;
       // System.out.println("Accelerating. Current speed: " + speed);
    }
    public void carMoving() {
        System.out.println("The car is moving at " + speed + "km/h");
    }
}


