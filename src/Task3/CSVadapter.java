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
        for(List<String>row: CsvHalf2){
            String first = row.get(0);
            if (first.equals("Laptop Model ")){
                laptopBuilder builder1 = new laptopBuilder();
                builder1.setProcessor(row.get(1));
                builder1.setRAMsize(Integer.parseInt(row.get(2)));
                builder1.setStorageSize(Integer.parseInt(row.get(3)));
                builder1.setGraphicsCard(row.get(4));
                builder1.setOperatingSystem(row.get(5));
                product temp = builder1.Build();
                temp.printdetails();
            }
        }
    }

}
