package WEBSITE;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMSauditing {
	
WebDriver driver;
	
	@Test
	public void cls() throws InterruptedException {
		System.setProperty("webdriver.chrome.Driver", "D:\\games\\study\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmsauditing.com/");
		driver.manage().window().maximize();

		////////////////////////////////////////////////////////////////////////////////////
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);

		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[1]/a/div")).click();
		System.out.println("succesfull");
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		///// AUDIT BUTTON IN HOME PAGE(button clicking and returning to homepage/////

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement scroll1 = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js1.executeScript("arguments[0].scrollIntoView();", scroll1);
		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[2]/a/div")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		/////////////////////////// ACCOUNTING AND BOOKKEEPING(acounting button will
		/////////////////////////// work and return back to home page
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement scroll2 = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js2.executeScript("arguments[0].scrollIntoView();", scroll2);
		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[3]/a/div/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		///////////////////////////////////// BUSINESS COUNSULTANCY(BUSINESS
		///////////////////////////////////// COUNSULTANCY BUTTON IS WORKING AND RETURN
		///////////////////////////////////// BACK TO HOME page
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		WebElement scroll3 = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js3.executeScript("arguments[0].scrollIntoView();", scroll3);
		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[4]/a/div/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		////////////////////////// FEASIBILITY STUDY(feasibility study button will work
		////////////////////////// and will return back to home page
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		WebElement scroll4 = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js4.executeScript("arguments[0].scrollIntoView();", scroll4);
		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[5]/a/div/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		/////////////////////////////////////////////// VAT(vat button will work and
		/////////////////////////////////////////////// will
		/////////////////////////////////////////////// return back to homepage
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		WebElement scroll5 = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js5.executeScript("arguments[0].scrollIntoView();", scroll5);
		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[6]/a/div/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		//////////////////////////////////////// EXCISE TAX(execise tax button will work
		//////////////////////////////////////// and will return back to home page
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		WebElement scroll6 = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js6.executeScript("arguments[0].scrollIntoView();", scroll6);
		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[7]/a/div/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		////////////////////////////////////// CORPORATE TAX(corporate tax button will
		////////////////////////////////////// work and will return back to homepage
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		WebElement scroll7 = driver
				.findElement(By.cssSelector("#team > div > div > div.section-title.mb-50 > div > div > p"));
		js7.executeScript("arguments[0].scrollIntoView();", scroll7);
		driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[8]/a/div/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		//////////////////////////// TAX AGENT(tax agent button will work and will
		//////////////////////////// return back to homepage
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		WebElement scroll8 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js8.executeScript("arguments[0].scrollIntoView();", scroll8);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/p[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		//////////////////////////////////// AUDIT LINK IS
		//////////////////////////////////// WORKING/////////////////////////
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		WebElement scroll9 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js9.executeScript("arguments[0].scrollIntoView();", scroll9);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/p[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		///////////////////////////////////// ACCOUNTING LINK IS
		///////////////////////////////////// WORKING////////////////////////////
		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		WebElement scroll10 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js10.executeScript("arguments[0].scrollIntoView();", scroll10);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/p[2]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		////////////////////////////////// BOOKKEEPING LINK WILL
		////////////////////////////////// WORK////////////////////////////////////
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		WebElement scroll11 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js11.executeScript("arguments[0].scrollIntoView();", scroll11);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/p[2]/a[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		////////////////////////////////////// VAT LINK
		////////////////////////////////////// WILL//////////////////////////////////
		////////////////////////////////////// WORK///////////////////////////////////////////
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		WebElement scroll12 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js12.executeScript("arguments[0].scrollIntoView();", scroll12);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		//////////////////////////////////////////// AUDIT FIRM IN ALL UAE HYBRID LINK
		//////////////////////////////////////////// WILL BE working
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		WebElement scroll13 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js13.executeScript("arguments[0].scrollIntoView();", scroll13);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		//////////////////////////////////////////// REGISTERED TAX AGENT HYBRID LINK
		//////////////////////////////////////////// WILL BE working
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		WebElement scroll14 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js14.executeScript("arguments[0].scrollIntoView();", scroll14);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		//////////////////////////////////////// DMCC APPROVED AUDITORS HYBRID LINK WILL
		//////////////////////////////////////// BE
		//////////////////////////////////////// WORKING
		JavascriptExecutor js15 = (JavascriptExecutor) driver;
		WebElement scroll15 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js15.executeScript("arguments[0].scrollIntoView();", scroll15);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		////////////////////////////////////// APPROVED AUDITERS IN UAE HYBRID LINK WILL
		////////////////////////////////////// BE
		////////////////////////////////////// WORKING/////////////////////////////////////////////////
		///////////////////////////////////////////////// HYBRID LINK
		////////////////////////////////////// COMPLETED/////////////////////////////////////////////////////////////
		JavascriptExecutor js16 = (JavascriptExecutor) driver;
		WebElement scroll16 = driver
				.findElement(By.cssSelector("#wrapper > div.main-content > section:nth-child(4) > div > div > h1"));
		js16.executeScript("arguments[0].scrollIntoView();", scroll16);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		///////////////////////////////////////////// MORE ABOUT BMS AUDITING BUTTON
		///////////////////////////////////////////// WILL BE
		///////////////////////////////////////////// WORKING//////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JavascriptExecutor js17 = (JavascriptExecutor) driver;
		WebElement scroll17 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(4) > div > div > div > div.col-md-7 > a"));
		js17.executeScript("arguments[0].scrollIntoView();", scroll17);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div[1]/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[1]/a")).click();
		/////////////////////////////////////////////// READ MORE BLOGS BUTTON WILL
		/////////////////////////////////////////////// WORK////////////////////////////////////////////////////

		JavascriptExecutor js18 = (JavascriptExecutor) driver;
		WebElement scroll18 = driver.findElement(
				By.cssSelector("#wrapper > div.main-content > div.brochure_download > div > div > div.col-md-7 > img"));
		js18.executeScript("arguments[0].scrollIntoView();", scroll18);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div[2]/div/div/div[1]/a")).click();
		Thread.sleep(3000);
		((ChromeDriver) driver).executeScript("window.open()");
		Thread.sleep(2000);
		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();
		Thread.sleep(2000);
		// Switch to the second tab
		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		// Navigate to another URL in the second tab
		driver.get("https://www.bmsauditing.com/");
		Thread.sleep(2000);
		// Perform some actions in the second tab

		// Switch back to the first tab
		driver.switchTo().window((String) windowHandles.toArray()[0]);
		Thread.sleep(2000);
/////////////////////////////////////////////////download brochure button will work////////////////////////////////////////////////////////////////////
		JavascriptExecutor js19 = (JavascriptExecutor) driver;
		WebElement scroll19 = driver.findElement(By.cssSelector("#quick_enq_block > div > div"));
		js19.executeScript("arguments[0].scrollIntoView();", scroll19);
		////////////////////////////////////// scroll down to form
		////////////////////////////////////// filling/////////////////////////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"fullname\"]")).sendKeys("1234");
		////////////////////////////////////// NAME TAB WILL OPEN AND WRITE THE NAME
		////////////////////////////////////// GIVEN////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"landline\"]")).sendKeys("464564564");
		///////////////////////////////////// NUMBER TAB WILL OPEN AND WRITE CONTACT
		///////////////////////////////////// NUM///////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[4]")).click();
		///////////////////////////////// COUNTRY TAB WILL
		///////////////////////////////// WORK////////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("BLAH@gmail.com");
		////////////////////////////////// EMAIL TAB WILL
		////////////////////////////////// WORK////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("BIG  BRRRRRR");
		////////////////////////////////// MESSAGE TAB WILL
		////////////////////////////////// WORK///////////////////////////////////////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contact_form_btn\"]")).click();
		//////////////////////////////// SUBMIT BUTTON WILL
		//////////////////////////////// WORK///////////////////////////////////////////////
		/////////////////////////////// HOME PAGE COMPLETED
		//////////////////////////////// SUCCESSFULLY//////////////////////////////////////////////////

		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[2]/a")).click();
		////////////////////////////// ABOUT US BUTTON WILL WORK(ABOUT US PAGE WILL
		////////////////////////////// OPEN)///////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[4]/span/span/a")).click();
		/////////////////////////////// BMS AUDITING LINK WILL
		/////////////////////////////// WORK/////////////////////////////////////////////////
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[2]/a")).click();
		///////////////////////////////////////////// WILL RETURN BACK TO ABOUT US
		///////////////////////////////////////////// PAGE////////////////////////////////////////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[5]/span/span[1]/span/a"))
				.click();

		Thread.sleep(4000);
		// Switch to the new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(0));
		//////////////////////////////// AUDIT SERVICES PAGE WILL OPEN AND RETURN BACK
		//////////////////////////////// TO ABOUT US
		//////////////////////////////// PAGE///////////////////////////////////
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[5]/span/span[2]/span/a"))
				.click();
		Thread.sleep(4000);
		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs1.get(0));
		Thread.sleep(2000);
//  ////////////////////////////////////////////ACCOUNTING SERVICES PAGE WILL OPEN AND WILL RETURN BACK TO ABOUT US PAGE//////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[5]/span/span[3]/span/a"))
				.click();
		Thread.sleep(4000);
		ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(4000);
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(2000);
//  //////////////////////////////////////////////VAT PAGE WILL OPEN AND WILL RETURN BACK TO ABOUT US PAGE/////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[5]/span/span[4]/span/a"))
				.click();
		Thread.sleep(4000);
		ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs3.get(0));
		Thread.sleep(2000);
//        ///////////////////////////////////////EXCISE PAGE WILL OPEN AND RETURN BACK TO ABOUT US PAGE/////////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[5]/span/span[5]/span/a"))
				.click();
		Thread.sleep(4000);
		ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs4.get(0));
		Thread.sleep(2000);
//        ////////////////////////////////////CORPORATE TAX PAGE WILL OPEN AND RETURN BACK TO ABOUT US PAGE/////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[5]/span/span[6]/span/a"))
				.click();
		Thread.sleep(4000);
		ArrayList<String> tabs5 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs5.get(0));
		Thread.sleep(2000);
