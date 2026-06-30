import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://jqueryui.com/droppable/");
        
        System.out.println(driver.findElements(By.cssSelector("iframe[class='demo-frame']")).size());
        
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        
        Actions Drad_Drop = new Actions(driver);
        
        //The Actions class is used to perform advanced mouse and keyboard interactions 
        //that cannot be done with a simple click() or sendKeys().
        //Examples:
        
        //Drag and Drop ✅
        //Mouse Hover
        //Right Click
        //Double Click
        //Click and Hold
         //Keyboard combinations (Ctrl+C, Ctrl+V, Shift, etc.)
        
        WebElement Source = driver.findElement(By.id("draggable"));
        
        WebElement Target = driver.findElement(By.id("droppable"));
        
        Drad_Drop.dragAndDrop(Source,Target).build().perform();
        
        driver.switchTo().defaultContent();
        //Exit the iframe and return to the main webpage.
        
        driver.quit();;

	}

}
