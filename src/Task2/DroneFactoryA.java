package Task2;

public class DroneFactoryA extends AbstractFactory{

    public void makeSD(){
        Drone temp = SDfactory.createSurveyDrone();
        temp.BatteryCap = 4000;
        temp.FlightRange= 50;
        temp.SpecialFeatures="High Quality Camera";
    }

    public void makeDD(){
        Drone temp = DDfactory.createDeliveryDrone();
        temp.BatteryCap = 4000;
        temp.FlightRange= 50;
        temp.SpecialFeatures="Low Payload Capacity";
    }
    public void makeAD(){
        Drone temp = ADfactory.createAgriDrone();
        temp.BatteryCap = 4000;
        temp.FlightRange= 50;
        temp.SpecialFeatures="High Quality Frame";
    }

}
