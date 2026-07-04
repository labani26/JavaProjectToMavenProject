import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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
        
        
        List<WebElement> rowList = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        

        int sum = 0;

        // Calculate the sum of the 4th column
        for (int i = 0; i < rowList.size(); i++) {

            int amount = Integer.parseInt(rowList.get(i).getText());
            System.out.println(amount);

            sum = sum + amount;
        }

        System.out.println("Calculated Total = " + sum);

        // Get the displayed total
        String visibleAmount = driver.findElement(By.cssSelector(".totalAmount"))
                                     .getText()
                                     .split(":")[1]
                                     .trim();

        int displayedTotal = Integer.parseInt(visibleAmount);

        System.out.println("Displayed Total = " + displayedTotal);

        // Compare both totals
        Assert.assertEquals(sum, displayedTotal);
        driver.quit();
	}
}