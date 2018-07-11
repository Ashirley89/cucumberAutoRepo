package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef {
	
	
WebDriver driver=null;
	
	@Given("^User needs to be on demo site page$")
	public void user_needs_to_be_on_demo_site_page (){
		System.setProperty("webdriver.chrome.driver", "/Users/kuntu/softwareqa/chromedriver"); 
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
	
	
	@When("^User enters firstname$")
	public void user_enters_firstname () throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Tom");
		Thread.sleep(1000);
	}
	
	@Then("^User enters lastname$")
	public void user_enters_lastname () throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Brady");
		Thread.sleep(1000);
	}
	

}
