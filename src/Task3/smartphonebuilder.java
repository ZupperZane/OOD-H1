package Task3;

public class smartphonebuilder {
    product temp = new smartphone();
    // finish
    public product Build(){
        return temp;
    }
    //setters used in builder
    public void setProcessor(String processor){
        ((smartphone)temp).setProcessorType(processor);
    }
    public void setGraphicsCard(String Card){
        ((smartphone)temp).setGraphicsCard(Card);
    }
    public void setOperatingSystem(String Sys){
        ((smartphone)temp).setOperatingSystem(Sys);
    }
    public void setRAMsize(int Ram){
        ((smartphone)temp).setRAMsize(Ram);
    }
    public void setStorageSize(int Storage){((smartphone)temp).setStorageSize(Storage);}
    private void reset(){
        temp=null;
    }
}
