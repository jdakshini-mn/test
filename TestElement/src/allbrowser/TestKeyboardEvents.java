package allbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboardEvents {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		//Maximize window or FullScreen
		driver.manage().window().maximize(); 
		//implicitlyWait for 10 second before element is available
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("test@test.com");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		
	//	driver.findElement(By.xpath("//h1[@id='headingText']")).click();
		
	//	action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
	//	action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		//driver.findElement(By.id("identifierId")).click();
		//action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		//action.sendKeys(Keys.ENTER).perform();
		

	}

}
