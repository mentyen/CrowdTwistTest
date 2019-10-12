package com.crowdTwist.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class ShoppingCardSummaryPage extends BaseClass {
	
	public ShoppingCardSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="total_price_container")
	private WebElement totalPrice;
	
	@FindBy(className="cart_product")
	private WebElement productPic;
	
	@FindBy(className="cart_description")
	private WebElement productDescription;
	
	@FindBy(className="cart_avail")
	private WebElement productAvalibility;
	
	@FindBy(className="cart_unit")
	private WebElement unitPrice;
	
	@FindBy(className="cart_quantity text-center")
	private WebElement quantity;
		
	@FindBy(css="a[class=\"button btn btn-default standard-checkout button-medium\"]")
	private WebElement proceedToCheckout;

	public WebElement getProductPic() {
		return productPic;
	}

	public WebElement getProductDescription() {
		return productDescription;
	}

	public WebElement getProductAvalibility() {
		return productAvalibility;
	}

	public WebElement getUnitPrice() {
		return unitPrice;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}
	
		
}
