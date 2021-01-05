package day5;

import java.io.*;

public class DiffBwWhileFor {

    public static void main(String[] args) throws Exception {

        //Users/aravindanathdm/Documents/JavaSeleniumDecJan2021/TestFiles/students.txt
        //Users/aravindanathdm/Documents/JavaSeleniumDecJan2021
        String path = System.getProperty("user.dir")+ File.separator + "TestFiles" +File.separator+"students.txt";
        System.out.println(path);
        FileInputStream fis = new FileInputStream(path);
        FileReader fileReader = new FileReader(path);
        BufferedReader  bf = new BufferedReader(fileReader);

        String val = bf.readLine();
        System.out.println(val);
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());

        for(int i=1;i<=10;i++){
            System.out.println(bf.readLine());
        }


        System.out.println("******* While loop ***********");

        String temp = "";

        while ((temp=bf.readLine())!=null){
            System.out.println(temp);
        }

        System.out.println("out of loops");

    }

}
