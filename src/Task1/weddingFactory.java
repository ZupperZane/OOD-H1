package Task1;

public class weddingFactory {
    WeddingPackage CreatePackage(String PackageType){
        if (PackageType == "Luxury"){
            return new LuxuryWedding;
        } else if (PackageType == "Traditonal") {
            return new TraditionalWedding;
        } else if (PackageType == "Destination"){
            return new DestinationWedding;
        }
    }
}
