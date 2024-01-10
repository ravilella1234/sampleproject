package dataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider 
{
 
  @DataProvider
  public Object[][] getData(Method m) 
  {
	  System.out.println("Method : " +m.getName());
	  Object[][] data = new Object[3][4];
	  //row-1
	  data[0][0]="chrome";
	  data[0][1]="Admin";
	  data[0][2]=12345;
	  data[0][3]="email1@domain.com";
	  //row-2
	  data[1][0]="mozilla";
	  data[1][1]="superAdmin";
	  data[1][2]=11111;
	  data[1][3]="email2@domain.com";
	  //row-3
	  data[2][0]="IE";
	  data[2][1]="User";
	  data[2][2]=99999;
	  data[2][3]="email3@domain.com";
	  
	  
	  return data;
  }
}
