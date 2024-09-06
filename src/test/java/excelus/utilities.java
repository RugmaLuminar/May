package excelus;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utilities {
	public static String getCellValue(String x1, String sheet, int r, int c)
	{
		try
		{
			//filepath read
			FileInputStream fi=new FileInputStream(x1);
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			//onecell reaD for check string or numeric 
			XSSFCell cell = wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				double v= cell.getNumericCellValue();
				int val = (int)v;
				return String.valueOf(val);
				
			}
		}
		catch(Exception e)
		{
			return"";
			
		}
	}
	
public static int getRowCount(String x1, String sheet)
{
	
	try
	{
		FileInputStream mi=new FileInputStream(x1);
		XSSFWorkbook ni=new XSSFWorkbook(mi);
		System.out.println("excel details");
		return	ni.getSheet(sheet).getLastRowNum();
		//file
	}
	catch(Exception e)
	{
		
	
	return 0;
	}
		



}
}



