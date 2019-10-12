package com.crowdTwist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crowdTwist.utils.BaseClass;

public class MyAccountPage extends BaseClass {

	public MyAccountPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "account")
	private WebElement customerFirstLastName;

	@FindBy(id = "center_column")
	private WebElement myAccountTextCenterColumn;

	public WebElement getCustomerFirstLastName() {
		return customerFirstLastName;
	}

	public WebElement getMyAccountTextCenterColumn() {
		return myAccountTextCenterColumn;
	}

}
