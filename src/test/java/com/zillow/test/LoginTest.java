package com.zillow.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zillow.base.TestBase;
import com.zillow.page.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginPage;
	
	@BeforeMethod
	public void driverSetup() {
		setup();
	 loginPage = new LoginPage();
	}

	@Test
	public void signintest() {
		loginPage.login();
		Assert.assertTrue(true);

	}
	

	@Test
	public void pwd() {
		loginPage.forgetpasswordlink();
	}
}
