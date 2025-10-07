package Task1;

public abstract class WeddingPackage {
    //variables
    String venue;
    String catering;
    String decorations;
    String photography;
    // used later when printing type of wedding
    public String getType() {
        return "Generic Wedding Package";
    }
}
