package WEBSITE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TWOWEBSITES {

	@Test
	public void mav1() throws InterruptedException {
		System.setProperty("webdiver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		
//////////////////////////////HOME PAGE//////////////////////////////////////////////////
driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
//////////////////////////home button will work///////////////////////////////
driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
//////////////////////////contact button will work/////////////////////////////
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("heloo@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys("341252435");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys("blaah");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")).click();
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
driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("blaah");
driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("shshh");
driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("4536234563467");
driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("march");
driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1999");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")).click();
////////////////////////////will enter details in place order page and close button will work//////////////////////
driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("blaah");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("shshh");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("4536234563467");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("April");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1999");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
///////////////place order page will open details will be added after that purchase button will work////////////
driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("blaah");
driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("904868");
driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).click();
Thread.sleep(000);

/////////////////////////////////sign up page will open and details will be added///////////////////////////////////////
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("blaah");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("904868");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();
////////////////////////login page will open and details will be addded///////////////////////////
//driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
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
/////////////////////////////////preview and next button works////////////////////////////////////////////
	}
	
	
	//////SWAG LAB///////
	
	
	@Test
	public void mav2() throws InterruptedException {
		System.setProperty("webdriver.edgedriver","\"D:\\chromedriver_win64\\msedgedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("blah");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("boo");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("546574");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("blah");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("boo");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("546574");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("blah");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("boo");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("546574");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > button")).click();
		driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_item_label > div.item_pricebar > button")).click();
		driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_secondary")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("fddd");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("shdjs");
		driver.findElement(By.cssSelector("#postal-code")).sendKeys("15412");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
		//error
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("inventory_sidebar_link")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
		element.sendKeys("Name (Z to A)");
		element.click();
		driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
		Thread.sleep(4000);
		WebElement element1=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
		element1.sendKeys("Name (A to Z)");
		element1.click();
		driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
		Thread.sleep(4000);
		WebElement element2=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
		element2.sendKeys("Price (low to high)");
		element2.click();
		driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
		Thread.sleep(4000);
		WebElement element3=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
		element3.sendKeys("Price (high to low");
		element3.click();
		
	}
}
