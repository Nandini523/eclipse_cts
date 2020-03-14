package com.cts.excel;



import java.io.File;

import java.io.FileOutputStream;

import java.util.Map;

import java.util.Set;

import java.util.TreeMap;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;







public class WriteExcel {

 public static void main(String[] args)

   {

     //Blank workbook

     XSSFWorkbook workbook = new XSSFWorkbook();



     //Create a blank sheet

     XSSFSheet sheet = workbook.createSheet("CompanyData");



     //This data needs to be written (Object[])

     Map<String, Object[]> data = new TreeMap<String, Object[]>();

     data.put("1", new Object[] {"COMPANYNAME", "STOCKEXCHANGE", "CURRENTPRICE","DATE","TIME"});

     data.put("2", new Object[] {"cts", "stockex1", 945,"27oct",10});

     data.put("3", new Object[] {"tcs", "stockex2", 247,"25aug",07});

     data.put("4", new Object[] {"hcl", "stockex3", 654,"16jul",12});

     data.put("5", new Object[] {"paypal", "stockex4", 765,"21may",06});



     //Iterate over data and write to sheet

     Set<String> keyset = data.keySet();

     int rownum = 0;

     for (String key : keyset)

     {

       Row row = sheet.createRow(rownum++);

       Object [] objArr = data.get(key);

       int cellnum = 0;

       for (Object obj : objArr)

       {

        Cell cell = row.createCell(cellnum++);

        if(obj instanceof String)

           cell.setCellValue((String)obj);

         else if(obj instanceof Integer)

           cell.setCellValue((Integer)obj);

       }

     }

     try

     {

       //Write the workbook in file system

       FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));

       workbook.write(out);

       out.close();

       System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");

     }

     catch (Exception e)

     {

       e.printStackTrace();

     }

   }

}



