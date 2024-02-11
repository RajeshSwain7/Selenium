import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advandce_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//optional
		//System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//Selenium manager (Beta Phase)
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
