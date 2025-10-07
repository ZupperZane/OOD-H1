package Task3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSVretrival {
    //intial varaibles
        File file;
    public List<List<String>> CsvHalf = new ArrayList<>();
    // used to set file
    void setCSV(String filename){
        file = new File(filename);
    }
    // getter for Adapter
    public List<List<String>> getCsvHalf() {
        return CsvHalf;
    }

    // stack overflow helped me convert using a similar template "https://stackoverflow.com/questions/40074840/reading-a-csv-file-into-a-array"
    //this section is mostly code from that stack overflow but i can explain it.
    void toList(){
        // this gives you a 2-dimensional array of strings // not mine
        // This intilizes a array of lists of strings which can mimic a CSV
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;
        // this scanner is used later to convert to strings

        try{
            inputStream = new Scanner(file);
            // while the inputstream is not at the end it can do the loop
            while(inputStream.hasNext()){
                String line= inputStream.nextLine();
                // increment here^
                String[] values = line.split(",");
                // splits the CSV into strings
                // this adds the currently parsed line to the 2-dimensional string array // not mine
                CsvHalf.add(Arrays.asList(values));
                //adds back to the array
            }

            inputStream.close();
            //closes the input/scanner
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // the following code lets you iterate through the 2-dimensional array // not mine
        int lineNo = 1;
        //iteration from example that may of been left over, not used
        for(List<String> line: lines) {
            int columnNo = 1;
            for (String value: line) {
                //System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                columnNo++;
            }
            lineNo++;
        }
    }
}

