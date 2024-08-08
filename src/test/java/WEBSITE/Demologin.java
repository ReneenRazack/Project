package WEBSITE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demologin {
	WebDriver driver;
	@Test(dataProvider="logindata")
	public void cls(String username,String password) {
		System.setProperty("Webdriver.edge.driver","D:\\edgedriver_win64 (shhh)\\Edgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		driver=new EdgeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	}
	@AfterClass
	public void testlog() {
		driver.quit();
	}
	@DataProvider (name="logindata")
	public Object[][] provideData() {
		return new Object[][] {
			{"user2", "pass2"},
			{"username", "password"},
			{"Admin", "admin123"},
		};
	}


}
