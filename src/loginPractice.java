import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Labani Sardar");
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='user']")).click();
		
		WebElement Okaybtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		
		Okaybtn.click();
		
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//select[@class='form-control']")).sendKeys("Tea");
		
		Thread.sleep(2000);
		
	   List<WebElement>	Options = driver.findElements(By.xpath("//option[@value='teach']"));
	   
	   for(WebElement Option : Options) {
		   
		   if(Option.getText().equalsIgnoreCase("Teacher")) {
			   System.out.println(Option.getText());
			   Option.click();
			   break;
			   
		   }
	   }
		
	 driver.findElement(By.xpath("//input[@id='terms']")).click();
	 
	 driver.findElement(By.id("signInBtn")).click();

	}

}
