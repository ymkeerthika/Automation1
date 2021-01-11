package day10;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Genric {

    /**
     * This method is used to read from properites file
     * @param key
     * @return
     */

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


    public static void setValue(String key, String value){
        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"Config.properties";
     try {
         FileOutputStream fos = new FileOutputStream(path, true);
         Properties prop = new Properties();
         prop.setProperty(key,value);
         prop.store(fos,"Adding test data");
     }catch (Exception e){
         e.printStackTrace();
     }

    }

    /**
     * This method is used to read from ini file
     * @param header
     * @param key
     * @return
     */
    public static  String getValue(String header, String key){
        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"data.ini";
        String val = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Ini ini = new Ini();
            ini.load(fis);
            val = ini.get(header,key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return val;
    }


    public static void setValue(String header, String key, String value){

        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"data.ini";
        try {
            FileOutputStream fos = new FileOutputStream(path, true);
            Ini ini = new Ini();
            ini.put(header,key,value);
            ini.store(fos);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
