package allbrowser;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFindingElement {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen
		driver.get("http://gmail.com");
		
		// WebElement username = driver.findElement(By.id("identifierId"));
		// WebElement username = driver.findElement(By.name("identifier"));
		WebElement username = driver.findElement(By.cssSelector("#identifierId"));
		username.sendKeys("jimmydakshini@gmail.com");
		//driver.wait(10000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//---------------------------------------//
		//FluentWait will wait and try every regular interval to find web element.  

				Wait wait = new FluentWait<WebDriver>(driver)
				//.withTimeout(45, TimeUnit.SECONDS)
				//.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				
		//---------------------------------------//
				System.out.println(wait);
				
		// another way
		// driver.findElement(By.cssSelector("#identifierId")).sendKeys("jimmydakshini@gmail.com");
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
				System.out.println("after Fluent wait");
		// 1st way
		WebElement next = driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span"));
		next.click();
		System.out.println("after Next Click");
		
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div/div[2]/div[2]/div")).getText());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("Nokian@01");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebDriverWait wait1 = new WebDriverWait(driver,1);
		//---------------------------------------//
		//Explicitly Wait till the time button is not click-able.
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"passwordNext\"]/span/span"))).click();
		
		//driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		//---------------------------------------//
		
		driver.close();
	}


		
	

}