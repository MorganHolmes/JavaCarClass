
public class Tester
{
  public Tester(){
      car();
    }
  public void car(){
      Exhaust exhaust1 = new Exhaust("Hoffmann",3.5);
      Engine engine1 = new Engine(140,"X20LET","BMW");
      Tyre tyres = new Tyre("Michilin","Pilot Sport 4");
      Wheel wheels = new Wheel("3SDM","0.01",8.5,38,18,tyres);
      Car car = new Car("BMW","1 Series",engine1,wheels,exhaust1);
    }
}
