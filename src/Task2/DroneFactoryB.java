package Task2;

public class DroneFactoryB extends AbstractFactory{

    public void makeSD(){
        Drone temp = SDfactory.createSurveyDrone();
        temp.BatteryCap = 5000;
        temp.FlightRange= 40;
        temp.SpecialFeatures="Low Quality Camera";
    }
    public void makeDD(){
        Drone temp = DDfactory.createDeliveryDrone();
        temp.BatteryCap = 5000;
        temp.FlightRange= 40;
        temp.SpecialFeatures="High Payload Capacity";
    }
    public void makeAD(){
        Drone temp = ADfactory.createAgriDrone();
        temp.BatteryCap = 5000;
        temp.FlightRange= 40;
        temp.SpecialFeatures="Low Quality Frame";
    }
}
