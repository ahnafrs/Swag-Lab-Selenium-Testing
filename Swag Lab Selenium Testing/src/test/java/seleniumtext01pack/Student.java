package seleniumtext01pack;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialization
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//For connecting driver with URL
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Title Match
		
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title got matched");
		}
		else {
			System.out.println("Title did not matched");
		}
		
		
		//URL Check
		
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		//URL Compare
		
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("URL Matched");
		}else {
			System.out.println("URL did not matched");
		}
		

	}

}
