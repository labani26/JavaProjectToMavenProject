import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTableSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        JavascriptExecutor Js = (JavascriptExecutor)driver;
        
        Js.executeScript("window.scrollBy(0, 700)");
        
        Thread.sleep(3000);
        
        Js.executeScript("document.querySelector('.tableFixHead').scrollTop = 500;");
        //document-Refers to the entire HTML page.
        //It is similar to Selenium: driver.findElement(By.cssSelector(".executeScript"));
        //querySelector('.tableFixHead') → Finds the first element with the class tableFixHead.
        //scrollTop = 500 → Scrolls that element 500 pixels downward.
	}

}
