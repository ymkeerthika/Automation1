package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropFile {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"Config.properties";

        FileOutputStream fos = new FileOutputStream(path,true);
        Properties prop = new Properties();
        prop.setProperty("password","Arvind");
        prop.store(fos,"Addding new data");


        System.out.println("****************");

        Genric.setValue("search","iphone 12");

    }
}
