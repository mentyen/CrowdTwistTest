package com.crowdTwist.steps;

import org.junit.Assert;

import com.crowdTwist.pages.HomePage;
import com.crowdTwist.pages.MyAccountPage;
import com.crowdTwist.pages.RegistrationPage;
import com.crowdTwist.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration extends CommonMethods {

	public HomePage home;
	public RegistrationPage registrationPage;
	public MyAccountPage myAccountPage;
	public String randomeEmail;

	@Given("I am on a home page")
	public void i_am_on_a_home_page() throws InterruptedException {

		home = new HomePage();

		waitForElementBeVisible(home.getCreateAccountForm(), 5);

		Assert.assertTrue(home.getCreateAccountForm().isDisplayed());

	}

	@Given("I enter valid email address")
	public void i_enter_valid_address() {

		sendText(home.getEmailCreate(), getEmail());
		
		randomeEmail=home.getEmailCreate().getAttribute("value").toString();

	}

	@Given("I click create an account button")
	public void i_click_create_an_account_button() {

		click(home.getCreateAnAccount());

	}

	@When("I enter {string} and {string} and {string} and verify email")
	public void i_enter_and_and_and(String firstName, String lastName, String password)
			throws InterruptedException {

		registrationPage = new RegistrationPage();

		waitForElementBeVisible(registrationPage.getFirstName(), 5);

		sendText(registrationPage.getCustomerfirstName(), firstName);

		sendText(registrationPage.getCustomerlastName(), lastName);

		if (registrationPage.getEmail().getAttribute("value").contains(randomeEmail)) {
			registrationPage.getEmail().click();
		} else {
			sendText(registrationPage.getEmail(), getEmail());
		}

		sendText(registrationPage.getPassword(), password);

	}

	@When("I enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void i_enter_and_and_and_and_and(String firstName, String lastName, String address, String city,
			String state, String zip, String country, String phone) throws InterruptedException {

		if (!registrationPage.getFirstName().getAttribute("value").contains(firstName)) {
			sendText(registrationPage.getFirstName(), firstName);
		}

		if (!registrationPage.getLastname().getAttribute("value").contains(lastName)) {
			sendText(registrationPage.getLastname(), lastName);
		}

		sendText(registrationPage.getAddress(), address);

		sendText(registrationPage.getCity(), city);

		selectValueFromDD(registrationPage.getStates(), state);

		sendText(registrationPage.getZip(), zip);

		selectValueFromDD(registrationPage.getCountries(), country);

		sendText(registrationPage.getMobilePhone(), phone);

		registrationPage.getSubmitAccount().click();

	}

	@Then("I click register and verify that account was created")
	public void i_click_register_and_verify_that_account_was_created() throws InterruptedException {

		myAccountPage = new MyAccountPage();

		Assert.assertTrue(myAccountPage.getMyAccountTextCenterColumn().isDisplayed());
	}	

}
