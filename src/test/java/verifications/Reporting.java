package verifications;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class Reporting extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Reporting");
		test.log(Status.INFO, "Init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.INFO, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to url : "+ childProp.getProperty("amazonurl"));
	
		String expectedLink = "Customer Serv";
		
		if(!isLinksEqual(expectedLink))
			reportFail("Both links are not equal");
		else
			reportPass("Both links are equal");
		
		report.flush();
	}

}
