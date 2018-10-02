package krishna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartcareers {

	public static void main(String[] args) throws Exception {
	/*	System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://flipkartcareers.com");
		driver.navigate().to("http://flipkartcareers.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(text(),'Job Openings')])[1]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.switchTo().frame("iframe");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("keyword")).sendKeys("siva");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.close();*/
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkartcareers.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Job Openings'][1]")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		//page scrolling
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		//scroll to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//scroll to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//scroll to specific element
		WebElement e=driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		driver.findElement(By.name("keyword")).sendKeys("siva");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@role='checkbox']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[contains(@title,'Business Unit')])[2]")).click();
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		for(int i=0;i<=10;i++){
			a.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(3000);
			}
		driver.switchTo().activeElement().click();
		Thread.sleep(5000);
		a.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[contains(@title,'Department')])[2]")).click();
		Thread.sleep(5000);
		for(int i=0;i<=10;i++){
			a.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(3000);
			}
		driver.switchTo().activeElement().click();
		Thread.sleep(5000);
		a.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.name("postedindays")).sendKeys("20");
		Thread.sleep(5000);
		driver.findElement(By.name("reqnumber")).sendKeys("7593");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[contains(@title,'City')])[2]")).click();
		Thread.sleep(5000);
		for(int i=0;i<=7;i++){
			a.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(3000);
			}
		driver.switchTo().activeElement().click();
		Thread.sleep(5000);
		a.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Search Jobs']")).click();
		

		

	}

}