///////////////////////////////////////////////////////BUISNESS COUNSULTANCY PAGE WILL OPEN AND RETURN BACK TO HOME PAGE//////////////////////////////////////////////
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JavascriptExecutor js20 = (JavascriptExecutor) driver;
		WebElement scroll20 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div > p:nth-child(20) > span:nth-child(1)"));
		js20.executeScript("arguments[0].scrollIntoView();", scroll20);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div/p[12]/span[2]/a/span")).click();
		//////////////////////////// SCROLL DOWN TO BOTTOM OF ABOUT US PAGE ANC CLICK
		//////////////////////////// THE BMS AUDIT LINK//////////////////////////////
		///////////////////////////// ABOUT US PAGE COMPLETED
		//////////////////////////// SUCCESSFULLY//////////////////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[4]/a")).click();

		///////////////////////// SERVICES PAGE WILL
		///////////////////////// OPEN//////////////////////////////////////////////////////////

		driver.quit();
	}

	@Test
	public void cls2() throws InterruptedException {
		System.setProperty("webdriver.chrome.Driver", "D:\\games\\study\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmsauditing.com/auditing-services");
		driver.manage().window().maximize();
////////////////////////AUDIT AND ASSURENCE PAGE WILL OPEN////////////////////////////////////////////////
		JavascriptExecutor js21 = (JavascriptExecutor) driver;
		WebElement scroll21 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > div:nth-child(4) > p:nth-child(2) > span > img"));
		js21.executeScript("arguments[0].scrollIntoView();", scroll21);
		Thread.sleep(2000);
		///////////////////// scroll down action will
		///////////////////// work/////////////////////////////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/p[2]/span/strong[1]/a/span"))
				.click();
		ArrayList<String> tabs6 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs6.get(0));
