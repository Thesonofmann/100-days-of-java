public class Day3 {
    public static void main(String[] args){

    //Learning Classes and Objects in Java
            Lens lensOne = new Lens(
                "Sony",
                "XNM 2022",
                "black",
                15.50,
                136777.89,
                "85mm",
                true);
    
    
                System.out.println("Lens 1");
                System.out.println(lensOne.brand);
                System.out.println(lensOne.model);
                System.out.println(lensOne.color);
                System.out.println(lensOne.weight);
                System.out.println("$" + lensOne.price);
                System.out.println(lensOne.focalLength);
                System.out.println(lensOne.isPrime);
        }
        static class Lens {
            String brand;
            String focalLength;
            boolean isPrime;
            String model;
            String color;
            double weight;
            double price;
    
    
    
            Lens(String brand, 
                 String model,
                 String color,
                 double weight,
                 double price,
                 String focalLength,    
                 boolean isPrime) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.price = price;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
            this.model = model;
    
                
        }
    
    }
    
}
