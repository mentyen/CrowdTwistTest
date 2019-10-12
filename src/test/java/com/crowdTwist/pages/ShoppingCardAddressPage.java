package com.crowdTwist.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class ShoppingCardAddressPage extends BaseClass{
	
	public ShoppingCardAddressPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="addressesAreEquals")
	private WebElement deliveryAddressEqualBillingAddressCheckBox;
	
	@FindBy(xpath="//ul[@id=\"address_delivery\"]/li")
	private List<WebElement> deliveryAddress;
	
	@FindBy(xpath="//ul[@id=\"address_invoice\"]/li")
	private List<WebElement> billingAddress;
	
	@FindBy(css="button[class=\"button btn btn-default button-medium\"]")
	private WebElement proceedToCheckout;

	public WebElement getDeliveryAddressEqualBillingAddressCheckBox() {
		return deliveryAddressEqualBillingAddressCheckBox;
	}

	public List<WebElement> getDeliveryAddress() {
		return deliveryAddress;
	}

	public List<WebElement> getBillingAddress() {
		return billingAddress;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

}
