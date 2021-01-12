package day10;

import com.sun.glass.ui.Pixels;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

public class XlsxReading {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"TestData.xlsx";

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        Sheet sheet = wb.getSheetAt(0);
        DataFormatter df = new DataFormatter();
        String val = df.formatCellValue(sheet.getRow(0).getCell(2));
        System.out.println(val);
//        String val =sheet.getRow(0).getCell(2).getStringCellValue();
//        System.out.println(val);

    }



}
