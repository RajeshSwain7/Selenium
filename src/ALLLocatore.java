import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALLLocatore {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//implicit wait -> it applies globally until the full page load till 5 second
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				
				//Enter user name & password using the ID, Name & class locator.
				driver.findElement(By.id("inputUsername")).sendKeys("Rajesh");
				driver.findElement(By.name("inputPassword")).sendKeys("rah@12323");
				driver.findElement(By.name("chkboxOne")).click();
				driver.findElement(By.name("chkboxTwo")).click();
				
				// Click on Sign in button
				WebElement signIN= driver.findElement(By.className("signInBtn"));
				signIN.click();
				
				
				// Using CSS Selector
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
				//once password is failed it should click on forget password button.
				
				//Using linkText locator
				
				driver.findElement(By.linkText("Forgot your password?")).click();				
				//throws InterruptedException
				Thread.sleep(1000);
				//using X-Path
				////Tagname[@attribute='value']
				
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
				//xpath with index number when same type is available when we don't have unique identifier
				driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("John@ckii.com");
				
				//indexes with css and xpath.
				////Tagname[@attribute='value']:nth-child(index)--->child item
				driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
				
				////xpath-> Tagname[@attribute='value'][index]
				driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("John@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1245632522");
				driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
				
				//xpath with parent to child method
				//parentTagname/childtagname
				driver.findElement(By.xpath("//form/input[3]")).sendKeys("95245215545");
				
				
				//css parent to child
				//Parenttagname childname  [parent tagname then give space and add child tagname]
				driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
				System.out.println(driver.findElement(By.cssSelector("form p.infoMsg")).getText());
				
				driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
				Thread.sleep(1000);
				//Login
				driver.findElement(By.id("inputUsername")).sendKeys("Rajesh");
				driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
				driver.findElement(By.name("chkboxOne")).click();
				driver.findElement(By.name("chkboxTwo")).click();
				
				// Click on Sign in button
				WebElement signIN1= driver.findElement(By.className("signInBtn"));
				signIN1.click();
				System.out.println("Hye!! Rajesh, Welcome to Locators in selenium");
				
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".logout-btn")).click();
				System.out.println("Congratulattion you have successfully Automate the 1st Web page");
				driver.quit();				


	}

}
