package com.facebook.stepDefinations;

import com.facebook.loginPages.LoginPage;

import facebook.base.BaseStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenarioOutline extends BaseStep {
	LoginPage lp;
	String browser="chrome";
		@Given("users enter {string} and {string} to open app")
		public void usersEnterAndToOpenApp(String browser, String url) {
		    openApp();
		}
		@When("users enter {string} and {string} from the users")
		public void usersEnterAndFromTheUsers(String username, String password) {
			lp=new LoginPage(driver);
			lp.userNameMethod(username);
			lp.passWordMethod(password);
		    
		}
		@When("users click login button")
		public void usersClickLoginButton() {
			lp.logingButton();
		    
		}
		@Then("users can be logged in")
		public void usersCanBeLoggedIn() {
		   
		}


}





