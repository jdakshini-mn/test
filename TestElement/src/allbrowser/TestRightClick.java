package allbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		//Maximize window or FullScreen
		driver.manage().window().maximize(); 
		//implicitlyWait for 10 second before element is available
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Find image on which need to right click
		WebElement img = driver.findElement(By.xpath("//p[contains(text(),'Click the image to show the menu')]"));
		
		Actions action = new Actions(driver);
		
		//Right click on image
		action.contextClick(img).perform();
		
	    //navigating to product menu info
		WebElement productInfo = driver.findElement(By.xpath("//td[@id='dm2m1i1tdT']"));
        action.moveToElement(productInfo).perform();
        
        //navigating to Installation menu info
        WebElement installation = driver.findElement(By.xpath("//td[@id='dm2m2i1tdT']"));
        action.moveToElement(installation).perform();
        
        //navigating to How to setup menu info
        WebElement howToSetup = driver.findElement(By.xpath("//td[@id='dm2m3i1tdT']"));
        action.moveToElement(howToSetup).perform();
        
        //Click on to How to setup menu option
        action.click(howToSetup).perform();
	}

}
