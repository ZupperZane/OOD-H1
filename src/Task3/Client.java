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
        BuilderS.setProcessor("A16");
        BuilderS.setGraphicsCard("Ninvida 1060");
        BuilderS.setOperatingSystem("Andriod");
        BuilderS.setRAMsize(24);
        BuilderS.setStorageSize(128);
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
        //

// Search fucntion
        Adapter.Search("x");
        //Search prints everything up to model x

    }
}
