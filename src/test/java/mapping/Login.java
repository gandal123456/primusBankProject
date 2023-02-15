package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login 
{
	@Given ("^user launch \"(.*)\" browser with exe as \"(.*)\"$")	
	public void bLaunch(String name, String exe)
	{
		 Object[] input1=new Object[2];
         input1[0]=name;
         input1[1]=exe;	          
         SeleniumOperations.browserLaunch(input1);
	}

	
	@Given ("^user provide url as \"(.*)\"$")	
	public void opeApp(String url)
	{
		 Object[] input2=new Object[1];
         input2[0]=url;          
		 SeleniumOperations.openApp(input2);		 
	}
	
	@When("^user provide \"([^\"]*)\" as Username$")
	public void uname(String userN)
	{
		 Object[] input3=new Object[2];
         input3[0]="//*[@id='txtuId']";
         input3[1]=userN;	          
         SeleniumOperations.sendText(input3);
	}
	
	@When ("^user provide \"(.*)\" as password$")
	public void pass(String passW)
	{
		 Object[] input4=new Object[2];
         input4[0]="//*[@name='txtPword']";
         input4[1]=passW;	          
         SeleniumOperations.sendText(input4);
	}
	
	@When ("^user click on Login button$")
	public void LoginC()
	{
		 Object[] input5=new Object[1];
         input5[0]="//*[@id='login']";          
		 SeleniumOperations.clickOnElement(input5);
	}
	
	
	@Then ("^application shows user profile to user$")
	 public void validation()
	 {
		 Object[] input6=new Object[2];
         input6[0]="Admin";
         input6[1]="//*[text()='Admin']";	          
         SeleniumOperations.validation(input6);
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
