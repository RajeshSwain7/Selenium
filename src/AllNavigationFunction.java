import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllNavigationFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		
		if(driver.getTitle().equals("Google")) {
			System.out.println("Navigate back to Google");
		}
		else {
			System.out.println("Navigate back is failed");
		}
		
		driver.navigate().forward();

		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("Navigate again to Facebook");
		}
		else {
			System.out.println("Navigate forward is failed");
		}
		driver.close();
		
	}

}
