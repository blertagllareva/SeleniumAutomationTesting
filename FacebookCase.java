package shembullWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestCase {

	public static void main(String[] args)
	{
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("Test Selenium");
		driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("WebDriver");
	
		/*driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[4]/div/div[1]/div")).click();*/
		
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		select1.selectByVisibleText("Sep");
		
		Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		select2.selectByValue("10");
		
		Select select3 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		select3.selectByIndex(6);
		
		driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/a")).click();
		driver.navigate().back();
		driver.quit();
		
		
		
		
		
		
		
	}

}
