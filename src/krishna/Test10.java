package krishna;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("9441437637");
		driver.findElement(By.name("password")).sendKeys("9441437637");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("frame");
		driver.findElement(By.name("mobile")).sendKeys("8074905787");
		driver.findElement(By.name("message")).sendKeys("hi siva where are you?");
		driver.findElement(By.name("Send")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		try{
		     if(driver.findElement(By.xpath("//*[text()='Install chrome plugin']")).isDisplayed())
				{
			      driver.findElement(By.xpath("//*[text()='Install chrome plugin']")).click();
			      Thread.sleep(5000);
			      Robot r=new Robot();
			      r.keyPress(KeyEvent.VK_TAB);
			      r.keyRelease(KeyEvent.VK_TAB);
			      Thread.sleep(5000);
			      r.keyPress(KeyEvent.VK_TAB);
			      r.keyRelease(KeyEvent.VK_TAB);
			      Thread.sleep(5000);
			      r.keyPress(KeyEvent.VK_ENTER);
			      r.keyRelease(KeyEvent.VK_ENTER);
			      Thread.sleep(5000);
				}
		}
		catch(Exception ex){
			
		}
		driver.switchTo().frame("frame");
		String x=driver.findElement(By.xpath("(//*[contains(@class,'ssms')])[6]/following-sibling::*")).getText();
		System.out.println(x);
		driver.switchTo().defaultContent();
		//do logout
		driver.findElement(By.xpath("//*[@class='lout']")).click();
		 Thread.sleep(5000);
		 //close site
		 driver.close();


	}

}
