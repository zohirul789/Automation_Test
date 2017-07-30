import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lunch_browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://ceac.state.gov/IV/Login.aspx");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
