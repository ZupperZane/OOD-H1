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
    // Prints and singleton test
        Planner.PlanWedding(wedding1);
        System.out.println();
        Planner.PlanWedding(wedding2);
        weddingPlanner Planner2 = weddingPlanner.getInstance();
        System.out.println(Planner2);
        System.out.println(Planner);
    }
}
