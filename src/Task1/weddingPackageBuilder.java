package Task1;

public class weddingPackageBuilder {
    //Temp Wedding
    WeddingPackage Temp;

    public void weddingPackageBuilder(WeddingPackage temp,String ven,String cater,String deco,String photo){
            this.setVenue(temp,ven);
            this.setCatering(temp,cater);
            this.setDecorations(temp,deco);
            this.setPhotography(temp,photo);
        }

    public void setVenue(WeddingPackage Package,String ven){
        Package.venue = ven;
    }
    public void setCatering(WeddingPackage Package,String cater){
        Package.catering = cater;
    }
    public void setDecorations(WeddingPackage Package,String deco){
        Package.decorations = deco;
    }
    public void setPhotography(WeddingPackage Package,String photo){
        Package.photography = photo;
    }
}
