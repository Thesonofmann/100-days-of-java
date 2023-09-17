package Day15;

import Day12.Stringmethod;

//Superclass 
class Main{
    //Attributes of superclass
    protected String brand;
    private String model;
    String color;
    private int modelYear = 2016;
  
    //Constructor
    public Main(String model, String color, int modelYear){
    this.model= model;
    model = "Lexus";
    this.color = color;
    color = "black";
    this.modelYear = modelYear;
    modelYear= 2016;
}


    // super class methods
    public void honk(){
        System.out.println("Tuuut, tuut");
    }
    public void carType(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(modelYear);
    }
    
    // Encapsulation methods(get and set for private attributes)
    public int getModelYear() {
        return modelYear;
    }
    public void setmodelYear(int modelYear){
        this.modelYear= modelYear;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }


}

class Subclass extends Main{
    public Subclass(String model, String color, int modelYear) {
        super(model, color, modelYear);
        //TODO Auto-generated constructor stub
    }

    private int d;
}
public class Inheritance{
    public static void main(String[] args){

    Inheritance subclassObject = new Inheritance();
    subclassObject.carType();
    }
    
}

