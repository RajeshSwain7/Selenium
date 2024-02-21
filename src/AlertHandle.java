import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String text = "Rajesh";
		System.setProperty("webdriver.chrome.driver", "D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		// get the alert notice

		System.out.println(driver.switchTo().alert().getText());

		// handle the alert using SwithTo()
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		// 2nd type of alert button where ok and cancel button is there
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		// to select no/cancel which is negative flow there you can use dismiss();
		driver.switchTo().alert().dismiss();

		driver.quit();

	}

}
