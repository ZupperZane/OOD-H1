package Task3;

import java.util.ArrayList;
import java.util.List;

public class CSVadapter {

    List<List<String>> CsvHalf2;

    public void importCsvhalf(CSVretrival temp){
        CsvHalf2 = temp.CsvHalf;
    }
//https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java helped because when you convert from csv into string you need to convert the item but regular casting caused issues
    public void convert(){
        for(int i=1; i <CsvHalf2.size();i++){
            List<String> curRow = CsvHalf2.get(i);
            String first = curRow.get(0);

            if (first.equals("Laptop Model ")){
                laptopBuilder builder1 = new laptopBuilder();
                builder1.setProcessor(curRow.get(1));
                builder1.setRAMsize(Integer.parseInt(curRow.get(2)));
                builder1.setStorageSize(Integer.parseInt(curRow.get(3)));
                builder1.setGraphicsCard(curRow.get(4));
                builder1.setOperatingSystem(curRow.get(5));
                product temp = builder1.Build();
                temp.printdetails();
                System.out.println(" ");
            }             if (first.equals("Smartphone Model ")){
                smartphonebuilder builder1 = new smartphonebuilder();
                builder1.setProcessorType(curRow.get(1));
                builder1.setCameraResolution(Integer.parseInt(curRow.get(9)));
                builder1.setStorageSize(Integer.parseInt(curRow.get(3)));
                builder1.setScreensize(curRow.get(8));
                builder1.setBatterySize(Integer.parseInt(curRow.get(10)));
                product temp = builder1.Build();
                temp.printdetails();
                System.out.println(" ");
            }
        }
    }

}
