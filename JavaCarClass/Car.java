public class Car
{
    // instance variables - replace the example below with your own
    private String make;
    private String model;
    private Engine engine;
    private Wheel wheel;
    private DriveTrain driveTrain;
    private Exhaust exhaust;

    /**
     * Constructor for objects of class Car
     */
    public Car(String make, String model, Engine engine, Wheel wheel, DriveTrain driveTrain, Exhaust exhaust)
    {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
        this.driveTrain = driveTrain;
        this.exhaust = exhaust;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
}
