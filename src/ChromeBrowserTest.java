import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toyotafinancial.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username-input")).sendKeys("zohirul789");
		driver.findElement(By.id("password-input")).sendKeys("alom0507");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout_btn")).click();

	}

}
