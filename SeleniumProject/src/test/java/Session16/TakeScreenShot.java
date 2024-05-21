package Session16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome","F:\\Sadhana\\SeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//open new url
		driver.get("https://www.google.com/");

		//capture fullscreen screenshot
		
	//step1: convert webdriver object to TakeScreenshot interface
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		
		//step2: call getScreenshotas method to create image file
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\dell\\Desktop\\newman\\fullpage.png");
		
		//step3: copy image file to destination 
		FileUtils.copyFile(src, dest);
		
		driver.quit();
	}

}
