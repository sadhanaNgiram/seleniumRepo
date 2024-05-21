package Session12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/upload-download");
		 //find webelement choose file
		 driver.findElement(By.xpath("//input[@id=\"uploadFile\"]")).sendKeys("C:\\Users\\dell\\Desktop\\driven.json");
	driver.quit();
	}

}
