package testng;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
  
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void start(String btype) throws Exception 
  {
	  System.out.println("start");
	  init();
	  test = report.createTest("TNG_002");
	  test.log(Status.INFO, "Init the properties files....");
		
	  launch(btype);
	  test.log(Status.PASS, "Launching the browser : " + btype);
		
	  navigateUrl("amazonurl");
	  test.log(Status.FAIL, "Navigating to url : "+ childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	  System.out.println("amazon");
	    selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "Selecting option Books By using loactor :" + orprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(Status.INFO, "Entered text Harry Potter By using locator : " + orprop.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonserachbutton_xpath");	
		test.log(Status.PASS, "Clicked on Element By using locator : " + orprop.getProperty("amazonserachbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void end() 
  {
	  System.out.println("end");
	  report.flush();
	  driver.quit();
  }

}
