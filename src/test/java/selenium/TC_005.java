package selenium;

import com.aventstack.extentreports.Status;

public class TC_005 extends BaseTest
{
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("TC_005");
		test.log(Status.INFO, "Init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.FAIL, "Navigating to url : "+ childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "Selecting option Books By using loactor :" + orprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(Status.INFO, "Entered text Harry Potter By using locator : " + orprop.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonserachbutton_xpath");	
		test.log(Status.PASS, "Clicked on Element By using locator : " + orprop.getProperty("amazonserachbutton_xpath"));
		
		report.flush();
	}
}
