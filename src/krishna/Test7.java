package krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);	
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);	
		driver.findElement(By.name("firstName")).sendKeys("siva");
		driver.findElement(By.name("lastName")).sendKeys("Bandla");
		driver.findElement(By.name("phone")).sendKeys("9441437637");
		driver.findElement(By.name("userName")).sendKeys("siv203gec10@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Edlapadu mandal");
		driver.findElement(By.name("address2")).sendKeys("Jaladi road");
		driver.findElement(By.name("city")).sendKeys("Guntur");
		driver.findElement(By.name("state")).sendKeys("Andhra Pradesh");
		driver.findElement(By.name("postalCode")).sendKeys("522233");
		Thread.sleep(5000);	
		WebElement e=driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("siva");
		driver.findElement(By.name("password")).sendKeys("9441437637");
		driver.findElement(By.name("confirmPassword")).sendKeys("9441437637");
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		driver.close();
	
	}

}
