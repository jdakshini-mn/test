package allbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


	


	public class callbrowser{
		
		public static String browser = "safari"; //excel sheet
		public static WebDriver driver;

		public static void main(String[] args) {
		
		
		if (browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
			
		}else if (browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			
			
		}else if (browser.equals("safari")) {
			
			WebDriverManager.iedriver().setup();
			driver = new SafariDriver();
			driver.get("https://www.google.com");
		}
		
		
		//System.setProperty("webdriver.gecko.driver","/Users/jdakshini/selenium⁩/BrowserTesing/Pre-Req⁩/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.modeln.com");
		//driver.getTitle();
		//driver.close();
		//driver.quit();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver1 = new ChromeDriver();
		//driver1.get("https://www.google.com");
		//System.out.println(driver1.getTitle());
		//String title = driver1.getTitle();
		//System.out.println(title);
		//System.out.println(title.length());
		//driver1.quit();

	}

}
