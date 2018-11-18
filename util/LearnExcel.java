package util;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook myBook = new XSSFWorkbook("./data/createlead.xlsx");
		XSSFSheet sheet = myBook.getSheet("createlead");
		int rowCount = sheet.getLastRowNum();
		/*int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);*/
		System.out.println("row count = "+rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("column count = "+colCount);
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <colCount; j++) {
				XSSFCell cell = row.getCell(j);
				/*CellType cellType = cell.getCellTypeEnum();
				if (cellType == CellType.NUMERIC) {
					double numericCellValue = cell.getNumericCellValue();
				// round = Math.round(numericCellValue);
					System.out.println(numericCellValue);
				}*/
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			} 
		}
	}

}







