import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksAndItsStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
       //broken links
        //step - 1 ; to get all urls tied upto the links using selenium
        //java methods will call the urls and get you the status code
        //if status code > 400 then that urls is not working > links which tied to url is broken
        
        String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
        //getText() reads what the user sees.
        //getAttribute() reads the value of an HTML attribute.
        System.out.println(url);
        driver.quit();
	}

}
