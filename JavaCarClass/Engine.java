
public class Engine
{
    // instance variables - replace the example below with your own
    private int breakHorsepower;
    private String engineCode;
    private String manufacturer;

   
    public Engine()
    {
        breakHorsepower = 0;
        engineCode = "Not Set";
        manufacturer = "Not Set";
    }
    
    public Engine(int breakHorsepower, String engineCode, String manufacturer){
        this.breakHorsepower = breakHorsepower;
        this.engineCode = engineCode;
        this.manufacturer = manufacturer;
    }

    public int getBreakHorsepower(){
        return breakHorsepower;
    }
    
    public String getEngineCode(){
        return engineCode;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public String getEngineDetails(){
        return engineCode + " Created By " + manufacturer + " Which Generates " + breakHorsepower + "bhp";
    }
    
    public void setBreakHorsePower(int horsePower){
        breakHorsepower = horsePower;
        System.out.println("The Break Horse Power Has Changed to: " + breakHorsepower);
    }
        
    
   
}
