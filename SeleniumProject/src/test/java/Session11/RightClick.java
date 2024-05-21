package Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.amazon.in/");
		WebElement button= driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]"));
Actions act=new Actions(driver);
act.contextClick().perform();
driver.wait(3);
		driver.quit();
	}

}
