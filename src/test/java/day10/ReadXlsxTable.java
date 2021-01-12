package day10;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadXlsxTable {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"TestData.xlsx";

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        Sheet sheet = wb.getSheetAt(0);

        int lastRow = sheet.getLastRowNum();
        DataFormatter df = new DataFormatter();
        for(int i=0;i<lastRow+1;i++){
            String name = df.formatCellValue(sheet.getRow(i).getCell(0));
            String city = df.formatCellValue(sheet.getRow(i).getCell(1));
            String pin = df.formatCellValue(sheet.getRow(i).getCell(2));

            System.out.println(i+ "-----"+name +"----"+ city +"----"+ pin);
        }


//        DataFormatter df = new DataFormatter();
//
//        System.out.println(val);
////        String val =sheet.getRow(0).getCell(2).getStringCellValue();
////        System.out.println(val);

    }



}
