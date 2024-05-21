package Session09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.calculator.net/");
	 List <WebElement> listelements=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
	 System.out.println("No. of radio butttons=" +listelements.size());
//	 for(WebElement web:listelements)
//	 {
//		 System.out.println("name of element="+web.getText());
//	 }
	// driver.close();
	 driver.quit();
		
}
}
