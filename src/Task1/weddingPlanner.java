package Task1;

public class weddingPlanner {

    //Singleton
    private static weddingPlanner instance =null;

    private String testcase;
    // Initailization
    private weddingPlanner(){
    }
    //Singleton Instance Check
    public static weddingPlanner getInstance() {
        if (instance == null){
            synchronized (weddingPlanner.class){
                if (instance == null) {
                    instance = new weddingPlanner();
                }
            }
        }
        return instance;
    }

    public void PlanWedding(WeddingPackage wedding){
        //Planning string
        System.out.print("Planning Wedding: ");
        // Wedding Name/type
        String x= ((WeddingPackage) wedding).getType();
        System.out.println(x);
        // Wedding Details
        System.out.println("Venue: "+wedding.venue);
        System.out.println("Catering by: "+wedding.catering);
        System.out.println("Decorations: "+wedding.decorations);
        System.out.println("Photographer: "+wedding.photography);
    }
}
