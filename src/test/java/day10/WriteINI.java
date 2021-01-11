package day10;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteINI {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"data.ini";

        FileOutputStream fos = new FileOutputStream(path,true);
        Ini ini = new Ini();
        ini.put("tc003","user","arvind");
        ini.store(fos);

    }
}
