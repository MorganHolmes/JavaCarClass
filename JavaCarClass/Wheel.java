
public class Wheel
{
    // instance variables - replace the example below with your own
    private double width;
    private int offset;
    private int size;
    private String make;
    private String model;
    private Tyre tyre;

    /**
     * Constructor for objects of class Wheel
     */
    public Wheel()
    {
        model = "Not Set";
        make = "Not Set";
        width = 0.0;
        offset = 0;
        size = 0;
    }
    
    public Wheel(String make, String model, double width, int offset, int size, String tyreMake, String tyreModel){
        this.make = make;
        this.model = model;
        this.width = width;
        this.offset = offset;
        this.size = size;
        this.tyre = new Tyre(tyreMake, tyreModel);
    }
    
    public Wheel(String make, String model, double width, int offset, int size, Tyre tyre){
        this.make = make;
        this.model = model;
        this.width = width;
        this.offset = offset;
        this.size = size;
        this.tyre = tyre;
    }
    
    public Wheel(String make, String model, double width, int offset, int size){
        this.make = make;
        this.model = model;
        this.width = width;
        this.offset = offset;
        this.size = size;
    }

    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public double getWidth(){
        return width;
    }
    
    public int getSize(){
        return size;
    }
    
    public int getOffset(){
        return offset;
    }
    
    public String wheelInfo(){
        return make + " " + model + " Size: " + size + " Width: " + width + " Offset: " + offset; 
    }
}