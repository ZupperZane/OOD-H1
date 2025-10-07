package Task2;

public class DroneFactoryB extends AbstractFactory{

    public void makeSD(){
        Drone temp = SDfactory.createSurveyDrone();
        temp.BatteryCap = 5000;
        temp.FlightRange= 40;
        temp.SpecialFeatures="Low Quality Camera";
        System.out.println("New Survey Drone Made:");
        temp.desc();
    }
    public void makeDD(){
        Drone temp = DDfactory.createDeliveryDrone();
        temp.BatteryCap = 5000;
        temp.FlightRange= 40;
        temp.SpecialFeatures="High Payload Capacity";
        System.out.println("New Delivery Drone Made:");
        temp.desc();
    }
    public void makeAD(){
        Drone temp = ADfactory.createAgriDrone();
        temp.BatteryCap = 5000;
        temp.FlightRange= 40;
        temp.SpecialFeatures="Low Quality Frame";

    }
}