///////////////////////bms audit page will open and will return back to audit page/////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[1]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs7 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs7.get(0));
		Thread.sleep(1000);

///////////////////////financial audit button will work and return back to audit page//////////////////	        
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[2]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs8 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs8.get(0));
		Thread.sleep(1000);
////////////////////////external audit page will open and will return back to audit page///////////////	        
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[3]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs9 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs9.get(0));
		Thread.sleep(1000);
/////////////////////internal audit page will open and will return back to 	audit page////////////////	
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[4]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs10 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs10.get(0));
		Thread.sleep(1000);
///////////////////icv audit button will work and will return back to audit page/////////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[5]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs11 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs11.get(0));
		Thread.sleep(1000);
///////////////////stock audit page will open and will return back to audit page///////////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[6]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs12 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs12.get(0));
		Thread.sleep(1000);
///////////////////dmcc page will open and will return back to audit page////////////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[7]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs13 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs13.get(0));
		Thread.sleep(1000);
		
/////////////////tax audit page will open and will return back to home page///////////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[1]/ul/li/ul/li/ul/li[8]/a/span/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs14 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs14.get(0));
		Thread.sleep(1000);
/////////////////sales audit page will open and will return back to audit page/////////////////////		
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[1]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs15 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs15.get(0));
		Thread.sleep(1000);
