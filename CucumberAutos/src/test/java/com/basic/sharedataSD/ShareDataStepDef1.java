package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShareDataStepDef1 {
	
	WebDriver driver;
	
	public ShareDataStepDef1 (SharedClass Share) {
		driver = Share.setup();
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
	
	
	
}
