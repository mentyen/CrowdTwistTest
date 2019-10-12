package com.crowdTwist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class DressesPage extends BaseClass {

	public DressesPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Printed Chiffon Dress')]")
	private WebElement firstInLineDress;
	
	@FindBy(css = "button[class=\"exclusive\"]")
	private WebElement addToCard;
	
	@FindBy(css="a[class=\"btn btn-default button button-medium\"]")
	private WebElement proceedToCheckout;

	public WebElement getFirstInLineDress() {
		return firstInLineDress;
	}

	public WebElement getAddToCard() {
		return addToCard;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

}
