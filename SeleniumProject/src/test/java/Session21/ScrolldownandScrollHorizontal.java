package Session21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Window;

import org.openqa.selenium.*;

public class ScrolldownandScrollHorizontal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome","F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//open new url
		driver.get("https://www.youtube.com/watch?v=iKp4pLzfHik&list=PLnNg6KqJ3HGh8K2KhCCxraHh09L3LPL4E&index=21");

		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//	
		WebElement element=driver.findElement(By.linkText("@saudagarsurwase9978"));
		js.executeScript("arguments[0].scrollIntoView.element");
		
		//scroll bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollheight)");
		
		//horizontal scroll on the webpage
		js.executeScript("arguments[0].scrollIntoView();",element);

		
	}

}
