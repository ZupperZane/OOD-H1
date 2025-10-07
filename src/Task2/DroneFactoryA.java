package Task2;

public class DroneFactoryA extends AbstractFactory{
    //series of methods refrencing other factory for individual Drone types, specific to the manufacter settings
    public void makeSD(){
        Drone temp = SDfactory.createSurveyDrone();
        temp.BatteryCap = 4000;
        temp.FlightRange= 50;
        temp.SpecialFeatures="High Quality Camera";
        System.out.println("New Survey Drone Made:");
        temp.desc();
    }

    public void makeDD(){
        Drone temp = DDfactory.createDeliveryDrone();
        temp.BatteryCap = 4000;
        temp.FlightRange= 50;
        temp.SpecialFeatures="Low Payload Capacity";
        System.out.println("New Delivery Drone Made:");
        temp.desc();
    }
    public void makeAD(){
        Drone temp = ADfactory.createAgriDrone();
        temp.BatteryCap = 4000;
        temp.FlightRange= 50;
        temp.SpecialFeatures="High Quality Frame";
        System.out.println("New Agri Drone Made:");
        temp.desc();
    }
    public void makeRD(){
        Drone temp = RDfactory.createRescueDrone();
        temp.BatteryCap = 4000;
        temp.FlightRange= 50;
        temp.SpecialFeatures="Good Quality Frame";
    }

}
