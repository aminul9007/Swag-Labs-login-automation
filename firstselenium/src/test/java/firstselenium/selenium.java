package firstselenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window();
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
 
		//title match
		String ExpectedLink = "https://www.saucedemo.com/inventory.html";
		String ActualLink = driver.getCurrentUrl();
		
		//System.out.println(ActualTitle);
		if(ExpectedLink.equals(ActualLink))
		{
			System.out.println("Matched! Logged in into the right url");
		}
		else System.out.println("Didn't matched!Logged in into the wrong url");
	}

}
