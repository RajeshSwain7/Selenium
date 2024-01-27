import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GetPasswordAutomatically {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name= "Rajesh";
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait -> it applies globally until the full page load till 5 second
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Caling the method
		 
		String Password = getPassword(driver);
				
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Enter user name & password using the ID, Name & class locator.
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		
		// Click on Sign in button
		WebElement signIN= driver.findElement(By.className("signInBtn"));
		signIN.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.cssSelector(".logout-btn")).click();
		
		System.out.println("Congratulattion you have successfully Automate the 1st Web page");
		driver.quit();	

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();				
		//throws InterruptedException
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText= driver.findElement(By.cssSelector("form p.infoMsg")).getText();
		Thread.sleep(3000);
		//split the sting
		String[] passwordArray =  passwordText.split("'");
		// 0th index -please use the temporary password
		//1st index - 'rahulshettyacademy' to login
		passwordArray[1].split("'");
		//0th index- 'rahulshettyacademy'
		//1th index- to login
		String[] passwordArray2= passwordArray[1].split("'");
		String password= passwordArray2[0];
		return password;
	}

}
