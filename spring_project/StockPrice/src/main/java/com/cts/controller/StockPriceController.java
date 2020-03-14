package com.cts.controller;
import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Iterator;

import java.util.List;

import java.util.Map;

import java.util.Optional;



import javax.servlet.http.HttpSession;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.PathVariable;



import org.springframework.web.bind.annotation.PostMapping;



import org.springframework.web.bind.annotation.PutMapping;



import org.springframework.web.bind.annotation.RequestBody;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.multipart.MultipartFile;




import com.cts.dao.StockPriceRepository;

import com.cts.pojos.StockPrice;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/stockPrice")

public class StockPriceController {

	@Autowired

	private StockPriceRepository stockpriceRepository;

	@RequestMapping("/getStockPr")

	public Iterable<StockPrice> getStockPr() {

		return stockpriceRepository.findAll();

	}

	@PostMapping("/saveStockPr")

	public StockPrice saveStockPr(@RequestBody StockPrice stockprice) {

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@PutMapping("/updateStockPr/{stockex}")

	public StockPrice updateStockPr(@RequestBody StockPrice stockprice,

			@PathVariable("stockex") String stockex) {

		stockprice.setCompanyname(stockex);

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@DeleteMapping("/deleteStockPr/{stockex}")

	public Boolean deleteStockPr(@PathVariable("stockex") String stockex) {

		System.out.println(stockex);

		Optional<StockPrice> stockprice = stockpriceRepository.findById(stockex);

		stockpriceRepository.delete(stockprice.get());

		return true;

	}

	@GetMapping("/findOneInAll5/{stockex}")

	public StockPrice findOneInAll5(@PathVariable("stockex") String stockex)

	{

		Optional<StockPrice> stockprice = stockpriceRepository.findById(stockex);

		return stockprice.get();

	}

	@GetMapping("/findByCompanyname/{companyname}")

	public List<StockPrice> findByCompanyname(@PathVariable("companyname") String companyname)

	{

		List<StockPrice> stockprice = stockpriceRepository.findByCompanyname(companyname);

		return stockprice;

	}
	@RequestMapping("/multiplelinechart")

	 public ResponseEntity<?> getDataForMultipleLine() {

	 Iterable<StockPrice> dataList = stockpriceRepository.findAll();

	 Map<String, List<StockPrice>> mappedData = new HashMap<>();

	 List<StockPrice> stockPriceList = new ArrayList<StockPrice>();

	 dataList.forEach(stockPriceList::add);

	 for (StockPrice data : stockPriceList) {



	  if (mappedData.containsKey(data.getCompanyname())) {

	  mappedData.get(data.getCompanyname()).add(data);

	  } else {

	  List<StockPrice> tempList = new ArrayList<StockPrice>();

	  tempList.add(data);

	  mappedData.put(data.getCompanyname(), tempList);

	  }



	 }

	 return new ResponseEntity<>(mappedData, HttpStatus.OK);

	 }



	 @PostMapping("/uploadfile/{stockexchange}")



	 public int handleFileUpload(@PathVariable("stockexchange") String stockexchange,@RequestParam("file") MultipartFile file, HttpSession session) {



	 Path rootLocation = Paths.get("c://temp//"+file.getOriginalFilename());

	 try {

	  Files.write(rootLocation,file.getBytes());





	  try



	    {



	     FileInputStream fileNew = new FileInputStream(new File("c://temp//"+file.getOriginalFilename()));







	     //Create Workbook instance holding reference to .xlsx file



	     XSSFWorkbook workbook = new XSSFWorkbook(fileNew);







	     //Get first/desired sheet from the workbook



	     XSSFSheet sheet = workbook.getSheetAt(0);









	     //Iterate through each rows one by one



	     Iterator<Row> rowIterator = sheet.iterator();



	     while (rowIterator.hasNext())



	     {



	      Row row = rowIterator.next();







	      StockPrice stockPrice=new StockPrice();

	      //For each row, iterate through all the columns



	      Cell cell0= row.getCell(0);

	            //System.out.println(""+cell0.getStringCellValue());

	      stockPrice.setCompanyname(cell0.getStringCellValue());

	      Cell cell1= row.getCell(1);

	            //System.out.println(""+cell1.getStringCellValue());

	      stockPrice.setStockex(cell1.getStringCellValue());

	      Cell cell2= row.getCell(2);

	      if(cell2.getCellType()==cell2.CELL_TYPE_STRING) {

	            //System.out.println(""+cell2.getStringCellValue());

	      stockPrice.setCprice(Integer.parseInt(cell2.getStringCellValue()));

	      }

	      else if(cell2.getCellType()==cell2.CELL_TYPE_NUMERIC) {

	            //System.out.println(""+cell2.getNumericCellValue());

	      stockPrice.setCprice((int)cell2.getNumericCellValue());

	      }

	      Cell cell3= row.getCell(3);

	      //System.out.println(""+cell3.getStringCellValue());

	      stockPrice.setDate(cell3.getStringCellValue());

	      Cell cell4= row.getCell(4);

	      if(cell4.getCellType()==cell4.CELL_TYPE_STRING) {

	            // System.out.println(""+cell4.getStringCellValue());

	      stockPrice.setTime(cell4.getStringCellValue());

	      }



	      else if(cell4.getCellType()==cell4.CELL_TYPE_NUMERIC) {

	       //System.out.println(""+cell4.getNumericCellValue());

	       stockPrice.setTime(""+cell4.getNumericCellValue());

	      }

	      System.out.println("----------------------------------------------------------");

	      stockPrice.setUploadfile(file.getOriginalFilename());

	      stockpriceRepository.save(stockPrice);

	     }



	     fileNew.close();



	    }



	    catch (Exception e)



	    {



	     e.printStackTrace();



	    }















	 } catch (IOException e) {

	  // TODO Auto-generated catch block

	  e.printStackTrace();

	 }







	 return 1;



	 }

}
