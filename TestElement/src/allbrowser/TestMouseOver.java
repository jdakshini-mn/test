package allbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {
	
	public static WebDriver driver;
	
	
	public static boolean isElementPresent(By by) {
			
			/*try {
			driver.findElement(By.xpath(locator));
			return true;
			}catch(Throwable t) {
				return false;
			}*/
			
			int size = driver.findElements(by).size();
			if(size==0) 
				return false;
			 else {
				return true;
			 }
			}

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize(); //Maximize window or FullScreen
		
		//implicitlyWait for 10 second before element is available
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("way2automation");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//div[@class='g']//div//div//div[@class='rc']//span[@class='S3Uucc'][contains(text(),'Way2Automation')]")).click();
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Practice site 1')]")).click();

		//Navigate to UAM and Login
		
		

	}

}
