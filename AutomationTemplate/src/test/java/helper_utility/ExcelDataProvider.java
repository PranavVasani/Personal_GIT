/**
 * 
 */
package helper_utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author aruph
 * This class file will read data from an excel file
 */
public class ExcelDataProvider {

	XSSFWorkbook wb;
	XSSFSheet sh;

	public ExcelDataProvider()
	{
		File src = new File ("./TestData/TestData.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Excel file not found");
		}

		sh = wb.getSheet("Login");
	}


	/*public String getStringData(int getSheetIndex, int row, int column)
	{
		return wb.getSheetAt(getSheetIndex).getRow(row).getCell(column).getStringCellValue();
	}


	public String getStringData(String getSheetName, int row, int column)
	{
		return wb.getSheet(getSheetName).getRow(row).getCell(column).getStringCellValue();
	}


	public double getNumericData(String getSheetName, int row, int column)
	{
		return wb.getSheet(getSheetName).getRow(row).getCell(column).getNumericCellValue();
	}*/


	public String getStringData(int row, int column)
	{
		return sh.getRow(row).getCell(column).getStringCellValue();
	}


	public double getNumericData(int row, int column)
	{
		return sh.getRow(row).getCell(column).getNumericCellValue();
	}

}
