package day10;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXls {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"data.xls";

        FileInputStream fis = new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("StudentList");
        String val = sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(val);


    }
}
