package day10;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadINI {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"data.ini";

        FileInputStream fis = new FileInputStream(path);
        Ini ini = new Ini();
        ini.load(fis);
        String  val =  ini.get("tc002","search");
        System.out.println(val);

        String val2 =Genric.getValue("tc001","search");
        System.out.println(val2);


    }
}
