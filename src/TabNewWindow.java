import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TabNewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
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
        
        WebElement name = driver.findElement(By.cssSelector("[name*='name']"));
        
        name.sendKeys(CourseName);
        
        File file = name.getScreenshotAs(OutputType.FILE);
        //OutputType.FILE - Give me the screenshot as a File.Return the screenshot as a File object.
        
     //   FileUtils.copyFile(file,new File("src/logo.png"));
        
//        FileUtils → is a utility class from the Apache Commons IO library that provides ready-made methods for working with files and directories.
//        It saves you from writing a lot of boilerplate Java code.
//       Instead of writing many lines to copy, move, or delete files using Java streams, you can call a single method.
        
//        copyFile() → A method that copies one file to another.
//        file → The source File object (the file you want to copy).
//        new File("logo.png") → Creates a File object representing the destination file named logo.png.
        File destination = new File("src/logo.png");
        
        FileUtils.copyFile(file, destination);
        
        System.out.println(destination.getAbsolutePath());
        
//        
//        driver.quit();
        
        int Height = name.getRect().getDimension().getHeight();
        System.out.println(Height);
        //System.out.println - return vois
        
        int Width = name.getRect().getDimension().getWidth();
        System.out.println(Width);
        
//        Assert.assertEquals(Height, Width);
        
	}

}
