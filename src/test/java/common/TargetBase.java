package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TargetBase {
	public WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// what is implicit wait
		// what are the different type of wait in selenium?
		// implicit wait and explicit wait

	}

	public void closeBrowser() {
		driver.close();
	}

	public void closeAllBrowser() {
		driver.quit();
	}

}
