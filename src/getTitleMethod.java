import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle = "Facebook – log in or sign up";
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		//fetch the Title from URL
		String actualTitle = driver.getTitle();
		
		
		System.out.println("actualTitle = "+ actualTitle);
		System.out.println("expectedTitle = "+ expectedTitle);
		
		//verify the Title post fetching THE URL from browser
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is fectched successfully");
		}else {
			System.out.println("Unable to fectch the Title");
		}
		driver.close();

	}

}
