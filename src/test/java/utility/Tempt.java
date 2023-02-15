package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{	
	public static void main(String[] args) throws InterruptedException
	{		
       System.setProperty("webdriver.chrome.driver", "G:\\Automation Support\\chromedriver.exe");	
		
		ChromeDriver driver=new ChromeDriver();		
		
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		
		//enter username
		driver.findElementByXPath("//*[@id='txtuId']").sendKeys("Admin");
		
		//enter password
		driver.findElementByXPath("//*[@name='txtPword']").sendKeys("Admin");
		
		
		//click on Login button
		driver.findElementByXPath("//*[@id='login']").click();
		
		
		
		
		
		
		
	}	
	
}