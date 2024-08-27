package WEBSITE;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class selectorshub {

	WebDriver driver;

	@Test
	public void cls() throws InterruptedException {
		System.setProperty("Webdriver.chrome.Driver",
				"D:\\\\games\\\\study\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/");
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/section[2]/div/div[1]/div/div[1]/div/a/img")).click();
//		////////////////////////// will click on logo in home
//		////////////////////////// page//////////////////////////////////
//		Thread.sleep(4000);
//		WebElement dropdown = driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(dropdown).perform();
//		Thread.sleep(2000);
//		////////////////////// dropdown will work on products in
//		////////////////////// homepage////////////////////////////////
//		WebElement dropdown1 = driver.findElement(By.cssSelector("#menu-item-33 > div > a"));
//		Actions actions1 = new Actions(driver);
//		actions1.moveToElement(dropdown1).perform();
//		Thread.sleep(2000);
//		///////////////////// dropdown will work on pro plans in
//		///////////////////// homepage//////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"menu-item-1075\"]/a")).click();
//		driver.get("https://selectorshub.com/");
//		Thread.sleep(2000);
//		////////////////// courses page will open and return back to home page
//		////////////////// //////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"menu-item-4098\"]/a")).click();
//		driver.get("https://selectorshub.com/");
//		Thread.sleep(2000);
//		////////////////// practice page will open and will return back to home
//		////////////////// page//////////////////////////////
//		WebElement dropdown2 = driver.findElement(By.cssSelector("#menu-item-36 > div > a"));
//		Actions actions2 = new Actions(driver);
//		actions2.moveToElement(dropdown2).perform();
//		Thread.sleep(2000);
//		////////////////// resources dropdown works for user in home
//		////////////////// page///////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"menu-item-48\"]/a")).click();
//		driver.get("https://selectorshub.com/");
//		Thread.sleep(2000);
//		///////////////// help page will open will return back to home
//		///////////////// page/////////////////////////////
////		WebElement search = driver.findElement(By.id("f60c915"));
////		Actions actions3 = new Actions(driver);
////		actions3.moveToElement(search).perform();
////		Thread.sleep(2000);
////		WebElement search1= driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/section[2]/div/div[3]/div/div/div/form/div/input"));
////		search1.click();
/////////////////////////////////////////////////////////////search button////////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/div[1]/div/h4/a")).click();
//		Thread.sleep(5000);
//		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs1.get(1));
//		driver.close();
//		ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(0));
//		Thread.sleep(2000);
//		////////////////////todays offer page will open and page will close///////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[1]/div/div[1]/div/div[4]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs3.get(1));
//		driver.close();
//		ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs4.get(0));
//		Thread.sleep(2000);
//		////////////////////selectors hub install button will work and install page will close//////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[1]/div/div[2]/div/div[4]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs5 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs5.get(1));
//		driver.close();
//		ArrayList<String> tabs6 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs6.get(0));
//		Thread.sleep(2000);
//		/////////////testcase studio install page will open and page will close////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[1]/div/div[3]/div/div[4]/div/div/a/span")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs7 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs7.get(1));
//		driver.close();
//		ArrayList<String> tabs8 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs8.get(0));
//		Thread.sleep(2000);
//		///////////////////testcase daily install page will open and page will close/////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[1]/div/div[4]/div/div[4]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs9 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs9.get(1));
//		driver.close();
//		ArrayList<String> tabs10 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs10.get(0));
//		Thread.sleep(2000);
//		/////////////////autotest data page will open and page will close/////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[2]/div/div[1]/div/div[4]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs11 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs11.get(1));
//		driver.close();
//		ArrayList<String> tabs12 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs12.get(0));
//		Thread.sleep(2000);
//		//////////////////test case hub page will open and page will close///////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[2]/div/div[2]/div/div[4]/div/div/a")).click();
//		driver.get("https://selectorshub.com/");
//		/////////////selectors hubpro page will open and page will close/////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[2]/div/div[3]/div/div[4]/div/div/a/span")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs15 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs15.get(1));
//		driver.close();
//		ArrayList<String> tabs16 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs16.get(0));
//		Thread.sleep(2000);
//		/////////////testcase studio pro page will open and page will close////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[1]/div/section[2]/div/div[4]/div/div[4]/div/div/a/span")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs17 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs17.get(1));
//		driver.close();
//		ArrayList<String> tabs18 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs18.get(0));
//		Thread.sleep(2000);
//		///////////selectors hub ads page will open and page will close///////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[1]/div/div[2]/div/div[2]/div/a/img")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs19 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs19.get(1));
//		driver.close();
//		ArrayList<String> tabs20 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs20.get(0));
//		Thread.sleep(2000);
//		///////////sign up page will open and page will close///////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[2]/div/div/div/section/div/div[2]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs21 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs21.get(1));
//		driver.close();
//		ArrayList<String> tabs22 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs22.get(0));
//		Thread.sleep(2000);
//		/////////////////////////testing daily install page will open and close/////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[3]/div/div/div/section[1]/div/div[1]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs23 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs23.get(1));
//		driver.close();
//		ArrayList<String> tabs24 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs24.get(0));
//		Thread.sleep(2000);
//		////////////try now page will open and close////////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[3]/div/div/div/section[2]/div/div[2]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs25 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs25.get(1));
//		driver.close();
//		ArrayList<String> tabs26 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs26.get(0));
//		Thread.sleep(2000);
//		////////////selectors hub try now page will open and close////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[6]/div/div/div/section/div/div[2]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs27 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs27.get(1));
//		driver.close();
//		ArrayList<String> tabs28 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs28.get(0));
//		Thread.sleep(2000);
//		///////////////////testing daily install now button will work/////////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[7]/div/div/div/section/div/div[1]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs29 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs29.get(1));
//		driver.close();
//		ArrayList<String> tabs30 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs30.get(0));
//		Thread.sleep(2000);
//		/////////////////autotestdata try now page will open and close the page////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[8]/div/div/div/section/div/div[2]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs31 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs31.get(1));
//		driver.close();
//		ArrayList<String> tabs32 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs32.get(0));
//		Thread.sleep(2000);
//		///////////SELECTORSHUB PRO PAGE WILL OPEN AND CLOSE THE PAGE//////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[9]/div/div/div/section/div/div[1]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs33 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs33.get(1));
//		driver.close();
//		ArrayList<String> tabs34 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs34.get(0));
//		Thread.sleep(2000);
//		//////////TESTCASE STUDIO PRO PAGE WILL OPEN AND CLOSE///////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[10]/div/div/div/section/div/div[2]/div/div[3]/div/div/a")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs35 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs35.get(1));
//		driver.close();
//		ArrayList<String> tabs36 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs36.get(0));
//		Thread.sleep(2000);
//		//////////SELECTORSHUB ADS PAGE WILL  OPEN AND CLOSE///////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[11]/div/div/div/section/div/div[1]/div/div[3]/div/div/a/span/span")).click();
//		Thread.sleep(2000);
//		ArrayList<String> tabs37 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs37.get(1));
//		driver.close();
//		ArrayList<String> tabs38 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs38.get(0));
//		Thread.sleep(2000);
//		////////// AUTOMATE IT BUTTON WILL WORK /////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[1]/div/h2")).click();
//		Thread.sleep(5000);
//		driver.get("https://selectorshub.com/");
//		Thread.sleep(2000);
//		JavascriptExecutor js1=(JavascriptExecutor) driver;
//		WebElement scroll1=driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[1]/div/h2/theme-underline"));
//		js1.executeScript("arguments[0].scrollIntoView();",scroll1);
//		Thread.sleep(2000);
//		///////////////////////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[2]/div/div/ul/li[2]/a/div/span")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		Thread.sleep(2000);
//		JavascriptExecutor js2=(JavascriptExecutor) driver;
//		WebElement scroll2=driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[1]/div/h2/theme-underline"));
//		js2.executeScript("arguments[0].scrollIntoView();",scroll2);
//		Thread.sleep(2000);
//		/////////////////////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[2]/div/div/ul/li[3]/a/div/span")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		Thread.sleep(2000);
//		JavascriptExecutor js3=(JavascriptExecutor) driver;
//		WebElement scroll3=driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[1]/div/h2/theme-underline"));
//		js3.executeScript("arguments[0].scrollIntoView();",scroll3);
//		Thread.sleep(2000);
//		//////////////////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[2]/div/div/ul/li[4]/a/div/span")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		Thread.sleep(2000);
//		JavascriptExecutor js4=(JavascriptExecutor) driver;
//		WebElement scroll4=driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[12]/div/div/div/div[1]/div/h2/theme-underline"));
//		js4.executeScript("arguments[0].scrollIntoView();",scroll4);
//		Thread.sleep(2000);
//		//////////////////////////////// NEW
//		//////////////////////////////// BLOGS/////////////////////////////////////////
//		driver.findElement(By.xpath(
//				"//*[@id=\"page\"]/div/section[13]/div/div/div/section/div/div[2]/div/div[3]/div/div/a/span/span"))
//				.click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs39 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs39.get(1));
//		driver.close();
//		ArrayList<String> tabs40 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs40.get(0));
//		Thread.sleep(4000);
//		///////////////// TESTCASE HUB EXPLORE PAGE WILL OPEN AND PAGE WILL
//		///////////////// CLOSE//////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[16]/div[2]/div[2]/div/div[1]/div/div/div/h1/a"))
//				.click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs41 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs41.get(1));
//		driver.close();
//		ArrayList<String> tabs42 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs42.get(0));
//		Thread.sleep(4000);
//		///////////////// OFFICIAL RECOMMENDED SELINIUM PAGE WILL OPEN AND
//		///////////////// CLOSE///////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[16]/div[2]/div[2]/div/div[2]/div/div/div/h1/a"))
//				.click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs43 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs43.get(1));
//		driver.close();
//		ArrayList<String> tabs44 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs44.get(0));
//		Thread.sleep(4000);
//		//////////////// INDIAN ACHIEVER PAGE WILL OPEN AND CLOSE///////////////////
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div/section[16]/div[2]/div[2]/div/div[3]/div/div/div/h1/a"))
//				.click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs45 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs45.get(1));
//		driver.close();
//		ArrayList<String> tabs46 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs46.get(0));
//		Thread.sleep(4000);
//		////////////////////////////// YOUNG ACHIEVER PAGE WILL OPEN AND CLOSE
//		////////////////////////////// PAGE////////////////////////////////////////////////
//		//////////////////////////// HOME PAGE COMPLETED
//		////////////////////////////// SUCCESSFULLY/////////////////////////////////////////////////////////
//		///////////////////////////// PRODUCTS
//		////////////////////////////// STARTS/////////////////////////////////////////////////
//		WebElement dropdown3 = driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actionss = new Actions(driver);
//		actionss.moveToElement(dropdown3).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-2279\"]/a")).click();
//		Thread.sleep(3000);
//		driver.get("https://selectorshub.com/");
//		//////////////SELECTORSHUBPAGE WILL OPEN AND WILL GO BACK TO HOME PAGE/////////////
//		WebElement dropdown4 = driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions4 = new Actions(driver);
//		actions4.moveToElement(dropdown4).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-6293\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		/////////////SELECTORSHUB PRO PAGE WILL OPEN AND WILL RETURN BACK TO HOME PAGE/////////////////////////
//		WebElement dropdown5 = driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions5 = new Actions(driver);
//		actions5.moveToElement(dropdown5).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-2280\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		///////////TESTCASE STUDIO PAGE WILL OPEN AND WILL RETURN BACK TO HOME PAGE/////////////////////////
//		WebElement dropdown6= driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions6 = new Actions(driver);
//		actions6.moveToElement(dropdown6).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-4258\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		///////////////////////TESTCASE STUDIO PRO PAGE WILL OPEN AND RETURN BACK TO HOMEPAGE//////////////////
//		WebElement dropdown7= driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions7 = new Actions(driver);
//		actions7.moveToElement(dropdown7).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-8375\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		/////////////TESTING DAILY PAGE WILL OPEN AND RETURN BACK TO HOME PAGE////////////////////
//		WebElement dropdown8= driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions8 = new Actions(driver);
//		actions8.moveToElement(dropdown8).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-9482\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		////////////AUTOTEST DATA PAGE WILL OPEN AND RETURN BACK TO HOME PAGE//////////////////////////
//		WebElement dropdown9= driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions9 = new Actions(driver);
//		actions9.moveToElement(dropdown9).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-6186\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		////////////TESTCASE HUB PAGE WILL OPEN AND RETURN BACK TO HOME PAGE//////////////////
//		WebElement dropdown10= driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions10 = new Actions(driver);
//		actions10.moveToElement(dropdown10).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-7065\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		////////////SELECTORS HUB ADS PAGE WILL OPEN AND RETURN BACK TO HOME PAGE//////////////////////////
//		WebElement dropdown11= driver.findElement(By.cssSelector("#menu-item-27 > div > a"));
//		Actions actions11 = new Actions(driver);
//		actions11.moveToElement(dropdown11).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"menu-item-31\"]/a")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/");
//		//////////////// PRACTICE PAGE WILL OPEN AND RETURN BACK TO HOME
//		//////////////// PAGE///////////////
//		/////////////////////////// SELECTORS HUB PAGE
//		//////////////// STARTS///////////////////////////////
		driver.get("https://selectorshub.com/selectorshub/");
//		//////////// SELECTORS PAGE WILL OPEN///////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/section/div/div[2]/div/div[2]/div/h2/a")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs47 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs47.get(1));
//		driver.close();
//		ArrayList<String> tabs48 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs48.get(0));
//		Thread.sleep(4000);
//		///////////////// OFFER PAGE WILL OPEN AND CLOSE///////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ol/li[2]/ol/li[2]/a")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs49 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs49.get(1));
//		driver.close();
//		ArrayList<String> tabs50 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs50.get(0));
//		Thread.sleep(4000);
//		/////////////////////this video hybridlink will work  yt page will open and close///////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ol/li[3]/ol/li[2]/a")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs51 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs51.get(1));
//		driver.close();
//		ArrayList<String> tabs52 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs52.get(0));
//		Thread.sleep(4000);
//		//////////////////// vid tutorial hybrid link will work and yt page open and
//		//////////////////// closes///////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ul[1]/li[1]/a/span")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs53 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs53.get(1));
//		driver.close();
//		ArrayList<String> tabs54 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs54.get(0));
//		Thread.sleep(4000);
//		//////////////////CHROME INSTALL PAGE WILL OPEN AND CLOSE//////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ul[1]/li[2]/a/span")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs55 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs55.get(1));
//		driver.close();
//		ArrayList<String> tabs56 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs56.get(0));
//		Thread.sleep(4000);
//		///////////////////FIREFOX INSTALL BUTTON WILL WORK PAGE WILL OPEN AND CLOSE////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ul[1]/li[3]/a/span")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs57 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs57.get(1));
//		driver.close();
//		ArrayList<String> tabs58 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs58.get(0));
//		Thread.sleep(4000);
//		///////////////EDGE INSTALL PAGE WILL OPEN AND CLOSE//////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ul[1]/li[4]/a/span")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs59 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs59.get(1));
//		driver.close();
//		ArrayList<String> tabs60 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs60.get(0));
//		Thread.sleep(4000);
//		///////////////OPERA INSTALL PAGE WILL OPEN AND CLOSE//////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ul[2]/li[1]/a/span")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs61 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs61.get(1));
//		driver.close();
//		ArrayList<String> tabs62 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs62.get(0));
//		Thread.sleep(4000);
//		//////////////BRAVE INSTALL PAGE WILL OPEN AND  CLOSE////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ul[2]/li[2]/a/span")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs63 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs63.get(1));
//		driver.close();
//		ArrayList<String> tabs64 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs64.get(0));
//		Thread.sleep(4000);
//		///////////// CHROMIUM INSTALL PAGE WILL OPEN AND CLOSES//////////////////////
//		driver.findElement(By.xpath("//*[@id=\"default\"]/div/ul[2]/li[3]/a/span")).click();
//		Thread.sleep(3000);
//		ArrayList<String> tabs65 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs65.get(1));
//		driver.close();
//		ArrayList<String> tabs66 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs66.get(0));
//		Thread.sleep(4000);
//		/////////// TOR INSTALL PAGE WILL OPEN AND CLOSES///////////////////
//		driver.get("https://www.youtube.com/watch?v=Iqp0qh3Up44");
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		Thread.sleep(2000);
//		/////// YOUTUBE VIDEO WILL WORK/////////////////////////
//		////// WHAT IS SELECTORS HUB FINISHED//////////////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-installation\"]/div")).click();
//		////////// INSTALLATION PAGE WILL OPEN//////////////////////////////
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/div[1]/div[1]/div/div/div/div/div[3]/div/div/a/span/span"))
//				.click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		
//		////////////// CHROME INSTALL BUTTON WORKS AND RETURN BACK TO SELECTORS HUB
//		////////////// PAGE//////////////////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-installation\"]/div")).click();
//		////////// INSTALLATION PAGE WILL OPEN//////////////////////////////
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/div[1]/div[2]/div/div/div/div/div[3]/div/div/a"))
//				.click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		////////////// SAFARI PAGE WILL OPEN AND CLOSE AND RETURN BACK TO SELECTORSHUB
//		////////////// PAGE////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-installation\"]/div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/div[1]/div[3]/div/div/div/div/div[3]/div/div/a"))
//				.click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		//////////// FIREFOX INSTALL PAGE WILL OPEN AND RETURN BACK TO SELECTORSHUB
//		//////////// PAGE///////////////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-installation\"]/div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/div[1]/div[4]/div/div/div/div/div[3]/div/div/a"))
//				.click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		////////// EDGE INSTALL PAGE WILL OPEN AND RETURN BACK TO SELECTORS
//		////////// HUB///////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-installation\"]/div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/div[2]/div[1]/div/div/div/div/div[3]/div/div/a"))
//				.click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		//////////////////// OPERA INSTALL PAGE WILL OPEN AND RETURN BACK TO
//		//////////////////// SELECTORSHUB//////////////////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-installation\"]/div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/div[2]/div[2]/div/div/div/div/div[3]/div/div/a"))
//				.click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		//////////////// CHROMIUM INSTALL PAGE WILL OPEN AND RETURN BACK TO SELECTORS
//		//////////////// HUB PAGE///////////////////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-installation\"]/div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/div[2]/div[4]/div/div/div/div/div[3]/div/div/a"))
//				.click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		///////////////// INSTALL PAGE COMPLETED
//		///////////////// SUCCESSFULLY///////////////////////////////
//		//////////////////////////////////////////////////////////////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"how-to-use-selectorshub\"]/div/span")).click();
//		Thread.sleep(2000);
//		////////////////////HOW TO USE IT PAGE WILL OPEN///////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ul/li[7]/a[1]")).click();
//		driver.get("https://selectorshub.com/selectorshub/");
//		Thread.sleep(3000);
//		////////////////////FAQ PAGE WILL OPEN AND RETURN BACK TO SELECTORS HUB////////////////
//		driver.findElement(By.xpath("//*[@id=\"how-to-use-selectorshub\"]/div/span")).click();
//		Thread.sleep(3000);
//		////////////////////HOW TO USE IT PAGE WILL OPEN///////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ul/li[7]/a[2]")).click();
//		Thread.sleep(2000);
//		driver.get("https://selectorshub.com/selectorshub/");
//		/////////////////yt page will open and return back to selectors hub////////////////
//		////////////////HOW TO USE IT PAGE COMPLETED SUCCESSFULLY////////////////////////
//		driver.findElement(By.xpath("//*[@id=\"selectorshub-video-tutorial\"]/div")).click();
//		Thread.sleep(2000);
//		driver.get("https://www.youtube.com/watch?v=a3PzXjvYR28&t=2s");
//		driver.get("https://selectorshub.com/selectorshub/");
//		///////////// VID TUTORIAL PAGE COMPLETED SUCCESSFULLY///////////////////////
//		/////////////////////////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		//////////////// CHANGELOG PAGE WILL OPEN//////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs67 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs67.get(1));
		driver.close();
		ArrayList<String> tabs68 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs68.get(0));
		Thread.sleep(4000);
		/////////////////////////SELECTORSHUB PRO PAGE WILL OPEN AND CLOSE////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ul[1]/li[4]/a[2]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs69 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs69.get(1));
		driver.close();
		ArrayList<String> tabs70 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs70.get(0));
		Thread.sleep(3000);
		/////////////////////TECHNICAL BOOTCAMP PAGE WILL OPEN AND CLOSE//////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ul[1]/li[4]/a[3]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs71 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs71.get(1));
		driver.close();
		ArrayList<String> tabs72 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs72.get(0));
		Thread.sleep(3000);
		///////////////////THIS COURSE PAGE WILL OPEN AND  CLOSE//////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ul[2]/li[3]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs73 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs73.get(1));
		driver.close();
		ArrayList<String> tabs74 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs74.get(0));
		Thread.sleep(3000);
		//////////////////////SELECTORSHUB TRAINING PAGE WILL OPEN AND CLOSE//////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ul[2]/li[3]/a[2]")).click();
		Thread.sleep(3000);
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		////////////////////UDEMY PAGE WILL OPEN AND RETURN BACK TO SELECTORSHUB PAGE////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[2]/li[3]/a[2]")).click();
		Thread.sleep(3000);
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		////////////////// COURSE RECORDING PAGE WILL OPEN AND RETURN BACK TO
		////////////////// SELECTORSHUB//////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[5]/li[4]/a[1]")).click();
		Thread.sleep(3000);
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		/////////////////////////// DONATE PAGE WILL OPEN AND RETURN BACK TO
		/////////////////////////// SELECTORSHUB PAGE/////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[10]/li/a[3]")).click();
		Thread.sleep(3000);
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		///////////////////////// TESTCASE STUDIO PAGE WILL OPEN AND RETURN BACK TO
		///////////////////////// SELECETORSHUB PAGE//////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[19]/li[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs75 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs75.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs76 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs76.get(0));
		Thread.sleep(3000);
		///////////////TESIGOR PAGE WILL  OPEN AND CLOSE//////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/pre[22]/strong/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs77 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs77.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs78 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs78.get(0));
		Thread.sleep(3000);
		//////////////////WHATS NEW IN SELECTORS HUB YT VID PAGE WILL OPEN AND CLOSE//////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[20]/li[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs79 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs79.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs80 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs80.get(0));
		Thread.sleep(3000);
		/////////////////////////SUGGESTION PAGE WILL OPEN AND CLOSE///////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[27]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs81 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs81.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs82 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs82.get(0));
		Thread.sleep(3000);
		////////////////////////GUARAV LINKDIN PAGE WWILL OPEN AND CLOSE///////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[29]/li[3]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs83 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs83.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs84 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs84.get(0));
		Thread.sleep(3000);
		///////////////SANJEYKUMAR LINKDIN PAGE WILL OPEN AND CLOSE/////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[30]/li[4]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs85 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs85.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs86 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs86.get(0));
		Thread.sleep(3000);
		///////////////////REGISTRATION PAGE WILL OPEN AND CLOSE//////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[34]/li[6]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs87 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs87.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs88 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs88.get(0));
		Thread.sleep(3000);
		//////////////// QTP SUDHAKAR LINKDIN PAGE WILL OPEN AND
		//////////////// CLOSE////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[35]/li[7]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs89 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs89.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs90 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs90.get(0));
		Thread.sleep(3000);
		//////////////// LAUNCH EVENT YT VID WILL WORK AND PAGE CLOSES//////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[36]/li[3]/a[1]")).click();
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		///////////////// KEY TO ACCESS YT VID WILL WORK AND RETURN TO SELECTORS HUB
		///////////////// PAGE////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[38]/li[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs91 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs91.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs92 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs92.get(0));
		////////// CHANGES YT VID WILL WORK IN NEW PAGE AND IT WILL
		////////// CLOSE/////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[39]/li[5]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs93 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs93.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs94 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs94.get(0));
		Thread.sleep(3000);
		/////////////////// PATRON PAGE OPEN ANC CLOSES/////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[41]/li[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs95 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs95.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs96 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs96.get(0));
		Thread.sleep(3000);
		///////////TESTCASE STUDIO PAGE WILL OPEN AND CLOSE///////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[44]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs98 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs98.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabs99 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs99.get(0));
		Thread.sleep(3000);
		///////CROSS ORIGIN IFRAME ELEMENT TUTORIAL YT VID WORKS AND CLOSES THE VID////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[45]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss1.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss2 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss2.get(0));
		Thread.sleep(3000);
		//////////UPDATES YT VID WILL WORK AND CLOSES THE VID///////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[46]/li[3]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss3 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss3.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss4 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss4.get(0));
		Thread.sleep(3000);
		////////UPDATED AND DETAILED YT VID WILL WORK AND VID CLOSES////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[48]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss5 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss5.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss6 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss6.get(0));
		Thread.sleep(3000);
		//////INSTRUCTION PAGE OPEN AND CLOSES///////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[48]/li[1]/a[2]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss7 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss7.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss8 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss8.get(0));
		Thread.sleep(3000);
		//////////////ENHANCEMENT SUGGESTED BY GAURAV GIT PAGE WILL OPEN AND CLOSE////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[49]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss9 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss9.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss10 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss10.get(0));
		Thread.sleep(3000);
		//////////BUGASURA PAGE WILL OPEN AND CLOSES/////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[49]/li[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss11 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss11.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss12 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss12.get(0));
		Thread.sleep(3000);
		///////////ISSUE 36 GIT PAGE WILL OPEN AND CLOSES////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[49]/li[4]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss13 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss13.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss14 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss14.get(0));
		Thread.sleep(3000);
		///////////ISSUE 35 GIT PAGE WILL OPEN AND CLOSES////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[51]/li[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss15 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss15.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss16 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss16.get(0));
		Thread.sleep(3000);
		///////////ISSUE 32 GIT PAGE WILL OPEN AND CLOSES////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[51]/li[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss17 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss17.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss18 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss18.get(0));
		Thread.sleep(3000);
             ///////////ISSUE 33 GIT PAGE WILL OPEN AND CLOSES////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[51]/li[4]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss19 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss19.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss20 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss20.get(0));
		Thread.sleep(3000);
		 ///////////ISSUE 34 GIT PAGE WILL OPEN AND CLOSES////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[56]/li[2]/a[3]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss21 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss21.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss22 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss22.get(0));
		Thread.sleep(3000);
		/////////UDEMY PAGE WILL OPEN AND CLOSES////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[57]/li[2]/h6[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss23 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss23.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss24 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss24.get(0));
		Thread.sleep(3000);
		//////////PAY PAL PAGE  WILL OPEN AND CLOSES//////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[58]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss25 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss25.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss26 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss26.get(0));
		Thread.sleep(3000);
		//////////VERSION 3.0.8 YT VID WILL WORK AND VID CLOSES///////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[60]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss27 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss27.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss28 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss28.get(0));
		Thread.sleep(3000);
		//////////FIRFOX PAGE WILL OPEN AND  CLOSES/////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[60]/li[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss29 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss29.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss30 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss30.get(0));
		Thread.sleep(3000);
		/////////// 3.0.6 VERSION (TUTORAIL YT VID PAGE WILL OPEN AND
		/////////// CLOSE)/////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[61]/li[1]/a")).click();
		Thread.sleep(3000);
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		//////////// version3.0.5 (features)//////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[61]/li[8]/a")).click();
		Thread.sleep(3000);
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"selectorshub-changelog\"]/div/span")).click();
		Thread.sleep(2000);
		///////// ISSUE22 PAGE WILL OPEN AND RETURN BACK TO SELECTORSHUB
		///////// CHANGELOG/////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[62]/li/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss31 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss31.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss32 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss32.get(0));
		Thread.sleep(3000);
		////////// CERTIFICATE PAGE WILL OPEN AND CLOSES///////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[64]/li[5]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss33 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss33.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss34 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss34.get(0));
		Thread.sleep(3000);
		///// HOW TO USE SAFARI YT TUBE TUTORIAL PAGE WILL OPEN AND CLOSES///////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[65]/li[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss35 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss35.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss36 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss36.get(0));
		Thread.sleep(3000);
		///////////// SUGGESTION GIT PAGE WILL OPEN AND CLOSES/////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[65]/li[4]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss37 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss37.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss38 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss38.get(0));
		Thread.sleep(3000);
		////////// 3.0 YT TUTORIAL LINK WILL WORK AND PAGE OPEN AND CLOSES//////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[66]/li[6]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss39 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss39.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss40 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss40.get(0));
		Thread.sleep(3000);
		//////////// NITESH JAIN LINKDIN PAGE WILL OPEN AND CLOSES//////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[66]/li[7]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss41 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss41.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss42 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss42.get(0));
		Thread.sleep(3000);
		/////// INCREDIBLE INNOVATION TUTORIAL VID PAGE OPENS AND PAGE WILL
		/////// CLOSE////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[70]/li[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss43 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss43.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss44 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss44.get(0));
		Thread.sleep(3000);
		////// NESTED SHADOW DOM YT VID PAGE OPEN AND CLOSES/////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[71]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss45 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss45.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss46 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss46.get(0));
		Thread.sleep(3000);
		////////// REPORTED BY GAURAV GIT PAGE WILL OPEN AND CLOSES////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[71]/li[2]/a/b[2]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss47 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss47.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss48 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss48.get(0));
		Thread.sleep(3000);
		////////// TEST PROJECT 2.0 PAGE WILL OPEN AND CLOSES/////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[72]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss49 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss49.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss50 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss50.get(0));
		Thread.sleep(3000);
		/////// MOOLYPICS PAGE WILL OPEN AND CLOSES//////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[73]/li/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss51 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss51.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss52 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss52.get(0));
		Thread.sleep(3000);
		/////////SAFARI BROWSER PAGE WILL OPEN AND CLOSES/////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[76]/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss53 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss53.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss54 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss54.get(0));
		Thread.sleep(3000);
		////////PALLAVI SHARMA LINKDIN PAGE WILL OPEN AND CLOSES//////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[77]/li[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss55 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss55.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss56 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss56.get(0));
		Thread.sleep(3000);
		///////////INDIAN ACHIEVERS AWARD 2O2O PAGE WILL OPEN AND CLOSES////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[79]/li[3]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss57 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss57.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss58 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss58.get(0));
		Thread.sleep(3000);
		//////////RATE AND REVIEW  PAGE WILL OPEN AND CLOSES////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/ol[81]/li[2]/a")).click();
		Thread.sleep(3000);
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		////////////DOCS GOOGLE PAGE WILL OPEN AND CLOSES///////////////
		///////////CHANGELOG PAGE COMPLETED SUCCESSFULLY///////////////
		driver.findElement(By.xpath("//*[@id=\"how-to-use-selectorshub-in-incognito-mode\"]/div/span")).click();
		Thread.sleep(2000);
		///////////HOW TO USE INCOGNITO PAGE WILL OPEN//////////////////////////
		JavascriptExecutor js6=(JavascriptExecutor) driver;
		WebElement scroll6=driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/p[7]"));
		js6.executeScript("arguments[0].scrollIntoView();",scroll6);
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=XaJGkUz1wk8");
		driver.get("https://selectorshub.com/selectorshub/");
		//////HOW TO USE INCOGNITO MODE PAGE COMPLETED SUCCESSFULLY/////
		///////////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"is-it-safe-and-secure-to-use-selectorshub\"]/div/span")).click();
		Thread.sleep(2000);
		///////////IS IT SAFE PAGE WILL OPEN//////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/section[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss59 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss59.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss60 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss60.get(0));
		Thread.sleep(3000);
		///////////HERE IN CHROME PAGE WILL  OPEN AND CLOSE//////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"post-content\"]/div/section[1]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabss61 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss61.get(1));
		Thread.sleep(3000);
		driver.close();
		ArrayList<String> tabss62 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabss62.get(0));
		Thread.sleep(3000);
		/////////crxcavator page will open and close//////////////////
		JavascriptExecutor js7=(JavascriptExecutor) driver;
		WebElement scroll7=driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[1]/div/div[1]/div/a/img"));
		js7.executeScript("arguments[0].scrollIntoView();",scroll7);
		driver.get("https://www.youtube.com/watch?v=wH3qbioP_3w");
		driver.get("https://selectorshub.com/selectorshub/");
		/////////YT WILL WORK AND RETURN BACK TO SELECTORS HUB PAGE////////////////////
		////////IS IT SAFE AND SECURE PAGE COMPLETED///////////////////
		/////////////////////////FEATURES STARTS///////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		//////////////////////FEATURES DROPDOWN WORKS//////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Auto-Generate-Xpath-and-CSS-selector\"]")).click();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=-L0EcE5WNAA");
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		//////GENERATE XPATH PAGE WILL OPEN THEN YT PAGE WILL OPEN AND RETURN BACK TO SELECTORSHUB/////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Error-detection-and-control\"]")).click();
		JavascriptExecutor js8=(JavascriptExecutor) driver;
		WebElement scroll8=driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[1]/div/div[1]/div/a/img"));
		js8.executeScript("arguments[0].scrollIntoView();",scroll8);
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=cE4SuYTTC2Q");
		driver.get("https://selectorshub.com/selectorshub/");
		////////FEATURES DROPDOWN WORK THEN OPENS ERROR PAGE AND YT PAGE WILL OPEN AFTER THAT RETURN BACK TO SH////////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Shadow-DOM\"]")).click();
		JavascriptExecutor js9=(JavascriptExecutor) driver;
		WebElement scroll9=driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[1]/div/div[1]/div/a/img"));
		js9.executeScript("arguments[0].scrollIntoView();",scroll9);
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=cE4SuYTTC2Q");
		driver.get("https://selectorshub.com/selectorshub/");
		///////////DROPDOWN WORKS THEN SHADOWDOM PAGE OPENS AND YT PAGE OPENS AND RETURN BACK TO SH////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		//////////////////////FEATURES DROPDOWN WORKS//////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"how-to-automate-iframe-elements-in-selenium-cypress-playwright-etc\"]")).click();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=cE4SuYTTC2Q");
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		///////IFRAME PAGE OPENS THEN YT PAGE WILL OPEN AND RETURN BACK TO SELECTORS HUB PAGE////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		//////////////////////FEATURES DROPDOWN WORKS//////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"how-to-automate-svg-elements-in-selenium-cypress-playwright-etc\"]")).click();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=g7t_WwsCfdc");
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		///////SVG PAGE OPENS THEN YT PAGE WILL OPEN AND RETURN BACK TO SELECTORS HUB PAGE////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Multiple-Selector\"]")).click();
		JavascriptExecutor js10=(JavascriptExecutor) driver;
		WebElement scroll10=driver.findElement(By.xpath("//*[@id=\"colophon\"]/div/div/section[1]/div/div[1]/div/div[1]/div/a/img"));
		js10.executeScript("arguments[0].scrollIntoView();",scroll10);
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=vf8fV3u3FlA");
		driver.get("https://selectorshub.com/selectorshub/");
