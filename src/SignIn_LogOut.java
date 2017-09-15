import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn_LogOut {

	public static void main(String[] args) throws InterruptedException {
		//verify account
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.phptravels.net/");
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		
		Thread.sleep(3000);
		 driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		 
		 driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/div/div[1]/input")).sendKeys("johir_789@yahoo.com");
		 
		 driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/div/div[2]/input")).sendKeys("05071988");
		 
		 driver.findElement(By.xpath(".//*[@id='loginfrm']/div[4]/button")).click();
		
		

	}

}
