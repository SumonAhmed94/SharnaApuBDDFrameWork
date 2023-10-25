package facebook.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStep {
	public WebDriver driver; 

	public WebDriver openApp(String browser, String url) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("Edge") ) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else if (browser == "Firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else {
			System.out.println("Chrome is running as default");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize(); // we put here because we don't need to put every block because of inside the method.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		return driver;

	}

	public void closeApp() {
		if (driver != null) { 
			driver.quit();
		}
	}
}
