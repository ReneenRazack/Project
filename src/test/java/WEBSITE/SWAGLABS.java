package WEBSITE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SWAGLABS {
	

	WebDriver driver;
	@Test(dataProvider="swaglab")
	public void cls(String username,String password,String blah,String boo,String shhh,String again,String haa,String hee,String yu,String ha,String pass2,String fddd,String shdjs,String hoo,String user,String passss,String rrr,String yyy) throws InterruptedException {
	System.setProperty("Webdriver.edge.driver","D:\\edgedriver_win64 (shhh)\\Edgedriver.exe");
	EdgeOptions options=new EdgeOptions();
	driver=new EdgeDriver(options);
	driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/v1/index.html");
	    driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	    
	   //////////////////////////////////login page///////////////////////////////////////////////
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button")).click();   
	
	    
	    driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
	    
/////////////////////////////////////////home page and cart page/////////////////////////////////////////////////////////
	    
	    driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(blah);
	    
	  driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(boo);
	  driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(shhh);
	  driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
	  //Thread.sleep(2000);
	  //////////////////////////checkout page filling and back to cart page by clicking cancel
	  
	  driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
	  //Thread.sleep(2000);
	  //////////////////////////////back to checkout page by clicking checkout in cart///////////////////////////
	  
	  driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(again);
	  driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(haa);
	  driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(hee);
	  //Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
	  //Thread.sleep(2000);
	  /////////////////////////////////to  over review page after clicking continue in checkout/////////////////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();
/////////////////////////////////////back to home page after clicking cancel in over review///////////////////////////////////////////
	  //Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	  //////////////////////////////////////////////click button to remove and click same button to add product in cartpage/////////////////
	  //Thread.sleep(4000);
	  driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
	  ////////////////////////////////////to open cart page///////////////////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
	  
	  /////////////////////////////////click on checkout button in cart page//////////////////////////////////////////////
	  
	  //Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(yu);
	  //Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(ha);
	  driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(pass2);
	  /////////////////////////form filling will happen in checkout page/////////////////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
////////////////////////////////////////overview page will open ///////////////////////////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
	  ////////////////////////////////////finish button will work/////////////////////////////////////////////////
	  driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
	  ///////////////////////////////////////cart page will open///////////////////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
///////////////////////////////back to home page/////////////////////////////////////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
	  driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
 ////////////////////////////////////two items will be selected in home page and cart page will open///////////////////
	  driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > button")).click();
	  driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_item_label > div.item_pricebar > button")).click();
	  driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_secondary")).click();
///////////////////////////////two items will be deleted from cart page and home page will open/////////////////////////////	  
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	  /////////////////////////////remove button after equipping will work in home ////////////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
/////////////////////////////////////two items will be selected///////////////////////////////////////////////////////	
	driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
	driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(fddd);
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(shdjs);
	driver.findElement(By.cssSelector("#postal-code")).sendKeys(hoo);
///////////////////cart page will open and checkout page will open then filling proccess will work/////////////////////////
	driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
	driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
	///////////////overview page will open and order will be placed then will return to cart  page////////////////////////////
	driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
	
//////////will return to home page after that click on any tshirt to open a page and preview selected tshirt/////////////// 	
	driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();

///////////////////////////item will select and back button will work //////////////////////////////////////////////
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	Thread.sleep(2000);
///back to home page item selected not showing in cart icon or add to cart button so item will be selected in home page/////
	driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
	driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
//////////////////item page will open and remove the item from cart //////////////////////////////////////////	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
/////////back button will work and return back to home page but still remove button is showing on item and its a bug////////////////	
	driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
//////////////////////////////side bar will work on the side///////////////////////////////////
	Thread.sleep(4000);
	driver.findElement(By.id("inventory_sidebar_link")).click();
	//////////all item will work on sidebar////////////////////////////////////
	driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("about_sidebar_link")).click();
	driver.get("https://www.saucedemo.com/v1/");
	/////////////////////////////about page will work in sidebar and will be back to swaglab login page////////////////////////////
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passss);
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	/////////////////////////////login process will happen and home page will open//////////////////////////////////////////
	
	driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(rrr);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(yyy);
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	//////////////side bar will open and log out process will happen and then login process will happen//////////////////////
	

	driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
	element.sendKeys("Name (Z to A)");
	element.click();
	driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
	//Thread.sleep(4000);
	WebElement element1=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
	element1.sendKeys("Name (A to Z)");
	element1.click();
	driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
	//Thread.sleep(4000);
	WebElement element2=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
	element2.sendKeys("Price (low to high)");
	element2.click();
	driver.findElement(By.cssSelector("#inventory_filter_container > select")).click();
	Thread.sleep(4000);
	WebElement element3=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
	element3.sendKeys("Price (high to low");
	element3.click();
	/////////inventory of selecting price range and also align the product in different order will happen//////////////
	
	}
	@AfterClass
	public void teslog()  {
		//driver.quit();
	}
	@DataProvider(name="swaglab")
	public Object[][]provideData() {
		return new Object[][] {
			{"standard_user","secret_sauce","blah","brr","465645","blah","brr","465645","ren","kozh","234234","gaa","gee","674654","standard_user","secret_sauce","standard_user","secret_sauce"},
		};
		}	

}
