package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\\\Sadhana\\\\SeleniumProject\\\\driver\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.com/");
WebElement element=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
Select dropdown=new Select(element);
//dropdown.selectByVisibleText("Computers");
dropdown.selectByValue("search-alias=stripbooks-intl-ship"); 
	}

}
