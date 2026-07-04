import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfCloumnAndRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        JavascriptExecutor Js = (JavascriptExecutor)driver;
        
        Js.executeScript("window.scrollBy(0, 600);");
        
        Js.executeScript("document.querySelector('.tableFixHead').scrollTop = 500;");
        
        WebElement ThirdRow = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)"));
        
        System.out.print("ThirdRow - "+ThirdRow);
        
        WebElement TotalColumn = driver.findElement(By.cssSelector(".table-display tbody tr"));
        
        System.out.println("TotalColumn - "+TotalColumn);
        
        WebElement TotalRow = driver.findElement(By.cssSelector(".table-display td"));
        
        System.out.println("TotalRow - "+TotalRow);
             
        
	}

}
//
//
//import java.util.Iterator;
//
//import java.util.List;
//
//import java.util.Set;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class A3 {
//
//public static void main(String[] args) {
//// TODO Auto-generated method stub
//
//
//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
//
//WebDriver driver=new ChromeDriver();
//
//driver.get("http://qaclickacademy.com/practice.php");
//
//WebElement table=driver.findElement(By.id("product"));
//
//System.out.println(table.findElements(By.tagName("tr")).size());
//
//System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//System.out.println(secondrow.get(0).getText());
//
//System.out.println(secondrow.get(1).getText());
//
//System.out.println(secondrow.get(2).getText());
//
//}
//
//}