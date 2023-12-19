package MazPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manyaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.getProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   try {
	   driver.get("https://www.amazon.in/");
	   
	    WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
	     signInLink.click();
	     
	     WebElement email = driver.findElement(By.id("ap_email"));
	     email.sendKeys("9922866010");
	     
	     WebElement con = driver.findElement(By.id("continue"));
	     con.click();
	     

	     WebElement pass = driver.findElement(By.id("ap_password"));
	     pass.sendKeys("Manali#6010");
	     
	     WebElement sign = driver.findElement(By.id("auth-signin-button"));
	     sign.click();
	     
//	     WebElement sub = driver.findElement(By.id("auth-submit-button"));
//	     sub.click();
	     
			Thread.sleep(1000);
			System.out.println("Sign-in successfullyy");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	

}
