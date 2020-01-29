package testbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Firefoxbrower {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","/Users/jdakshini/selenium⁩/BrowserTesing/Pre-Req⁩/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.modeln.com");
		//driver.getTitle();
		//driver.close();
		//driver.quit();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.gmail.com");
		//System.out.println(driver1.getTitle());
		//String title = driver1.getTitle();
		//System.out.println(title);
		//System.out.println(title.length());
	
		WebElement username = findElement(By.id("identifierId"));
		username.sendKeys("jdaksini@gmail.com");
		

	}

	private static WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
