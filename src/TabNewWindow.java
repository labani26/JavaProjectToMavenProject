import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        driver.switchTo().newWindow(WindowType.TAB);
        //Selenium automatically switches to Tab 2.
        
        Set<String> WindowHandle = driver.getWindowHandles();
        //Gets IDs of all open tabs.
        //It stores IDs, not the tabs themselves.
        
        Iterator<String> It = WindowHandle.iterator();
        //Iterator lets you move one element at a time.
        
        String ParantWindowId = It.next();
        //next() returns the first ID.
        
        String ChildWindowId = It.next();
        //The iterator moves to the next element.
        
        driver.switchTo().window(ChildWindowId);
        
        driver.get("https://rahulshettyacademy.com/course-library");
        
        String CourseName = driver.findElements(By.cssSelector("[class*='group flex flex-col rounded-2xl overflow-hidden border border-border/20 bg-card hover:border-primary/40 hover:shadow-2xl hover:shadow-primary/10 transition-all duration-300 hover:-translate-y-1.5 cursor-pointer h-full']"))
        .get(1).getText();
        
        System.out.println(CourseName);
        
        driver.switchTo().window(ParantWindowId);
        
        driver.findElement(By.cssSelector("[name*='name']")).sendKeys(CourseName);
        
        driver.quit();
        
       
        
	}

}
