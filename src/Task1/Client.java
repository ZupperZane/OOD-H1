package Task1;

public class Client {
    public static void main (String[] args){
        weddingPackageBuilder Builder = new weddingPackageBuilder();
        weddingFactory Factory1 = new weddingFactory();
        weddingPlanner Planner = new weddingPlanner();

        WeddingPackage wedding1 = Factory1.CreatePackage("Luxury");
        Builder.weddingPackageBuilder(wedding1,"Amsterdam","Wendy's","Variety Flowers","Local");

        WeddingPackage wedding2 = Factory1.CreatePackage("Destination");
        Builder.weddingPackageBuilder(wedding2,"St.Augestine","Culver's","White Flowers","Professional");

        Planner.PlanWedding(wedding1);
        System.out.println();
        Planner.PlanWedding(wedding2);
    }
}
