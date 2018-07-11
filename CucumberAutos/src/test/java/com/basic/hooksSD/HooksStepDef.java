package com.basic.hooksSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDef {
	
	WebDriver driver =null;
	
	@Before(order=1)
	public void beforeSetup1() {
		System.out.println("In before1");
		System.setProperty("webdriver.chrome.driver", "/Users/kuntu/softwareqa/chromedriver"); 
		driver = new ChromeDriver();
	}
	
	@Before(order=2)
	public void beforeSetup2() {
		System.out.println("In before2");
		
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

	@Then("^User checks if user \"([^\"]*)\" First Name is present$")
	public void User_checks_if_User_First_Name_is_present (String userName) throws InterruptedException{
		String userNameActual =driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
	}
	
	@And("^User enters User \"([^\"]*)\" Lastname$")
	public void User_enters_User_Lastname (String lastName) throws InterruptedException{
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		Thread.sleep(1000);
	}
	
	@Then("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank () throws InterruptedException{
		String mobileActual =driver.findElement(By.name("reg_email__")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	//@Then("^Close browser$")
	//public void Close_browser (){
	//}

	@After(order=2)
	public void tearDown1() {
		System.out.println("In After1");
		driver.quit();
		driver =null;	
	}
	
	@After(order=1)
	public void tearDown2() {
		System.out.println("In After2");
		
	}
}
