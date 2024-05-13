package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	public static String getCellValues(String x1,String Sheet,int r,int c) {
		try {
			File f=new File(x1);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
				XSSFCell cell=(XSSFCell)wb.getSheet(Sheet).getRow(r).getCell(c);
				if(cell.getCellType()==CellType.STRING) {
					return cell.getStringCellValue();
				}
				else
				{
					return cell.getRawValue();//sendkeys only support string values
				}
		}
		catch(Exception e) {
			return "";
		}
	}
	public static int getRowCount(String x1,String Sheet) {
		try {
			File f=new File(x1);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			return wb.getSheet(Sheet).getLastRowNum();
		}
		catch(Exception e) {
			return 0;
		}
	}

}
