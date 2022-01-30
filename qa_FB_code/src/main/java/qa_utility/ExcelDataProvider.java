package qa_utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider(){
		File src = new File("./TestData/testdatainput.xlsx");
		
		try{
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);		
			}
		catch(Exception e){
			System.out.println("File not found "+e.getMessage());
		}
	}
	
	public String getString(String sheetname, int row, int col){
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(int sheetindex, int row, int col){
		return wb.getSheetAt(sheetindex).getRow(row).getCell(col).getNumericCellValue();
	}

}
