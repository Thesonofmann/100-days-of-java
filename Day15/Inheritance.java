package Day15;

//Superclass 
class Main{
    //Attributes of superclass
    protected String brand;
    private String model;
    String color;
    private int modelYear = 2016;
  
    //Constructor
    public Main(){
    // this.model= model;
    model = "Lexus";
    brand = "RX350";
    // this.color = color;
    color = "black";
    // this.modelYear = modelYear;
    modelYear= 2016;
}


    // super class methods
    public String honk(){
        String t = "Tuuut, tuut";
        return t;
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
    private String horn;

    public Subclass() {
        horn = "Pimm Pimm";
     //  super(model, color, modelYear);
        //TODO Auto-generated constructor stub
    }
public String subhonk() {
    return super.honk() +" " + horn;
}
    

}
public class Inheritance{
    public static void main(String[] args){

    Subclass subclassObject = new Subclass();
    // subclassObject.brand = "RAV4";
    subclassObject.carType();
    System.out.println(subclassObject.getModel());
    subclassObject.getModelYear();
    System.out.println(subclassObject.honk());
    System.out.println(subclassObject.subhonk());
   //  Main superclass = new Main("Lexus", "black", 2016);


    }
    
}

