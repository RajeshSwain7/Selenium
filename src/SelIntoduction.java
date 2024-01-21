import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntoduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking Browser

		//Chrome-Chromedriver-> method
		//WebDriver close get
		//WebDriver method + class method
		
		//cheomeDriver.exe->Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://facebook.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
