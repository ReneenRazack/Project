package WEBSITE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class futuralabs {
	WebDriver driver;

	@Test
	public void cls() throws InterruptedException {
		System.setProperty("Webdriver.chrome.Driver",
				"D:\\\\games\\\\study\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://thefuturalabs.com/");
		driver.manage().window().maximize();

		 List<WebElement> buttons = driver.findElements(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div[1]/div[1]/div/div/div/div/div/div/a[2]"));

	        // Loop through and click each button
	        for (WebElement button : buttons) {
	            button.click();
		  

	        }
		

}
	}
