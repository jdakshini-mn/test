		/* 	Test Case Steps
		 * 		1. Launch and login to UAM
		 * 		2. Navigate to UAM Admin
		 * 		3. deactivate and activate User
		 * 		4. Logout
		 */


package UAM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeactivateAndActivate {

	public static WebDriver driver;
	
public static boolean isElementPresent(By by) {
		
		
		
		int size = driver.findElements(by).size();
		if(size==0) 
			return false;
		 else {
			return true;
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen

		//Navigate to UAM and Login
		
		driver.get("https://vi-poc-vtest3.cloud.modeln.com/uam/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//implicitlyWait for 10 second before element is available
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigating to UAM Admin
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/article/div[2]/div/div/div[2]/ul/li[1]/div/a")).click();
		
		
		//Switch between tabs using Ctrl + \t//
		for (String handle1 : driver.getWindowHandles()) {
	        System.out.println(handle1); 
	        driver.switchTo().window(handle1);     
	}
		

		//Open User and deactivate
		driver.findElement(By.xpath("//tr[1]/td[2]/a[1]")).click();
		Thread.sleep(3000);
		System.out.println(isElementPresent(By.xpath("//button[contains(text(),'Deactivate')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Deactivate')]")).click();
		
		System.out.println(isElementPresent(By.xpath("//button[@class='slds-button slds-button_brand'][contains(text(),'Deactivate')]")));
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][contains(text(),'Deactivate')]")).click();
		
		
		//Activate again
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Activate')]")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][contains(text(),'Activate')]")).click();
		
		//Close Success Message on the top
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"adminRoot\"]/div/div[1]/div[1]/div/button")).click();
		
		
		Thread.sleep(2000);
		

		//Logout User
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("header.slds-global-header_container:nth-child(1) div.slds-global-header.slds-grid.slds-grid_align-spread:nth-child(3) div.slds-global-header__item:nth-child(2) ul.slds-global-actions li.slds-global-actions__item:nth-child(3) div.slds-dropdown-trigger.slds-dropdown-trigger_click button.slds-button.slds-button_icon.slds-global-actions__avatar.slds-global-actions__item-action span.slds-avatar.slds-avatar_circle.slds-avatar_medium > img:nth-child(1)")).click();
				
				driver.findElement(By.xpath("//*[@id=\"logout\"]/a/span")).click();
				System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
				String pagetitle = driver.getTitle();
				System.out.println(pagetitle);

		

	}
	

}
