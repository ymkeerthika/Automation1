package day10;

import java.io.*;

public class ReadTextFile {


    public static void main(String[] args) throws Exception {
//Input stream
        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"Data.txt";
        Reader read = new FileReader(path);
        BufferedReader bf = new BufferedReader(read);

        String x = "";
        while ((x=bf.readLine())!=null){
            System.out.println(x);
        }

    }
}
