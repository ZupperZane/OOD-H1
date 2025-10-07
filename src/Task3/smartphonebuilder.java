package Task3;

public class smartphonebuilder {
    product temp = new smartphone();
    // finish
    public product Build(){
        return temp;
    }
    //setters used in builder
    public void setProcessorType(String processor){
        ((smartphone)temp).setProcessorType(processor);
    }
    public void setStorageSize(int size){
        ((smartphone)temp).setStorageSize(size);
    }
    public void setBatterySize(int size){
        ((smartphone)temp).setBatterySize(size);
    }
    public void setCameraResolution(int resolution){
        ((smartphone)temp).setCameraResolution(resolution);
    }
    public void setScreensize(String screensize){
        ((smartphone)temp).setScreensize(screensize);
    }
    private void reset(){
        temp=null;
    }
}