///////////////////it audit page will open and will return back to audit page//////////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[2]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs16 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs16.get(0));
		Thread.sleep(1000);
////////////////////////forensic page will open and will return back to audit page//////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[3]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs17 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs17.get(0));
		Thread.sleep(1000);
////////////////////due dilligence page will open will return back to audit page///////////////////		
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[4]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs18 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs18.get(0));
		Thread.sleep(1000);
/////////////risk management page will open and will return back to audit page/////////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[5]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs19 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs19.get(0));
		Thread.sleep(1000);
////////////////////////////statutory audit page will open and will return back to audit page//////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[6]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs20 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs20.get(0));
		Thread.sleep(1000);
///////////////////////liquidation audit page will open and will return back to audit page////////////////
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[7]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs21 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs21.get(0));
		Thread.sleep(1000);
////////////////rera audit page will open and will return back to audit page////////////////////
	 Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/div/div/div[2]/ul/li/ul/li/ul/li[8]/a/span/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs22 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs22.get(0));
		Thread.sleep(1000);
///////////////////corporate tax audit page will open and will return back to audit page////////////		
		JavascriptExecutor js22 = (JavascriptExecutor) driver;
		WebElement scroll22 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > p:nth-child(36) > span"));
		js22.executeScript("arguments[0].scrollIntoView();", scroll22);
		Thread.sleep(3000);
		///////////////// will scroll down to bottom of the audit
		///////////////// page////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[27]/span/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs23 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs23.get(0));
		Thread.sleep(1000);
		///////////////////// bms audit page will open will return back to audit
		///////////////////// page//////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[29]/span[2]/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs24 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs24.get(0));
		Thread.sleep(1000);
///////////////////audit service in usa by bms page will open and will return back to audit page
		driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[4]/a")).click();
	}
/////////////////////////////services page will open///////////////////////////////////
	//////////////////////////// audit page completed
	//////////////////////////// successfully and return back to services
	@Test
	public void cls3() throws InterruptedException {
		System.setProperty("webdriver.chrome.Driver", "D:\\games\\study\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmsauditing.com/auditing-services");
		driver.manage().window().maximize();
		//////////////// bms audit page will open//////////////////////////////////
		driver.get("https://www.bmsauditing.com/financial-audit-services");
		////////////////// financial audit page will open/////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[1]/span[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs25 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs25.get(0));
		Thread.sleep(1000);
		/////////////////// bms audit button in financial page will work and will return
		/////////////////// back to financial page////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[3]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs26 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs26.get(0));
		Thread.sleep(1000);
		////////////////////////external audit page will open will return back to financial page/////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[5]/span/span[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs27 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs27.get(0));
		Thread.sleep(2000);
		///////////// top 10 audit firm in dubai firm page will open and will return
		///////////// back to financial page////////////////////
		JavascriptExecutor js23 = (JavascriptExecutor) driver;
		WebElement scroll23 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > h2:nth-child(8) > span"));
		js23.executeScript("arguments[0].scrollIntoView();", scroll23);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[9]/span/a/span")).click();
		Thread.sleep(3000);
		//////////// scroll down and will click on accounting standards in dubai
		//////////// button///////////////////////////
		ArrayList<String> tabs28 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs28.get(0));
		////////////// return back to financial
		////////////// page//////////////////////////////////////
		JavascriptExecutor js24 = (JavascriptExecutor) driver;
		WebElement scroll24 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > h3:nth-child(13) > span"));
		js24.executeScript("arguments[0].scrollIntoView();", scroll24);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/ol/li[1]/span/span/a"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> tabs29 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs29.get(0));
		///////////// scroll down and financial vat link will be clicked then vat page
		///////////// will open and then return back to financial
		///////////// page/////////////////////
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/ol/li[2]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs30 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs30.get(0));
		Thread.sleep(3000);
		////////////////// audit freezone link will work and will return back to
		////////////////// financial page////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/ol/li[3]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs31 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs31.get(0));
		Thread.sleep(3000);
