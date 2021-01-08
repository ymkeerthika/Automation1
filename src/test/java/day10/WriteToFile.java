package day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) throws IOException {
            //Users/aravindanathdm/Documents/JavaSeleniumDecJan2021/TestFiles/WriteData.txt
        String path = System.getProperty("user.dir")+File.separator+"TestFiles"+File.separator+"WriteData.txt";

        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }else{
            System.out.println("File exist? "+   file.exists());
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello world");
        bw.newLine();
        bw.write("Welcome");

        bw.flush();
        bw.close();




    }

}
