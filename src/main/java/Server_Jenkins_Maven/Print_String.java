package Server_Jenkins_Maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Print_String {
	
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        System.out.println("Print the output");
	       
	}

}
