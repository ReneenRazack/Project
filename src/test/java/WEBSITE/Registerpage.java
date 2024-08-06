package WEBSITE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registerpage {

	WebDriver driver;

	@Test(dataProvider = "register")
	public void cls(String firstname, String lastname, String address, String email, String phone, String password,
			String confirmpass) throws InterruptedException {

		System.setProperty("Webdriver.chrome.Driver",
				"D:\\\\games\\\\study\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(firstname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(lastname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(address);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(phone);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		dropdown.click();
    	Thread.sleep(2000);
//    	WebElement dropdown5 = driver
//				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[3]/a"));	
//    	dropdown5.click();
//		Thread.sleep(2000);

		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		dropdown2.click();
		Thread.sleep(2000);
		WebElement dropdown25 = driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[3]"));
		dropdown25.click();
		Thread.sleep(2000);
		WebElement dropdown3 = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		dropdown3.click();
		Thread.sleep(2000);
		WebElement dropdown35 = driver.findElement(By.xpath("//*[@id=\"country\"]/option[6]"));
		dropdown35.click();
		Thread.sleep(2000);
		WebElement dropdown4 = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		dropdown4.click();
		Thread.sleep(2000);
		WebElement dropdown45 = driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[30]"));
		dropdown45.click();
		Thread.sleep(2000);
		WebElement dropdown51 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		dropdown51.click();
		Thread.sleep(2000);
		WebElement dropdown55 = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[11]"));
		dropdown55.click();
		Thread.sleep(2000);
		WebElement dropdown6 = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		dropdown6.click();
		WebElement dropdown65 = driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[32]"));
		dropdown65.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(confirmpass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Button1\"]")).click();
		
	}
		@DataProvider(name="register")
		public Object[][] provideData() {
			return new Object[][] {
			{"blah","shhh","shoo","vvh@gmail.com","b679699697","fufuttu","fufuttu"}
		};

	}

}
