package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TargetHomePage {
	public WebDriver driver;

	public TargetHomePage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	WebElement searchBox;

	public void enterSearchTerm1(String term) {
		searchBox.sendKeys(term);
	}

	@FindBy(name = "btnK")
	WebElement searchButton;

	public void clickSearchButton() {
		searchButton.submit();

	}

	@FindBy(className = "LC20lb MBeuO DKV0Md")
	WebElement targetButton;

	public void clickTargetButton() {
		targetButton.click();
	}

}
