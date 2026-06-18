import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

public class PracticeCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();

		System.out.println(count);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Afr");
		
		Thread.sleep(2000);
		
		List<WebElement> Options = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		
		for(WebElement Option : Options) {
			
			if(Option.getText().equalsIgnoreCase("South Africa")){
				System.out.println(Option.getText());
				Option.click();
				break;
			}
		
		}
	}

}