////////////////////AUDIT REPORT AND CORPORATE TAX LINK WILL WORK AND WILL RETRUN BACK TO FINANCIAL PAGE///////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/ol/li[4]/span/span/a"))
				.click();
		ArrayList<String> tabs32 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs32.get(0));
		Thread.sleep(3000);
		//////////////// financial statement for excise tax link will works and will
		//////////////// return back to financial page/////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/ol/li[5]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs33 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs33.get(0));
		Thread.sleep(3000);
	//////////AUDIT REPORTS TO CUSTOM LINK WILL WORK AND WILL RETURN BACK TO FINANCIAL PAGE//////////////////
		JavascriptExecutor js25 = (JavascriptExecutor) driver;
		WebElement scroll25 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > h4 > span"));
		js25.executeScript("arguments[0].scrollIntoView();", scroll25);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[28]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs34 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs34.get(0));
		Thread.sleep(2000);
//////////////////////bms audit hybrid link will work and will return back to financial page////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[28]/span[1]/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs35 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs35.get(0));
//////////////////FINANCIAL AUDUT SERVICES FOR MNC LINK WILL WORK AND WILL RETURN BACK TO FINANCIAL AUDIT PAGE///////////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[1]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs36 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs36.get(0));
		Thread.sleep(2000);
//////////////////////financial audit link work and will return back to financial audit page/////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[2]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs37 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs37.get(0));
		Thread.sleep(2000);
////////////////external audit link will work and will return back to financial audit page/////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[3]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs38 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs38.get(0));
		Thread.sleep(2000);
	////////////internal audit link will work and will return back to financial audit page////////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[4]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs39 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs39.get(0));
		Thread.sleep(2000);
/////////////icv audit link will work and will return back to financial page////////////////	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[5]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs40 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs40.get(0));
		Thread.sleep(2000);
///////////////STOCK AUDIT LINK WILL WORK AND WILL RETURN BACK TO FINANCIAL PAGE/////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[6]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs41 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs41.get(0));
		Thread.sleep(2000);
/////////////////DMCC AUDIT LINK WILL WORK AND WILL RETURN  BACK TO FINANCIAL PAGE///////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[7]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs42 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs42.get(0));
		Thread.sleep(2000);
///////////////TAX AUDIT LINK WILL WORK AND WILL RETURN BACK TO FINANCIAL PAGE/////////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[2]/ul/li[1]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs43 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs43.get(0));
		Thread.sleep(2000);
////////////////IT AUDIT LINK WILL WORK AND WILL RETURN BACK TO FINANCIAL PAGE///////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[2]/ul/li[2]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs44 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs44.get(0));
		Thread.sleep(2000);
//////////////FORENSIC AUDIT LINK WILL WORK AND WILL RETURN BACK TO FINANCIAL  PAGE////////////////
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[2]/ul/li[3]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs45 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs45.get(0));
		Thread.sleep(2000);
		driver.quit();
}
///////////DUE DILEGENCE LINK WILL WORK AND WILL RETURN BACK TO FINANCIAL PAGE/////////////////
		//////////FINANCIAL PAGE COMPLETED SUCCESSFULLY//////////////////////////
		@Test
		public void cls4() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\games\\study\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			driver.get("https://www.bmsauditing.com/");
			driver.manage().window().maximize();
		driver.get("https://www.bmsauditing.com/internal-audit-services");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[2]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs46 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs46.get(0));
		Thread.sleep(2000);
///////////BUISNESS CONSULTANCY PAGE WILL OPEN AND WILL RETURN BACK TO INTERNAL AUDIT PAGE//////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[3]/span/span[1]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs47 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs47.get(0));
		Thread.sleep(2000);
//////////////AUDIT SERVICES PAGE WILL OPEN AND WILL RETURN BACK TO INTERNAL AUDIT PAGE///////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[3]/span/span[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs48 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs48.get(0));
		Thread.sleep(2000);
//////////////BMS AUDITING PAGE WILL OPEN AND WILL RETURN BACK TO INTERNAL AUDIT PAGE//////////////
		JavascriptExecutor js26 = (JavascriptExecutor) driver;
		WebElement scroll26 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > p:nth-child(5) > span"));
		js26.executeScript("arguments[0].scrollIntoView();", scroll26);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[5]/span[2]/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs49 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs49.get(0));
		Thread.sleep(2000);
