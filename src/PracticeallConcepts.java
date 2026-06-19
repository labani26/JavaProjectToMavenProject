import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PracticeallConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Labani sardar");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mail2labanisardar@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Labani@26");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		driver.findElement(By.id("exampleFormControlSelect1")).sendKeys("Fem");
		
		List<WebElement> Options = driver.findElements(By.id("exampleFormControlSelect1"));
		
		for(WebElement Option : Options ) {
			if(Option.getText().equalsIgnoreCase("Female"));
			System.out.println(Option.getText());
			Option.click();
			break;
			
		}
		
		WebElement radioButton2 = driver.findElement(By.id("inlineRadio2"));

		radioButton2.click();

		System.out.println("ID: " + radioButton2.getDomAttribute("id"));
		System.out.println("Value: " + radioButton2.getDomAttribute("value"));

		if (radioButton2.isSelected()) {
		    Assert.assertTrue(true);
		} else {
		    Assert.assertTrue(false);
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("26/03/1998");
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}

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
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//
//WebDriver driver=new ChromeDriver();
//
//driver.get("https://rahulshettyacademy.com/angularpractice/");
//
//driver.findElement(By.name("name")).sendKeys("rahul");
//
//driver.findElement(By.name("email")).sendKeys("hello@abc.com");
//
//driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
//
//driver.findElement(By.id("exampleCheck1")).click();
//
//WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
//
//Select abc = new Select(dropdown);
//
//abc.selectByVisibleText("Female");
//
//driver.findElement(By.id("inlineRadio1")).click();
//
//driver.findElement(By.name("bday")).sendKeys("02/02/1992");
//
//driver.findElement(By.cssSelector(".btn-success")).click();
//
//System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
//
//}
//
//
//}
//
