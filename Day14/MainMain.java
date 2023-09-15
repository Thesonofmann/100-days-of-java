package Day14;

public class MainMain {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.color = "Red";
            myCar.speed = 0;
    
            myCar.startEngine();
            myCar.accelerate();
    
            myCar.carMoving();
            myCar.accelerate();
        for (int i= 0; i<=5; i++){
            myCar.accelerate();
        }
        myCar.carMoving();
            
        }
    }
    