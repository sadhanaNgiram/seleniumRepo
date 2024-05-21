package Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/s?rh=n%3A1374357031&fs=true&_encoding=UTF8&content-id=amzn1.sym.5935563a-75bb-4121-961a-d54889fc521d&pd_rd_r=901ac6c1-d971-42c3-b994-f602664077c4&pd_rd_w=NgxoE&pd_rd_wg=DvPtg&pf_rd_p=5935563a-75bb-4121-961a-d54889fc521d&pf_rd_r=5BP5F8BDCF8JPA95RW2D&ref=lp_1374357031_sar");
	WebElement button= driver.findElement(By.xpath("//span[text()=\"Get It by Tomorrow\"]"));
Actions act=new Actions(driver);
act.doubleClick().perform();

	driver.quit();
	}

}
