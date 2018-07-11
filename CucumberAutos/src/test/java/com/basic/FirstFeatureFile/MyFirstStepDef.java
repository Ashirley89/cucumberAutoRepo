package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^User needs to be on Facebook login page$")
	public void User_needs_to_be_on_Facebook_login_page (){
		System.setProperty("webdriver.chrome.driver", "/Users/kuntu/Desktop/softwareqa/chromedriver"); 
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^User enters User First Name$")
	public void User_enters_User_First_Name (){
		
		driver.findElement(By.name("firstname")).sendKeys("Delaney");
	}

	@Then("^User checks if user First Name is present$")
	public void User_checks_if_User_First_Name_is_present (){
		String userNameActual =driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals("Delaney", userNameActual);
	}
	
}

