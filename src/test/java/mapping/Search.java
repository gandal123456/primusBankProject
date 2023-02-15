package mapping;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Search 
{
	
	@When("user click on branches")
	public void user_click_on_branches() 
	{
		 Object[] input6=new Object[1];
         input6[0]="(//*[@height='24'])[2]";          
		 SeleniumOperations.clickOnElement(input6); 
	}

	@When("user select {string} as country")
	public void user_select_as_country(String value)
	{
		 Object[] input7=new Object[2];
         input7[0]="//*[@name='lst_countryS']";
         input7[1]=value;	          
         SeleniumOperations.valueFromDropDown(input7);
	}

	@When("user select {string} as state")
	public void user_select_as_state(String string)
	{
	  
	}

	@When("user select {string} as city")
	public void user_select_as_city(String string) 
	{
	  
	}

	@When("user click on submit")
	public void user_click_on_submit() 
	{
	   
	}

	@Then("application shows list of branches for mumbai city")
	public void application_shows_list_of_branches_for_mumbai_city()
	{
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
