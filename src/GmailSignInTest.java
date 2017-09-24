import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignInTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. Go to GmailWebsite
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.google.com/");
	
		//2.Fill User name
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("zohirul789@gmail.com");
		//3.click next
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		//3.Fill in password
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("05071988");
		//4.click sign in
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		//5.verify user did sign in
		
		//6.sign out
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		//7.verify user did sing out

	}

}
