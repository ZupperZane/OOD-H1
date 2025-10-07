package Task2;

public class DroneFactoryC {
    //series of methods refrencing other factory for individual Drone types, specific to the manufacter settings

    public void makeSD(){
        Drone temp = SDfactory.createSurveyDrone();
        temp.BatteryCap = 5500;
        temp.FlightRange= 34;
        temp.SpecialFeatures="Poor Quality Camera";
        System.out.println("New Survey Drone Made:");
        temp.desc();
    }
    public void makeDD(){
        Drone temp = DDfactory.createDeliveryDrone();
        temp.BatteryCap = 5500;
        temp.FlightRange= 34;
        temp.SpecialFeatures="Good Payload Capacity";
        System.out.println("New Delivery Drone Made:");
        temp.desc();
    }
    public void makeAD(){
        Drone temp = ADfactory.createAgriDrone();
        temp.BatteryCap = 5500;
        temp.FlightRange= 34;
        temp.SpecialFeatures="High Quality Frame";

    }
    public void makeRD(){
        Drone temp = RDfactory.createRescueDrone();
        temp.BatteryCap = 5500;
        temp.FlightRange= 34;
        temp.SpecialFeatures="fast Quality Frame";
    }
}
