package com.basic.sharedataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	WebDriver driver;
	
	public ShareDataStepDef (SharedClass Share) {
		driver = Share.setup();
	}
		
	
	
	
	@Given("^User needs to be on Facebook login page$")
	public void User_needs_to_be_on_Facebook_login_page (){
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^User enters User \"([^\"]*)\" First Name$")
	public void User_enters_User_First_Name (String userName) throws InterruptedException{
		driver.findElement(By.name("firstname")).sendKeys(userName);
		Thread.sleep(1000);
	}
	
	
}
