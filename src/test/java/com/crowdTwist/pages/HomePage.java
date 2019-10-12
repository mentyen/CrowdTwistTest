package com.crowdTwist.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement emailExistingCustomer;
	
	@FindBy(id = "passwd")
	private WebElement paswordExistingCustomer;
	
	@FindBy(id = "SubmitLogin")
	private WebElement signInButton;
	
	@FindBy(id = "email_create")
	private WebElement emailCreate;
	
	@FindBy(id = "SubmitCreate")
	private WebElement createAnAccount;
	
	public WebElement getCreateAnAccount() {
		return createAnAccount;
	}

	@FindBy(id="create-account_form")
	private WebElement createAccountForm;
	
	public WebElement getCreateAccountForm() {
		return createAccountForm;
	}

	public WebElement getEmailCreate() {
		return emailCreate;
	}

	public WebElement getEmailExistingCustomer() {
		return emailExistingCustomer;
	}

	public WebElement getPaswordExistingCustomer() {
		return paswordExistingCustomer;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	

}
