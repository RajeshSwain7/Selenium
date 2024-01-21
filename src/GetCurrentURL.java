import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedURL = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		//fetch the current URL
		String actualURL = driver.getCurrentUrl();
		
		
		System.out.println("actualURL = "+ actualURL);
		System.out.println("expectedURL = "+ expectedURL);
		
		//verify the URL post fetching tHE URL from browser
		
		if(actualURL.equals(expectedURL)) {
			System.out.println("URL is fectched successfully");
		}else {
			System.out.println("Unable to fectch the URL");
		}
		driver.close();
	}

}
