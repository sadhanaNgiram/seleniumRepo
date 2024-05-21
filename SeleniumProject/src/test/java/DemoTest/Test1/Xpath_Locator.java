package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
//switch to product page
String currwindowhandle=driver.getWindowHandle();
driver.switchTo().window(currwindowhandle);
driver.findElement(By.linkText("Sauce Labs Backpack")).click();

//locate 
List <WebElement> elementList=driver.findElements(By.partialLinkText("Sauce"));
System.out.println("size of" + elementList.size());
	}

}
