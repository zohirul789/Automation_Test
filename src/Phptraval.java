import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Phptraval {

	public static void main(String[] args) throws InterruptedException {
		
		//Registration/Enter valid information .
		WebDriver driver = new FirefoxDriver();
		
		//Enter URL.
		driver .get("http://www.phptravels.net/");
		
		//Click on myaccount.
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		
		//Wait 3 sec.
		Thread.sleep(3000);
		
		//Click on Sing Up button.
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		//Enter First Name.
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[3]/input")).sendKeys("zohirul");
		
		//Enter last name.
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[4]/input")).sendKeys("alom");
		
		//Enter phone number.
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[5]/input")).sendKeys("7189155916");
		
		//Enter email Address.
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[6]/input")).sendKeys("johir_789@yahoo.com");
		
		//Enter password.
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[7]/input")).sendKeys("05071988");
		
		//Enter confirm password.
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[8]/input")).sendKeys("05071988");
		
		//Click on sing up .
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
		
		//Click on users name.
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		
		//Wait 3 sec.
		Thread.sleep(3000);
		
		//Click on logout.
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a")).click();

	}

}
