public class Car
{
    // instance variables - replace the example below with your own
    private String make;
    private String model;
    private Engine engine;
    private Wheel wheel;
    private Exhaust exhaust;

    /**
     * Constructor for objects of class Car
     */
    public Car(String make, String model, Engine engine, Wheel wheel,Exhaust exhaust)
    {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
        this.exhaust = exhaust;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getCarInformation(){
        return "- " + make + " " + model + " -" + "\nEngine: " + engine.getEngineCode() + "\nWheels: " + wheel.getMake() + " "
        + wheel.getModel() + "\nTyres: " + wheel.getTyre().getMake() + " " + wheel.getTyre().getModel() 
        + "\nExhaust: " + exhaust.getMake() + "\nBHP: " + engine.getBreakHorsepower();
    }
}
