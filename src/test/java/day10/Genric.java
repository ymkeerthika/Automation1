package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Genric {


    public static String getValue(String key){
        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"Config.properties";
        String val = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            val = prop.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return val;
    }




}
