package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
List <WebElement> linkedelement=driver.findElements(By.tagName("a"));
System.out.println("no of links are:" +linkedelement.size());

for(WebElement e1:linkedelement)
{
System.out.println(e1.getText());	
}
driver.close();
	}

} 
