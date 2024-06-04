import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver WD = new ChromeDriver();
		WD.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WD.get("https://rahulshettyacademy.com/locatorspractice/");
		WD.findElement(By.id("inputUsername")).sendKeys("Kalpana");
		WD.findElement(By.name("inputPassword")).sendKeys("hello@123");
		WD.findElement(By.className("signInBtn")).click();
		System.out.println(WD.findElement(By.cssSelector("p.error")).getText());
		WD.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		WD.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Kalpana");
		WD.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kmukil@gmail.com");
		WD.findElement(By.xpath("//form/input[3]")).sendKeys("32423432");
		WD.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(WD.findElement(By.xpath("//form/p[@class='infoMsg']")).getText());
		WD.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Kalpana");
		WD.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		
	}

}