//////////scroll down and risk management page will open and will retrun back to internal audit page//////////
		JavascriptExecutor js27 = (JavascriptExecutor) driver;
		WebElement scroll27 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > h4:nth-child(15) > span"));
		js27.executeScript("arguments[0].scrollIntoView();", scroll27);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[12]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs50 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs50.get(0));
		Thread.sleep(2000);
//////////////scroll down and internal audit report page will open and wll return back to internal audit page/////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[14]/span/span/a")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs51 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs51.get(0));
		Thread.sleep(2000);
	///////////accounting and bookkeeping page will open and will return back to internal audit page//////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[16]/span[2]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs52 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs52.get(0));
		Thread.sleep(2000);
//////////////cfo services page will open and will return back to internal audit page//////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[16]/span[4]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs53 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs53.get(0));
		Thread.sleep(2000);
/////////////external audit page will open and will return back to internal audit page/////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[16]/span[6]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs54 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs54.get(0));
		Thread.sleep(2000);
/////////////vat return audit page will open and will return back to internal audit page////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[17]/span[2]/a")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs55 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs55.get(0));
		Thread.sleep(2000);
      driver.quit();
	}
////////////internal audit services page will open and will return back to internal audit page/////////////
/////////////////////INTERNAL AUDIT SERVICES PAGE COMPLETED SUCCESSFULLY////////////////////////////
	@Test
	public void cls5() throws InterruptedException {
		System.setProperty("webdriver.chrome.Driver", "D:\\games\\study\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmsauditing.com/accounting-and-bookkeeping-services");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[1]/span[1]/a/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs56 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs56.get(0));
		Thread.sleep(3000);
//////////////////bms auditing page will open and will return back to account and bookkeeping page////////////	
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[2]/span/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs57 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs57.get(0));
		Thread.sleep(3000);
//////////finest accounting services page will open and will return back to acc and book page/////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[3]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs58 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs58.get(0));
		Thread.sleep(3000);
		///////////// acc standard in uae link will work/////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[5]/span/span[1]")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs59 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(tabs59.get(0));
		Thread.sleep(3000);
/////////////ACC VS BOOK PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK PAGE/////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[5]/span/span[2]/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs60 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs60.get(0));
		Thread.sleep(3000);
////////////financial management page will open and will return back to acc and book page//////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[6]/span[1]/span[1]/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs61 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs61.get(0));
		Thread.sleep(3000);
/////////////bookkeeping page will open and will return back to acc and book page/////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[6]/span[1]/span[2]/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs62 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs62.get(0));
		Thread.sleep(3000);
////////accounting page will open and will return back to acc and book page////////////////
		JavascriptExecutor js28 = (JavascriptExecutor) driver;
		WebElement scroll28 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > p:nth-child(11) > span"));
		js28.executeScript("arguments[0].scrollIntoView();", scroll28);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[10]/span/span[2]/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs63 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs63.get(0));
		Thread.sleep(3000);

//////////////scroll down and account standard link will work and return back to acc and book////////////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[2]/span/a/span")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs64 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs64.get(0));
		Thread.sleep(3000);
		////////////////// tax accounting page will work and will return back to acc and
		////////////////// book page///////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[5]/span/a/span/span"))
				.click();
		ArrayList<String> tabs65 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs65.get(0));
		Thread.sleep(3000);
		/////////// payroll accounting page will open and will return back to acc and
		/////////// book page//////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[1]/ul/li[6]/span/a/span/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs66 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs66.get(0));
		Thread.sleep(3000);
////////////////vat accounting page will open and willreturn back to acc and book page.////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[2]/ul/li[4]/span/a/span/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs67 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs67.get(0));
		Thread.sleep(3000);
///////////////backlog accounting  page will open and will return back to acc and book page/////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[2]/ul/li[5]/span/a/span/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs68 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs68.get(0));
		Thread.sleep(3000);
