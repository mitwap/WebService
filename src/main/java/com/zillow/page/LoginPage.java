package com.zillow.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zillow.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(linkText="Sign in")
	WebElement signin;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='inputs-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Sign in']")
	WebElement submit;
	
	@FindBy(linkText="Forgot your password?")
	WebElement pwdLink;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void login() {
		signin.click();
		
	}
	/*public void loginDetails(String eml, String pwd) {
		Alert alert = driver.switchTo().alert();
		email.sendKeys(eml);
		password.sendKeys(pwd);
		submit.submit();
	}
	*/
	
	public void forgetpasswordlink() {
		pwdLink.click();
		
	}
	
}
