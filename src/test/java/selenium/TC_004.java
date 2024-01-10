package selenium;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{

	private static final Logger log= Logger.getLogger(TC_004.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files....");
		
		launch("chromebrowser");
		log.info("Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigating to url : "+ childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selecting option Books By using loactor :" + orprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		log.info("Entered text Harry Potter By using locator : " + orprop.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonserachbutton_xpath");	
		log.info("Clicked on Element By using locator : " + orprop.getProperty("amazonserachbutton_xpath"));
	}
}
