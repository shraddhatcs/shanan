package Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Class_1 {
	
	
	@Test
		public void flipcart() 
		 {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver-win32(2)\\\\chromedriver-win32\\\\chromedriver.exe");
			ChromeOptions options =new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				
				
				WebDriver driver=new ChromeDriver(options);
			driver.get("https://www.flipkart.com/");
		//	Thread.sleep(1000);
			driver.close();
		}

	}



