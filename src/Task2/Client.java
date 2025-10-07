package Task2;

public class Client {
    public static void main (String agrs[]){
        //Intilize Factories and Manufacters
        DroneFactoryA ManufacterA = new DroneFactoryA();
        DroneFactoryB ManufacterB = new DroneFactoryB();
        SDfactory SurveyFactory = new SDfactory();
        ADfactory AgriFactory = new ADfactory();
        DDfactory DeliveryFactory = new DDfactory();
        // Test cases
        ManufacterA.makeSD();
        ManufacterA.makeDD();
        ManufacterA.makeAD();


        ManufacterB.makeSD();
        ManufacterB.makeDD();
        ManufacterB.makeAD();
        // Additional Manufacter C & drone type
        DroneFactoryC ManufacterC = new DroneFactoryC();
        RDfactory RescueFactory = new RDfactory();
        // Test cases for each
        ManufacterC.makeRD();
        ManufacterC.makeSD();
        ManufacterC.makeDD();
        ManufacterC.makeAD();
        // base cases
        ManufacterA.makeRD();


        ManufacterB.makeRD();


    }
}
