package com.basic.datatableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDef {
	
	WebDriver driver;
	
	@Given("^User needs to be on Facebook login page$")
	public void User_needs_to_be_on_Facebook_login_page (){
		System.setProperty("webdriver.chrome.driver", "/Users/kuntu/Desktop/softwareqa/chromedriver"); 
		driver = new ChromeDriver();
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
	
	@But("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank () throws InterruptedException{
		String mobileActual =driver.findElement(By.name("reg_email__")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	@Then("^Close browser$")
	public void Close_browser (){
		driver.quit();
		driver =null;
	}
	
	@When("Enter following data")
	public void enter_following_data(DataTable table) throws InterruptedException{
		List<List<String>> data = table.raw();
		
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		String values3 = data.get(0).get(2);
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);
		
		
		driver.findElement(By.name("firstname")).sendKeys(values4);
		driver.findElement(By.name("lastname")).sendKeys(values5);
		Thread.sleep(2000);
	}
	
}

