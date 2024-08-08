package WEBSITE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DEMOBLAZE {
	
	WebDriver driver;
	@Test(dataProvider="data")
	public void project(String email,String name,String message,String name1,String country,String city,String phone,String month,String year,String name2,String country2,String city2,String phone2,String month2,String year2,String name3,String password,String name4,String password2) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64.exe");
		
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
//////////////////////////////HOME PAGE//////////////////////////////////////////////////
driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
//////////////////////////home button will work///////////////////////////////
driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
//////////////////////////contact button will work/////////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(email);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys(name);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys(message);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")).click();
Thread.sleep(2000);

////////////////////////user can enter details in contact page//////////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
//////////////////////////////////about us///////////////////////////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"example-video\"]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
////////////////////////////////vid and close button works perfectly in about us page/////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
////////////////////////////////cart page will open for user//////////////////////////////
driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
////////////////////////////////place order button will work//////////////////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name1);
driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys(country);
driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(city);
driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys(phone);
driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys(month);
driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys(year);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")).click();
////////////////////////////will enter details in place order page and close button will work//////////////////////
driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name2);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys(country2);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(city2);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys(phone2);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys(month2);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys(year2);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
///////////////place order page will open details will be added after that purchase button will work////////////
driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys(name3);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys(password);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).click();
Thread.sleep(000);


/////////////////////////////////sign up page will open and details will be added//////////////////////////////////////
//Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(name4);
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(password2);
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).click();
////////////////////////login page will open and details will be addded///////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
//////////////////////samsung phone page will open and return back to home page/////////////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img")).click();
driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
//////////////////nokia phone page will open and return back to home page///////////////////////////////////

Thread.sleep(3000);
JavascriptExecutor js1=(JavascriptExecutor)driver;
WebElement scroll=driver.findElement(By.cssSelector("#article"));
js1.executeScript("arguments[0].scrollIntoView();",scroll);
///////////////////scroll down to bottom of the page//////////////////////////////////////////
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"prev2\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"next2\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"prev2\"]")).click();
///////////////////////////////////preview and next button works////////////////////////////////////////////

	}
	@AfterClass
	public void testlog() {
		driver.quit();
}
	@DataProvider (name="data")
	public Object[][] provideData() {
		return new Object[][] {
			{"blah@gmail.com","blaah","big brrrr","RANGA","india","kochi","2452452532","march","2999","BABU","america","los angles","463563","may","3232","croods","1234","croods","1234"}
		};
	}


//////////////////////////////first one///////////////////////////////////////////////////
              @Test(dataProvider="haaa")
            public void project2(String  name,String pass) throws InterruptedException {
            		System.setProperty("webdiver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64.exe");
            		
            		ChromeOptions options=new ChromeOptions();
            		driver=new ChromeDriver(options);
            		driver.get("https://www.demoblaze.com/");
            		driver.manage().window().maximize();
            		
            		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
            		Thread.sleep(4000);
            		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(name);
            		Thread.sleep(4000);
            		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(pass);
            		Thread.sleep(4000);
            		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
            		Thread.sleep(5000);
              }
        @AfterClass
        public void close() throws InterruptedException {
        	
        	driver.quit();
        }
        @DataProvider(name="haaa")
        public Object[][] provideData1() {
    		return new Object[][] {
    			{"trytr", "rurtjr"},
    			{"brrr", "gfgsdg"},
    			{"croodss", "12345"},
    		};
        }
}
