package UAM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {

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
	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * Navigate to Google
		 * Search way2automation 
		 * Click on 1st link on google
		 * print all link and count from way2automation webside
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen

		//Navigate to UAM and Login
		
		driver.get("https://vi-poc-vtest3.cloud.modeln.com/uam/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
	//	driver.findElement(By.xpath("//button[@type='submit']").cl
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//*[@id=\"header-profile-popover\"]/span/img")).click();
		//driver.findElement(By.xpath("//*[@id=\"logout\"]/a/span")).click();
		
		
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
		driver.findElement(By.xpath("//section/div/div[3]/div[1]/div/div/input")).sendKeys("Tests2");
		driver.findElement(By.xpath("//section/div/div[1]/div[1]/div/div/input")).sendKeys("JDsSS@Modelns.com");
		
		
		
		driver.findElement(By.xpath("//section/div/div[3]/div[1]/div/div/input")).click();
		
		driver.findElement(By.xpath("//section/div/div[2]/div[2]/div/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/section/div/footer/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/section/div/footer/button[3]")).click();
		
		//Open User
		driver.findElement(By.xpath("//tr[1]/td[2]/a[1]")).click();
		driver.findElement(By.xpath("/div/div[2]/div/div[1]/div/div/div[2]/div/div/button[3]")).click();
		
		
		//Find 
		System.out.println(isElementPresent(By.xpath("//*[@id=\"header-profile-popover\"]/span/img")));
		//System.out.println(isElementPresent(By.xpath("//img[@alt='User Name'][src='/uam/static/media/avatar2.bcd0ae1a.jpg'][title='User avatar']")));
		//"//img[@alt='User Name'][src='/uam/static/media/avatar2.bcd0ae1a.jpg'][title='User avatar']"
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"logout\"]/a/span")).click();
		System.out.println(isElementPresent(By.xpath("//*[@id=\"logout\"]/a/span"))+"logout");
		

		
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/header/div/div[2]/ul/li[3]"));
		logOut.click();
		Thread.sleep(5000);
		WebElement signOut = driver.findElement(By.id("logout"));
		signOut.click();

		System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);

		

	}
	

}
