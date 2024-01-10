package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class dataManagementFinalVersion 
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String,String> h) 
  {
	  System.out.println(h.get("UserName"));
	  System.out.println(h.get("UserPassword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testName = "LoginTest";
	    return DataUtil.getTableData(e, sheetName, testName);
    
  }
}
