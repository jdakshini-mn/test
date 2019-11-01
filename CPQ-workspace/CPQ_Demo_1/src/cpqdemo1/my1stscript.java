package cpqdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class my1stscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new SafariDriver();
		
		driver.get("http://google.com");
		
		((WebElement) driver.findElements(By.name("q"))).sendKeys("download selenium");
		
		driver.findElement(By.className("btnk")).click();

	}
	

}
