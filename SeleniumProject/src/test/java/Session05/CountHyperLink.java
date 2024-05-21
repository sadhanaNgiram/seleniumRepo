package Session05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 List <WebElement> listelements=driver.findElements(By.tagName("a"));
 System.out.println("size of elements=" +listelements.size());
 for(WebElement web:listelements)
 {
	 System.out.println("name of element="+web.getText());
 }
 driver.close();
// driver.quit();
	}

}
