package org.testing;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Shameetask {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\Documents\\New folder\\ExcelSheets\\TestData\\sample xl.xlsx");
	FileInputStream instream=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(instream);
	Sheet s=w.getSheet("Input");
	Row r=s.getRow(2);
	System.out.println(r);
	System.out.println("done successfully");

	}
	}

}
