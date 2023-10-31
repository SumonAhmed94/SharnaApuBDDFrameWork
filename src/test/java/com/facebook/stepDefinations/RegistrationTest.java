package com.facebook.stepDefinations;


import com.facebook.registrationPages.RegistrationPage;
import facebook.base.BaseStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest extends BaseStep {
	RegistrationPage rp;

	@Given("Open facebook home page")
	public void openFacebookHomePage() {
		openApp();
	}

	@When("Click on registration button")
	public void clickOnRegistrationButton() {
		rp = new RegistrationPage(driver);
		rp.createNewAccountButton();
	}

	@When("In put first Name {string}")
	public void inPutFirstName(String enterFirstName) {
		rp.firstNameField(enterFirstName);
	}

	@When("Input last Name {string}")
	public void inputLastName(String enterLastName) {
		rp.lastNameField(enterLastName);
	}

	@When("Input email {string}")
	public void inputEmail(String enterEmail) {
		rp.emailField(enterEmail);
	}

	@When("Input re enter email {string}")
	public void inputReEnterEmail(String enterconfirmEmail) {
		rp.reEnterEmail(enterconfirmEmail);
	}

	@When("Input password {string}")
	public void inputPassword(String enterYourPassword) {
		rp.passwordField(enterYourPassword);
	}

	@When("Input birth Month {string}")
	public void inputBirthMonth(String enterYourBirthMonth) {
		rp.monthDropDownField(enterYourBirthMonth);
	}

	@When("Input birth Day {string}")
	public void inputBirthDay(String enterYourBirthDay) {
		rp.dayDropDownField(enterYourBirthDay);
	}

	@When("Input birth Year {string}")
	public void inputBirthYear(String enterYourBirthYear) {
		rp.yearDropDownField(enterYourBirthYear);
	}

	@When("Input gender {string}")
	public void inputGender(String enterYourgender) {
		rp.radioButton(enterYourgender);
	}

	@Then("I can create an account")
	public void iCanCreateAnAccount() {

	}

}
