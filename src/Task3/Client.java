package Task3;

public class Client {
    public static void main(String[] args) {
        //builder initialize
        laptopBuilder BuilderL = new laptopBuilder();
        smartphonebuilder BuilderS = new smartphonebuilder();
        // Laptop builder methods test
        BuilderL.setProcessor("Intel");
        BuilderL.setGraphicsCard("RTX 1060");
        BuilderL.setOperatingSystem("Windows");
        BuilderL.setRAMsize(24);
        BuilderL.setStorageSize(1000);
        product x = BuilderL.Build();
        x.printdetails();

        System.out.println("");
        //Smartphone Builder methods Test
        BuilderS.setBatterySize(10);
        BuilderS.setCameraResolution(720);
        BuilderS.setScreensize("750x1344");
        BuilderS.setProcessorType("Intel");
        BuilderS.setStorageSize(256);
        product y= BuilderS.Build();
        y.printdetails();
        // Adapter& retrival  Intilization
        CSVretrival Retrival = new CSVretrival();
        CSVadapter Adapter = new CSVadapter();
        Retrival.setCSV("C:\\Users\\HAJ02\\IdeaProjects\\OOD-H1\\src\\Sample CSV - Sheet1.csv");
        Retrival.toList();
        // at this point the CSv is in a list and next needs to be printed then copied into the builder
        Adapter.importCsvhalf(Retrival);
        Adapter.convert();
    }
}
