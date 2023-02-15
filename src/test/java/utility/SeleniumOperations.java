package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations
{
		public static WebDriver driver;	
	  //LaunchBrowser
	             public static void browserLaunch(Object[]inputParameters)
	             {
	            	 try{
	            		 
	            	 
	            	 String bname=(String) inputParameters[0];     //Chrome
	            	 String exe=(String) inputParameters[1];	   //exe location
	              
	            	 if(bname.equalsIgnoreCase("Chrome"))
	            	 {
	            	    System.setProperty("webdriver.chrome.driver",exe);		         		
	         		  driver=new ChromeDriver();			         		
	         		  driver.manage().window().maximize();
	         		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	            	 }
	         		  
	            	 
	            	 else if(bname.equalsIgnoreCase("Firefox"))
	            	 {
	            		 System.setProperty("webdriver.gecko.driver",exe);		         		
		         		  driver=new FirefoxDriver();			         		
		         		  driver.manage().window().maximize();
		         		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	            		 
	            		 
	            	 }
	            	 }
	         		catch(Exception e)
	         		{
	         			System.out.println(e);
	         		}
	             }

	//openApplication
	              public static void openApp(Object[]inputParameters)
	              {
	            	  
	            	  try
	            	  {
	            	  String path=(String) inputParameters[0];
	            	  driver.get(path);	 
	            	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	            	  }
	            	  catch(Exception e)
		         		{
		         			System.out.println(e);
		         		}
	            	  }
	
	//sendTextOnUI
	              public static void sendText(Object[]inputParameters)
	              {
	            	  try
	            	  {
	            	  String locator=(String) inputParameters[0];
		            	 String value=(String) inputParameters[1];	       
		            	 
	            	
	            	  driver.findElement(By.xpath(locator)).sendKeys(value);
	            	  
	            	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	            	  }
	            	  catch(Exception e)
		         		{
		         			System.out.println(e);
		         		}
	              }
	              
	             
	    
	              
	              //clickOnElement
	              public static void clickOnElement(Object[]inputParameters)
	              {
	            	  try
	            	  {
	            	  String xpath=(String) inputParameters[0];
	            	  
	            	  driver.findElement(By.xpath(xpath)).click();       
	            	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	            	  }
	            	  catch(Exception e)
		         		{
		         			System.out.println(e);
		         		}
	              }
	
	
	              
	              
	              //validation
	              public static void validation(Object[]inputParameters)
	              {
	            	  
	            	  try
	            	  {
	            	  String inputGiven=(String) inputParameters[0];
	            	  String xpath=(String) inputParameters[1];
	            	  
	            	  
	            	  String capturedText=driver.findElement(By.xpath(xpath)).getText();
	            	  
	            	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	            	  
	            	  if(inputGiven.equalsIgnoreCase(capturedText))
	            	  {
	            		  System.out.println("Test case Pass");
	            		  
	            	  }else
	            	  {
	            		  System.out.println("Test case Fail");
	            	  }
	            	  
	            	  }
	            	  catch(Exception e)
		         		{
		         			System.out.println(e);
		         		}
	            	  
	              }
	
	              
	              
	              
	              
	              
	              public static void valueFromDropDown(Object[]inputParameters)
	              {
	            	  try
	            	  {
	            	
	            	  String xpath=(String) inputParameters[0];         //xpath
	            	  String text=(String) inputParameters[1];          //value
	            	  
	            	  
	            	  Select sel=new Select(driver.findElement(By.xpath(xpath)));
	            	  
	            	  
	            	          sel.selectByVisibleText(text);
	            	  
	            	  
	            	  }
	            	  catch(Exception e)
		         		{
		         			System.out.println(e);
		         		}
	            	  
	            	  
	            	  
	            	  
	            	  
	            	  
	            	
	              }
	
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	
	
	

}
