package Task3;

public class Laptop implements product{
    //variables
    String ProcessorType;
    String GraphicsCard;
    String OperatingSystem ;
    int RAMsize;
    int StorageSize;
    //setters the auto complete helped with these
    public void setGraphicsCard(String graphicsCard) {
        GraphicsCard = graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public void setProcessorType(String processorType) {
        ProcessorType = processorType;
    }

    public void setRAMsize(int RAMsize) {
        this.RAMsize = RAMsize;
    }

    public void setStorageSize(int storageSize) {
        StorageSize = storageSize;
    }

    //details
    @Override
    public void printdetails() {
        System.out.println("Laptop Details: ");
        System.out.println("Processor Type : "+ProcessorType);
        System.out.println("Graphics Card : "+GraphicsCard);
        System.out.println("Operating System : "+OperatingSystem);
        System.out.println("Ram Size(in GB) : "+RAMsize);
        System.out.println("Storage Size(in GB) : "+StorageSize);
        System.out.println("Price is USD: $"+Price);
    }
}
