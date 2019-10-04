

public class Exhaust
{
    private double size;
    private String make;
    
    public Exhaust(String make, double size)
    {
        this.make = make;
        this.size = size;
    }
    
    public String getMake(){
        return make;
    }
    
    public double getSize(){
        return size;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public void setSize(double size){
        this.size = size;
    }
}
