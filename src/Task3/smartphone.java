package Task3;

public class smartphone implements product{
    //variables
    String Screensize;
    int batterySize;
    int storageSize;
    int CameraResolution;
    String ProcessorType;

        //setter Methods
    public void setProcessorType(String processorType) {
        ProcessorType = processorType;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public void setCameraResolution(int cameraResolution) {
        CameraResolution = cameraResolution;
    }

    public void setScreensize(String screensize) {
        Screensize = screensize;
    }
    //details
    @Override
    public void printdetails() {
        System.out.println("Smartphone Details: ");
        System.out.println("Processor Type : "+ProcessorType);
        System.out.println("Screen Size : "+Screensize);
        System.out.println("Batter Size(in Hours) : "+batterySize);
        System.out.println("Storage Size : "+storageSize);
        System.out.println("Camera Resolution : "+CameraResolution);
    }
}
