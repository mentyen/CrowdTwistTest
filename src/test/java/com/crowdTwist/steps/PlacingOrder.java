package com.crowdTwist.steps;

import org.junit.Assert;

import com.crowdTwist.pages.DressesPage;
import com.crowdTwist.pages.HomePage;
import com.crowdTwist.pages.OrderHistoryPage;
import com.crowdTwist.pages.ShoppingCardAddressPage;
import com.crowdTwist.pages.ShoppingCardPaymentPage;
import com.crowdTwist.pages.ShoppingCardShippingPage;
import com.crowdTwist.pages.ShoppingCardSummaryPage;
import com.crowdTwist.utils.CommonMethods;
import com.crowdTwist.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlacingOrder extends CommonMethods {

	public HomePage home;
	public DressesPage dressesPage;
	public ShoppingCardSummaryPage shoppingCardSummaryPage;
	public ShoppingCardAddressPage shoppingCardAddressPage;
	public ShoppingCardPaymentPage shoppingCardPaymentPage;
	public ShoppingCardShippingPage shoppingCardShippingPage;
	public OrderHistoryPage orderHistoryPage;
	public String expectedPrice;
	public String orderDetails;

	@When("I enter userName and Password and click Login")
	public void i_enter_userName_and_Password_and_click_Login() throws InterruptedException {

		home = new HomePage();

		sendText(home.getEmailExistingCustomer(), ConfigsReader.getProperty("userName"));

		sendText(home.getPaswordExistingCustomer(), ConfigsReader.getProperty("password"));

		home.getSignInButton().click();

	}

	@Given("I am on a {string} page")
	public void i_am_on_a_page(String url) throws InterruptedException {

		driver.get(url);
	}

	@Given("I add to card first availible dress and click proceed to checkout")
	public void i_add_to_card_first_availible_dress_and_click_proceed_to_checkout() throws InterruptedException {

		dressesPage = new DressesPage();

		jsClick(dressesPage.getFirstInLineDress());

		waitForElementBeVisible(dressesPage.getAddToCard(), 10);

		jsClick(dressesPage.getAddToCard());

		waitForElementBeVisible(dressesPage.getProceedToCheckout(), 10);

		jsClick(dressesPage.getProceedToCheckout());

	}

	@When("I verify that item is avalible in card")
	public void i_verify_that_item_is_avalible_in_card() {

		shoppingCardSummaryPage = new ShoppingCardSummaryPage();

		expectedPrice = shoppingCardSummaryPage.getTotalPrice().getText().trim();

		Assert.assertTrue(shoppingCardSummaryPage.getProductAvalibility().isDisplayed());

	}

	@When("I click next and choose delivery same as billing address")
	public void i_click_next_and_choose_delivery_same_as_billing_address_verify_addresses() {

		shoppingCardSummaryPage.getProceedToCheckout().click();

		shoppingCardAddressPage = new ShoppingCardAddressPage();

		if (!shoppingCardAddressPage.getDeliveryAddressEqualBillingAddressCheckBox().isSelected()) {
			
			shoppingCardAddressPage.getDeliveryAddressEqualBillingAddressCheckBox().click();
		}

	}

	@When("I click next and click Terms of service and click proceed to checkout")
	public void i_click_next_and_click_Terms_of_service_and_click_proceed_to_checkout() {

		shoppingCardAddressPage.getProceedToCheckout().click();

		shoppingCardShippingPage = new ShoppingCardShippingPage();

		if (!shoppingCardShippingPage.getTermsOfServiceCheckBox().isSelected()) {

			shoppingCardShippingPage.getTermsOfServiceCheckBox().click();
		}

		shoppingCardShippingPage.getProceedToCheckout().click();
	}

	@When("I choose pay by bank wire and click confirm")
	public void i_choose_pay_by_bank_wire_and_click_confirm() {

		shoppingCardPaymentPage = new ShoppingCardPaymentPage();

		shoppingCardPaymentPage.getPayByBankWire().click();

		shoppingCardPaymentPage.getConfirmMyOrder().click();

	}

	@Then("I click Back to order and verify order details")
	public void i_click_Back_to_order_and_verify_order_details() {

		waitForElementBeVisible(shoppingCardPaymentPage.getBackToOrder(), 10);

		shoppingCardPaymentPage.getBackToOrder().click();

		orderHistoryPage = new OrderHistoryPage();

		String actual = orderHistoryPage.getOrderPrice().getText().trim();

		Assert.assertEquals(expectedPrice, actual);
	}

}
