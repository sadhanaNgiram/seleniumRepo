package DemoTest.Test1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//wait 10 seconds
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		List <WebElement> linkedelement=driver.findElements(By.tagName("a"));
int resCode=200;
int brokenLinkCnt=0;
System.out.println("no of links are:" +linkedelement.size());
for(WebElement element:linkedelement)
{
	String url=element.getAttribute("href");
	try {
		
		URL urlLink=new URL(url);
		HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();
		huc.setRequestMethod("HEAD");
		huc.connect();
		resCode=huc.getResponseCode();
		
		if(resCode>=400)
		{
			System.out.println(url + "broken link");
			brokenLinkCnt++;		}
	}
	catch(MalformedURLException e)
	{
		
	}
	catch(Exception e)
	{
		
	}	 
}
System.out.println("Total Broken Links: "+ brokenLinkCnt );
	}

}
