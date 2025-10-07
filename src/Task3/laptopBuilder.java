package Task3;

public class laptopBuilder {
    product temp = new Laptop();;

    public void laptopBuilder(){
        temp = new Laptop();
    }

    public product Build(){
        return temp;
    }
    public void setProcessor(String processor){
        ((Laptop)temp).setProcessorType(processor);
    }
    public void setGraphicsCard(String Card){
        ((Laptop)temp).setGraphicsCard(Card);
    }
    public void setOperatingSystem(String Sys){
        ((Laptop)temp).setOperatingSystem(Sys);
    }
    public void setRAMsize(int Ram){
        ((Laptop)temp).setRAMsize(Ram);
    }
    public void setStorageSize(int Storage){
        ((Laptop)temp).setStorageSize(Storage);
    }
    private void reset(){
        temp=null;
    }

}
