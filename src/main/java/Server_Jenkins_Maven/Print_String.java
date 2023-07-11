package Server_Jenkins_Maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Print_String {
	
	 @Test
	    public void mytest() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        System.out.println("***********************AMAZON SITE IS OPENED********************************");
	       
	}

}
