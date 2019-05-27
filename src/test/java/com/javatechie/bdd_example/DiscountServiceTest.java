package com.javatechie.bdd_example;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Unit test for simple App.
 */
public class DiscountServiceTest {

	DiscountService service = null;
	String percentage = "";

	@Given("^Execute DiscountService Business$")
	public void execute_DiscountService_Business() throws Throwable {
		service = new DiscountService();
	}

	@When("^if i will enter (\\d+)$")
	public void if_i_will_enter(int arg1) throws Throwable {
		percentage = service.getDiscount(arg1);
	}

	@Then("^we should get ten percentage discount$")
	public void we_should_get_ten_percentage_discount() throws Throwable {
		Assert.assertEquals("10%", percentage);
	}

	@Then("^we should get fifteen percentage discount$")
	public void we_should_get_fifteen_percentage_discount() throws Throwable {
		Assert.assertEquals("15%", percentage);
	}
	@Then("^we shouldn't get any percentage$")
	public void we_shouldn_t_get_any_percentage()  {
		Assert.assertEquals("NA", percentage);
	}
}
