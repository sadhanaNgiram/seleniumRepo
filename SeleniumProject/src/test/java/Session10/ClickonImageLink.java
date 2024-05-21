package Session10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonImageLink {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.opencart.com/");
driver.findElement(By.xpath("//img[@title=\"OpenCart - Open Source Shopping Cart Solution\"]")).click();
//if(driver.getTitle(""))
	 driver.quit();
		
}
}
