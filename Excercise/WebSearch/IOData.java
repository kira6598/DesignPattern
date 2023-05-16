package DesignPatterns.Excercise.WebSearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOData {
    void changeDataFormat(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("DesignPatterns/Excercise/WebSearch/query.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("DesignPatterns/Excercise/WebSearch/test.txt"));
            String line;
            while ((line=reader.readLine())!=null){
                // System.out.println(line);
                String[] arr= line.split("     ");               
                
                writer.write(arr[1]+"\n");
                
                System.out.println(arr[1]);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
