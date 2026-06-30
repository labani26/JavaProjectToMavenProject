import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_DrandANDDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://dev.to/lensco825/making-a-simple-drag-and-drop-with-js-29l2");
        
        driver.switchTo().frame(driver.findElement(By.id("result-iframe")));
	
	   Actions ExDragDrop = new Actions(driver);
	   
	   WebElement Source = driver.findElement(By.cssSelector("div[class='dragElement']"));
	   
	   WebElement Target = driver.findElement(By.cssSelector("div[class='dropZone']"));
	   
	   ExDragDrop.dragAndDrop(Source, Target).build().perform();
	   
	   driver.switchTo().defaultContent();
	   
	   driver.quit();
	
	}

}

//
//Complete the Assignment and Post the code here
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class A2 {
//
//public static void main(String[] args) {
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
//
//WebDriver driver=new ChromeDriver();
//
//driver.get("http://the-internet.herokuapp.com/");
//
//driver.findElement(By.linkText("Nested Frames")).click();
//
//driver.switchTo().frame("frame-top");
//
//driver.switchTo().frame("frame-middle");
//
//System.out.println(driver.findElement(By.id("content")).getText());
//
//}
//
//}

