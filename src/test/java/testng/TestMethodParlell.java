package testng;

import org.testng.annotations.Test;

public class TestMethodParlell 
{
  @Test
  public void testA1() 
  {
	  System.out.println("Iam testA1 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void testA2() 
  {
	  System.out.println("Iam testA2: "+ Thread.currentThread().getId());
  }
  
  @Test
  public void testA3() 
  {
	  System.out.println("Iam testA3 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void testA4() 
  {
	  System.out.println("Iam testA4 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void testA5() 
  {
	  System.out.println("Iam testA5: "+ Thread.currentThread().getId());
  }
  
  @Test
  public void testA6() 
  {
	  System.out.println("Iam testA6 : "+ Thread.currentThread().getId());
  }
}
