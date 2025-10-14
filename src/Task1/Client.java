package Task1;

public class Client {
    public static void main (String[] args){
        //background Intilization
        weddingPackageBuilder Builder = new weddingPackageBuilder();
        weddingFactory Factory1 = new weddingFactory();
        weddingPlanner Planner = weddingPlanner.getInstance();
    // first Package
        WeddingPackage wedding1 = Factory1.CreatePackage("Luxury");
        Builder.weddingPackageBuilder(wedding1,"Amsterdam","Wendy's","Variety Flowers","Local");
    //Second Package
        WeddingPackage wedding2 = Factory1.CreatePackage("Destination");
        Builder.weddingPackageBuilder(wedding2,"St.Augestine","Culver's","White Flowers","Professional");
        // Third
        System.out.println("This was done in Office");
        WeddingPackage wedding3 = Factory1.CreatePackage("Traditonal");
        Builder.weddingPackageBuilder(wedding3,"Church","Local Gormet","Pink and Red Flowers","Family Photographer");
    // Prints and singleton test
        Planner.PlanWedding(wedding1);
        System.out.println();
        Planner.PlanWedding(wedding2);
        weddingPlanner Planner2 = weddingPlanner.getInstance();
        System.out.println(Planner2);
        System.out.println(Planner);
        //
        System.out.println("");
        Planner.PlanWedding(wedding3);
    }
}
