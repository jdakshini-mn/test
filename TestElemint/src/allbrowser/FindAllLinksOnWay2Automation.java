package allbrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinksOnWay2Automation {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		/*
		 * Navigate to Google
		 * Search way2automation 
		 * Click on 1st link on google
		 * print all link and count from way2automation webside
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen
		//driver.get("https://login.salesforce.com/");
		driver.get("https://www.google.com/");
		
		
		//http://www.way2automation.com
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("way2automation");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).click();
		
		WebElement block = driver.findElement(By.xpath("/html/body/div[4]"));
		
		List<WebElement> links2 = block.findElements(By.tagName("a"));

		//System.out.println(links.get(7).getText());
		
		for(WebElement link:links2) {
			System.out.println(link.getText()+"  --URL is --"+link.getAttribute("href"));
		
			
			
			
		}
		System.out.println("Size is - "+links2.size());
		//driver.close();
		
		
		
	}

}
