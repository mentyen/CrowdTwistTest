package com.crowdTwist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class ShoppingCardShippingPage extends BaseClass{
	
	public ShoppingCardShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	@FindBy(css="input[type=\"checkbox\"]")
	private WebElement termsOfServiceCheckBox;
	
	@FindBy(css="button[name=\"processCarrier\"]")
	private WebElement proceedToCheckout;
	
}
