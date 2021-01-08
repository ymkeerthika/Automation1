package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"Config.properties";

        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String val = prop.getProperty("url");
        System.out.println(val);

        System.out.println("***************************");

        String valu = Genric.getValue("url");
        System.out.println(valu);

        System.out.println(Genric.getValue("city"));


    }
}
