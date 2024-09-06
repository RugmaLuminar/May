package testpkg;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import basepkg.westsidebase;
import excelus.utilities;
import pagepkg.westsidepage;


public class westsidetest extends westsidebase{
	
	@Test
	public void set() throws IOException
	{
		String xl = "C:\\Users\\Admin\\Desktop\\Westsideexcel.xlsx";

        String Sheet = "Sheet1";

        int rowCount = utilities.getRowCount(xl, Sheet);
        System.out.println(rowCount);
		for(int i=0;i<=rowCount;i++)
		{
			String phoneno= utilities.getCellValue(xl, Sheet, i, 0);
		//String password=utilities.getCellValue(excelpath, "sheet1", i, 1);
						
			System.out.println("phoneno="+phoneno);
			
//			westsidepage oc=new westsidepage(driver);
//			oc.signinn();
//			oc.setValues(phoneno);
//			oc.actions();
//			oc.screshot();
//			
//			TakesScreenshot scrShot=((TakesScreenshot)driver);
//			File screenshotfile=scrShot.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(screenshotfile,new File("./screenshot//screen.png"));
//			
//			oc.urlverification();
		                                    
											}
	}

}
