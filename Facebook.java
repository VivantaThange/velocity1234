package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Velocity\\\\Java setup\\\\Slenium standalone file\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver(); 
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.facebook.com/");
		//d.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		d.findElement(By.id("email")).sendKeys("7378425000");
		d.findElement(By.id("pass")).sendKeys("sumit@2282");
		Thread.sleep(2000);
		//d.findElement(By.id("loginbutton")).click();
		
	//d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//d.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]")).click();
		
		d.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
