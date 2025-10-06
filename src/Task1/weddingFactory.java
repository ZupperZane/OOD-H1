package Task1;

public class weddingFactory {
    WeddingPackage CreatePackage(String PackageType){
        WeddingPackage temp= null;
        if (PackageType == "Luxury"){
            temp= new LuxuryWedding();
        } else if (PackageType == "Traditonal") {
            temp= new TraditionalWedding();
        } else if (PackageType == "Destination"){
            temp= new DestinationWedding();
        }
        return temp;
    }
}
