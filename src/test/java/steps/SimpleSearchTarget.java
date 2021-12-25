package steps;

import common.TargetBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TargetHomePage;

public class SimpleSearchTarget extends TargetBase {

	TargetHomePage thp;

	@Given("I am on the google home page")
	public void i_am_on_the_google_home_page() {
		launchBrowser();

	}

	@When("I enter search {string}")
	public void i_enter_search(String term) {
		thp = new TargetHomePage(driver);
		thp.enterSearchTerm1(term);

	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
		thp.clickSearchButton();

	}

	@Then("I land on the first result home page")
	public void i_land_on_the_first_result_home_page() {
		thp.clickTargetButton();

	}

	@Then("I click on Target")
	public void i_click_on_target() {

	}

	@Then("I land on target web page")
	public void i_land_on_target_web_page() {

		driver.close();

	}

}
