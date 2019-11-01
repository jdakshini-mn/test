import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedWriter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	
	public static void main(String[] args) throws IOException {
		
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet0 = workbook.createSheet ("firstsheet");
		
		Row row0 = sheet0.createRow(0);
		
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		Cell cellC = row0.createCell(2);
		Cell cellD = row0.createCell(3);
		Cell cellE = row0.createCell(4);
		Cell cellF = row0.createCell(5);
		Cell cellG = row0.createCell(6);
		Cell cellH = row0.createCell(7);
		Cell cellI = row0.createCell(8);
		Cell cellJ = row0.createCell(9);
		
		
		
		
		cellA.setCellValue("One");
		
		cellB.setCellValue("Two");
		
		cellC.setCellValue("Three");
		
		cellD.setCellValue("Four");
		
		cellE.setCellValue("Five");
		
		cellF.setCellValue("Six");
		
		cellG.setCellValue("Seven");
		
		cellH.setCellValue("eight");
		
		cellI.setCellValue("Nine");
		
		cellJ.setCellValue("Ten");
		
		System.out.println("1 !!");
		
		
		
		
		for(int rows=1; rows<11; rows++) {
			
			Row row = sheet0.createRow(rows);
			
			for(int cols=0; cols<10; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
				
			}
		}
		
		//Connecting Stream
		
		File f = new File(System.getProperty("user.dir")+"/myexcel.xlsx");
		
		//File f = new File(System.getProperty("\\Users\\jdakshini\\filewriting\\myexcel.xlsx");
				
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		
		
		//Closing the stream
		
		fo.close();
		
		System.out.println("File created !!");
		
	}
}
