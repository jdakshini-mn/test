package browser;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.com.bonigarcia.wdm.WebDriverManager;

public class Firefoxtest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","/Users/jdakshini/selenium⁩/BrowserTesing/Pre-Req⁩/geckodriver");
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("httlp://google.com");

	}

}
