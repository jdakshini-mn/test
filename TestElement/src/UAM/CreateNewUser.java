		/* 	Test Case Steps
		 * 		1. Launch and login to UAM
		 * 		2. Navigate to UAM Admin
		 * 		3. Create New User
		 * 		4. Logout
		 */


package UAM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewUser {

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


		//Create new user buy providing Email, UserName and click on save button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//section/div/div[3]/div[1]/div/div/input")).sendKeys("Tester1");
		Thread.sleep(500);
		driver.findElement(By.xpath("//section/div/div[1]/div[1]/div/div/input")).sendKeys("JAD2@Modelns.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//section/div/div[3]/div[1]/div/div/input")).click();
		
		//Click on Next button
		driver.findElement(By.xpath("/html/body/div[4]/div/div/section/div/footer/button[2]")).click();
		//Click on Save button
		driver.findElement(By.xpath("/html/body/div[4]/div/div/section/div/footer/button[3]")).click();
		
		
		
		//Logout User
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("header.slds-global-header_container:nth-child(1) div.slds-global-header.slds-grid.slds-grid_align-spread:nth-child(3) div.slds-global-header__item:nth-child(2) ul.slds-global-actions li.slds-global-actions__item:nth-child(3) div.slds-dropdown-trigger.slds-dropdown-trigger_click button.slds-button.slds-button_icon.slds-global-actions__avatar.slds-global-actions__item-action span.slds-avatar.slds-avatar_circle.slds-avatar_medium > img:nth-child(1)")).click();
				
				driver.findElement(By.xpath("//*[@id=\"logout\"]/a/span")).click();
				System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
				String pagetitle = driver.getTitle();
				System.out.println(pagetitle);

		

	}
	

}
