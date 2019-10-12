package com.crowdTwist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class OrderHistoryPage extends BaseClass{
	
	public OrderHistoryPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@id=\"order-list\"]/tbody/tr/td[3]")
	private WebElement orderPrice;

	public WebElement getOrderPrice() {
		return orderPrice;
	}
	

}