////////////financial statement reporting page will open and will return back to acc and book////////////
		JavascriptExecutor js29 = (JavascriptExecutor) driver;
		WebElement scroll29 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > p:nth-child(25) > span:nth-child(5)"));
		js29.executeScript("arguments[0].scrollIntoView();", scroll29);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[17]/span[5]/span/span/a"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs69 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs69.get(0));
		Thread.sleep(3000);
		///////// scroll down and bookkeeping services page will open and will return
		///////// back to acc and book////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[21]/span[1]/span/a/strong")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs70 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs70.get(0));
		Thread.sleep(3000);
		///////// bms audit page will open and will return back to acc and book
		///////// page/////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/span")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs71 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs71.get(0));
		Thread.sleep(3000);
		/////////////////////////////// same
		/////////////////////////////// process////////////////////////////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/a[1]/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs72 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs72.get(0));
		Thread.sleep(3000);
		//////////////// uae page will open and will return back to acc and book
		//////////////// page//////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/a[2]/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs73 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs73.get(0));
		Thread.sleep(3000);
		//////////// ksa page will open and will return back to acc and book
		//////////// page//////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/a[3]/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs74 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs74.get(0));
		Thread.sleep(3000);
		////////// qatar page will open and will return back to acc and book
		////////// page//////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/a[4]/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs75 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs75.get(0));
		Thread.sleep(3000);
		//////////////////// bahrain page will open and will return back to acc and book
		//////////////////// page/////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/a[5]/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs76 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs76.get(0));
		Thread.sleep(3000);
		//////////// oman page will open and will return back to acc and book
		//////////// page//////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/a[6]/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs77 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs77.get(0));
		Thread.sleep(3000);
		////////// uk page will open and will return back to acc and book
		////////// page//////////////////////
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[22]/span/a[7]/strong"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs78 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs78.get(0));
		Thread.sleep(3000);
		////////// usa page will open and will return back to acc and book
		////////// page///////////////////
		JavascriptExecutor js30 = (JavascriptExecutor) driver;
		WebElement scroll30 = driver.findElement(By.cssSelector(
				"#wrapper > div.main-content > section:nth-child(2) > div > div > div.col-md-9.right_border.col-lg-8.page_content > p:nth-child(33) > span"));
		js30.executeScript("arguments[0].scrollIntoView();", scroll30);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/p[23]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs79 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs79.get(0));
		Thread.sleep(3000);
/////////////financial and business page will open and wil return back to acc and book page////////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[4]/ul/li[1]/span/span/a/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs80 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs80.get(0));
		Thread.sleep(3000);
////////////due dilligence audit page will open and will return back to acc and book page//////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[4]/ul/li[2]/span/span/a/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs81 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs81.get(0));
		Thread.sleep(3000);
		////////// IT AUDIT PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK
		////////// PAGE////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[4]/ul/li[3]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs82 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs82.get(0));
		Thread.sleep(3000);
		/////// STATUTORY PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK
		/////// PAGE//////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[4]/ul/li[4]/span/span/a/span"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> tabs83 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs83.get(0));
		Thread.sleep(3000);
		///// DMCC APPROVED AUDIT PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK
		///// PAGE//////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[4]/ul/li[5]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs84 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs84.get(0));
		Thread.sleep(3000);
		//////// BUSINESS VALUATION PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK
		//////// PAGE////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[4]/ul/li[6]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs85 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs85.get(0));
		Thread.sleep(3000);
		////// FEASIBILITY PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK
		////// PAGE/////////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[5]/ul/li[1]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs86 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs86.get(0));
		Thread.sleep(3000);
		//////// RISK MANAGEMENT AUDIT PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND
		//////// BOOK PAGE//////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[5]/ul/li[2]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs87 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs87.get(0));
		Thread.sleep(3000);
		///////// VAT REGISTRATION PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK
		///////// PAGE/////////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[5]/ul/li[3]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs88 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs88.get(0));
		Thread.sleep(3000);
		//////// VAT RETURN FILING PAGE WILL OPEN AND WILL RETURN BACK TO ACC AND BOOK
		//////// PAGE//////
		driver.findElement(
				By.xpath("//*[@id=\"wrapper\"]/div[3]/section[2]/div/div/div[1]/div[5]/ul/li[4]/span/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs89 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs89.get(0));
		Thread.sleep(3000);
		driver.quit();
		//////// VAT REFUND PAGE WILL OPENAND WILL RETURN BACK TO ACC AND BOOK
		//////// PAGE///////////
////////////////ACCOUNTING AND BOOKKEEPING PAGE COMPLETED SUCCESSFULLY///////////////////////////
	}

}
