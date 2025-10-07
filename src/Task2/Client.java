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
    }
}
