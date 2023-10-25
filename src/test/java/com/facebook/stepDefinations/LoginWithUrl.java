package com.facebook.stepDefinations;

import org.openqa.selenium.By;

import com.facebook.loginPages.LoginPage;

import facebook.base.BaseStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithUrl extends BaseStep {
	LoginPage lp;
	@Given("I open {string} and {string}")
	public void iOpenAnd(String browser, String url) {
		openApp(browser, url);
	}
	@When("enter valid user name {string}")
	public void enterValidUserName(String username) {
		//driver.findElement(By.id("email")).sendKeys(username);
	lp=new LoginPage(driver);
		lp.userNameMethod(username);
	}
	@When("enter valid password {string}")
	public void enterValidPassword(String password) {
		lp.passWordMethod(password);
		//driver.findElement(By.id("pass")).sendKeys(password);
	}
	@When("click loginButton")
	public void clickLoginButton() {
		lp.logingButton();
		
	}
	@Then("User logged in Facebook")
	public void userLoggedInFacebook() {
		closeApp();
	}



}