////////DROPDOWN WORKS THEN GENERATE PAGE WILL OPEN AND YT PAGE WILL OPENS AND RETURN BACK TO SH/////////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		//////////////////////FEATURES DROPDOWN WORKS//////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Debugger\"]")).click();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=nB8QA68PwvQ");
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		/////////DEBUGGER PAGE WILL OPEN THEN YT PAGE WILL OPEN AND RETURN BACK TO SH PAGE//////////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		//////////////////////FEATURES DROPDOWN WORKS//////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Smart-Maintenance\"]")).click();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=3svyEBkX3Qw");
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		/////VERIFY MUL XPATH PAGE WILL OPEN THEN YT PAGE OPENS AND RETURN BACK TO SH PAGE/////////
		driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4211\"]/a")).click();
		//////////////////////FEATURES DROPDOWN WORKS//////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Dark-Theme\"]")).click();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/watch?v=f0aZP_g4m6A");
		driver.get("https://selectorshub.com/selectorshub/");
		Thread.sleep(2000);
		driver.quit();
	}
		/////DARK THEME PAGE WILL OPEN THEN YT PAGE OPENS AND RETURN BACK TO SH PAGE/////////////
		/////////////////////SELECTORS HUB PAGE COMPLETED SUCCESSFULLY////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////
		
		
		@Test
		
		public void cls2() throws InterruptedException {
			System.setProperty("Webdriver.chrome.Driver",
					"D:\\\\games\\\\study\\\\chromedriver-win64\\\\chromedriver-win64");
			WebDriver driver = new ChromeDriver();
			driver.get("https://selectorshub.com/");
			driver.manage().window().maximize();
		

	}
}
