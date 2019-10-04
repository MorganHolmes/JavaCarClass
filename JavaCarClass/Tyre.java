
public class Tyre
{
    private String make;
    private String model;

    /**
     * Constructor for objects of class Tyre
     */
    public Tyre(String make, String model)
    {
        this.make = make;
        this.model = model;
        
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getTyreInfo(){
        return make + " " + model;
    }
    
}
