package DemoTest.Test1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\\\Sadhana\\\\SeleniumProject\\\\driver\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");
//locate username using tag id
driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

//locate password using class
driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("secret_sauce");

//locate login button
driver.findElement(By.cssSelector("input[type=submit]")).click();

//switch to currentwindow
String currentwindow=driver.getWindowHandle();
driver.switchTo().window(currentwindow);

//
driver.findElement(By.cssSelector("button[class=\"btn_primary btn_inventory\"]")).click();

driver.findElement(By.cssSelector("button[class=\"btn_primary btn_inventory\"]")).click();
driver.close();
	}

}
