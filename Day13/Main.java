package Day13;

// import Day13.Day13.*;
import Day14.*;
public class Main {
    // Importing a package
    // N.B: classes, methods in the package you want to import should be set to public so they can be accessed
    //N.B: EVEN VARIABLES HAVE TO BE DECLARED AS PUBLIC TO BE ACCESSED

    public static void main(String[] args){
        
        Car importedCar = new Car();
        importedCar.startEngine();
        importedCar.speed= 750;

        importedCar.carMoving();

        // MyPackageClass importedMyPackageClass = new MyPackageClass();
        // System.out.println(packaged);
        // !!! Cant access String packaged from MyPackageClass, could not run the package either


        

    }
}
