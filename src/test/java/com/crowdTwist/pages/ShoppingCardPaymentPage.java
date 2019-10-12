package com.crowdTwist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class ShoppingCardPaymentPage extends BaseClass{
	
	public ShoppingCardPaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="bankwire")
	private WebElement payByBankWire;
	
	@FindBy(className="cheque")
	private WebElement payByCheque;
	
	@FindBy(css="button[class=\"button btn btn-default button-medium\"]")
	private WebElement confirmMyOrder;
	
	@FindBy(css="div[class=\"box order-confirmation\"]")
	private WebElement orderDetails;
	
	@FindBy(css="a[class=\"button-exclusive btn btn-default\"]")
	private WebElement backToOrder;

	public WebElement getPayByBankWire() {
		return payByBankWire;
	}

	public WebElement getPayByCheque() {
		return payByCheque;
	}

	public WebElement getConfirmMyOrder() {
		return confirmMyOrder;
	}

	public WebElement getBackToOrder() {
		return backToOrder;
	}

	public WebElement getOrderDetails() {
		return orderDetails;
	}
	
	
}
