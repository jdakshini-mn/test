import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hpbf.model.MainContents;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.apache.poi.ss.usermodel.CellType;

public class ReadingExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File f = new File(System.getProperty("user.dir") + "/myexcel.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook workbook = WorkbookFactory.create(fi);

		Sheet sheet0 = workbook.getSheetAt(0);

		/*
		 * Row row0 = sheet0.getRow(0); Cell cellA = row0.getCell(0);
		 * 
		 * System.out.println(cellA);
		 */

		for (Row row : sheet0) {

			for (Cell cell : row) {

				/*
				 * Cell.CELL_TYPE_BLANK Cell.CELL_TYPE_NUMERIC Cell.CELL_TYPE_STRING
				 * Cell.CELL_TYPE_FORMULA Cell.CELL_TYPE_BOOLEAN Cell.CELL_TYPE_ERROR
				 */

				/*
				 * switch(cell.getCellType()) { case Cell.CELL_TYPE_STRING:
				 * //Cell.CELL_TYPE_STRING:
				 * 
				 * System.out.println(cell.getStringCellValue()+"\t"); case
				 * Cell.CELL_TYPE_NUMERIC:
				 * 
				 * System.out.print(cell.getNumericCellValue()+"\t"); case Cell.CELL_TYPE_BLANK:
				 * 
				 * System.out.print("Blank Cell");
				 */

				CellType cellType = cell.getCellType();
				switch (cellType)

				{

				case STRING:

					System.out.print(cell.getStringCellValue() + "\t");

					break;

				case NUMERIC:

					System.out.print(cell.getNumericCellValue() + "\t");

					break;

				case BLANK:

					System.out.print("BlankCell\t");

					break;
				default:
					break;
				}

			}
			System.out.println("\n");
			
		}

		fi.close();

	}

}
