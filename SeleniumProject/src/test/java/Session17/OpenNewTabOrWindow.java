package Session17;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
System.setProperty("webdriver.driver.chrome","F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

//open new url
driver.get("https://www.google.com/");

System.out.println("first page" +driver.getTitle());
 //open new tab

driver.switchTo().newWindow(WindowType.TAB);

//open second tab
driver.get("https://www.amazon.in/");
System.out.println("Second page"+driver.getTitle());

//get window handles of open windows
Set<String> windowhandles= driver.getWindowHandles();
List<String> handles=new ArrayList<String>();
handles.addAll(windowhandles);

driver.close();

driver.switchTo().window(handles.get(0));   //switch to google.com
System.out.println("first page" +driver.getTitle());



	}

}
