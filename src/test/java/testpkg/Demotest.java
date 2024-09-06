package testpkg;

import org.testng.annotations.Test;

import excelus.utilities;


public class Demotest {
	@Test
	public void excelread()
	{
		 String xl = "C:\\Users\\Admin\\Desktop\\Westsideexcel.xlsx";

         String Sheet = "Sheet1";

         int rowCount = utilities.getRowCount(xl, Sheet);
         System.out.println(rowCount);
//         String excelpath="‪C:\\Users\\Admin\\Desktop\\Westsideexcel.xlsx";
//         String Sheet = "Sheet1";
// 		//call sheetdeyail
// 		int RowCount= utilities.getRowCount(excelpath, Sheet);
// 		System.out.println("Rowcount="+RowCount);	//iteration
//         
         
	}

}
