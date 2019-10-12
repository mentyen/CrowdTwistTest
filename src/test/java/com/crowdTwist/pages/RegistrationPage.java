package com.crowdTwist.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "uniform-id_gender1")
	private WebElement titleMr;

	@FindBy(id = "uniform-id_gender2")
	private WebElement titleMrs;

	@FindBy(id = "customer_firstname")
	private WebElement customerfirstName;

	@FindBy(id = "customer_lastname")
	private WebElement customerlastName;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//form[@id=\"account-creation_form\"]/div/div[4]")
	private WebElement emailValidationMessage;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(xpath = "//form[@id=\"account-creation_form\"]/div/div[5]")
	private WebElement passwordValidationMessage;

	@FindBy(id = "days")
	private List<WebElement> dateOfBirthDays;

	@FindBy(id = "months")
	private List<WebElement> dateOfBirthMonth;

	@FindBy(id = "years")
	private List<WebElement> dateOfBirthyears;

	@FindBy(id = "uniform-id_gender2")
	private WebElement newsletter;

	@FindBy(id = "uniform-id_gender2")
	private WebElement specialOffers;

	@FindBy(id = "firstname")
	private WebElement firstName;

	@FindBy(id = "customer_firstname")
	private WebElement lastname;

	@FindBy(id = "company")
	private WebElement company;

	@FindBy(id = "address1")
	private WebElement address;

	@FindBy(id = "address2")
	private WebElement addressLine2;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "id_state")
	private WebElement states;

	@FindBy(id = "id_country")
	private WebElement countries;

	@FindBy(id = "postcode")
	private WebElement zip;

	@FindBy(id = "other")
	private WebElement additionalinformation;

	@FindBy(id = "phone")
	private WebElement homePhone;

	@FindBy(id = "phone_mobile")
	private WebElement mobilePhone;

	@FindBy(id = "alias")
	private WebElement addressAlias;

	@FindBy(id = "submitAccount")
	private WebElement submitAccount;

	public WebElement getAddressAlias() {
		return addressAlias;
	}

	public WebElement getTitleMr() {
		return titleMr;
	}

	public WebElement getTitleMrs() {
		return titleMrs;
	}

	public WebElement getCustomerfirstName() {
		return customerfirstName;
	}

	public WebElement getCustomerlastName() {
		return customerlastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEmailValidationMessage() {
		return emailValidationMessage;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPasswordValidationMessage() {
		return passwordValidationMessage;
	}

	public List<WebElement> getDateOfBirthDays() {
		return dateOfBirthDays;
	}

	public List<WebElement> getDateOfBirthMonth() {
		return dateOfBirthMonth;
	}

	public List<WebElement> getDateOfBirthyears() {
		return dateOfBirthyears;
	}

	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getSpecialOffers() {
		return specialOffers;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAddressLine2() {
		return addressLine2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getStates() {
		return states;
	}

	public WebElement getCountries() {
		return countries;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getAdditionalinformation() {
		return additionalinformation;
	}

	public WebElement getHomePhone() {
		return homePhone;
	}

	public WebElement getMobilePhone() {
		return mobilePhone;
	}

	public WebElement getSubmitAccount() {
		return submitAccount;
	}

}
