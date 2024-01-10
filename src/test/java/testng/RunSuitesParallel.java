package testng;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuitesParallel 
{

	public static void main(String[] args) 
	{
		/*String[] s1 = {"1","2","3"};
		String[] s2 = new String[4];
		String[] s3 = new String[] {"1","2","3"};*/
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}
}
