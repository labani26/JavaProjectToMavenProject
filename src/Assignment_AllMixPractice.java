import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class Assignment_AllMixPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click(); 
		
		Actions actions = new Actions(driver);

		WebElement element = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]"));
		
		actions.doubleClick(element).build().perform();
        
		String GetOption = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		System.out.println(GetOption);
		
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));

		Select dropDown = new Select(staticDropdown);
		
		dropDown.selectByVisibleText(GetOption);

		String text = dropDown.getFirstSelectedOption().getText();
		
		System.out.println(text);

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.id("alertbtn")).click();

		String alertText = driver.switchTo().alert().getText();
		
		System.out.println(alertText);

		driver.switchTo().alert().accept();
         
        
	}

}

//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.Keys;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.support.ui.Select;
//
//
//public class Assignment {
//
//public static void main(String[] args) {
//
//// TODO Auto-generated method stub
//
//
//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://qaclickacademy.com/practice.php");
//
//        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
//
//        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
//
//        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
//
//        Select s=new Select(dropdown);
//
//        s.selectByVisibleText(opt);
//
//        driver.findElement(By.name("enter-name")).sendKeys(opt);
//
//        driver.findElement(By.id("alertbtn")).click();
//
//     String text=  driver.switchTo().alert().getText();
//
//     if(text.contains(opt))
//
//     {
//
//    System.out.println("Alert message success");
//
//     }
//
//     else
//
//    System.out.println("Something wrong with execution");
//
//}
//
//     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   
//
//
//}
