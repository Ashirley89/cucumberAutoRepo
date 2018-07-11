package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
	
WebDriver driver=null;
	
	@Given("^User needs to be on google page$")
	public void User_needs_to_be_on_google_page (){
		System.setProperty("webdriver.chrome.driver", "/Users/kuntu/Desktop/softwareqa/chromedriver"); 
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	
	@When("^User enters search string$")
	public void User_enters_search_string () throws InterruptedException{
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(1000);
	}
	

}
