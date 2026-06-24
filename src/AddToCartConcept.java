import java.time.Duration;


import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//ChromeDriver is class implimenting WebDriver interface
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		

		String[] iteamsNeeded = { "Brocolli", "Tomato", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);

		addIteams(driver, iteamsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		
		//Explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		//Explicit wait
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.cssSelector("span[class='promoInfo']"))));
		
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
	//	driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();

	}

	public static  void addIteams(WebDriver driver, String[] iteamsNeeded) {

		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));

		// convert array into array list for easy search
		// cheack whatever you extracted present in the array list or not

		List<String> iteamsNeededList = Arrays.asList(iteamsNeeded);

		System.out.println(iteamsNeededList);

		int j = 0;

		for (int i = 0; i < Products.size(); i++) {

			String[] name = Products.get(i).getText().split("-");
			String ProductsListed = name[0].trim();

			// split - means to remove something and split iteams
			// when we use split - it becomes an array ex - Brocolli - 1 kg ,becomes =
			// Brocolli[0], 1 kg[1]
			// format it to get actual iteams name

			if (iteamsNeededList.contains(ProductsListed)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;

				// Stop when all required items are added
				if (j == iteamsNeeded.length) {
					break;
				}
              
			}
			
			
		}

	}

}
		

//code download
//import java.util.Arrays;
//
//import java.time.Duration;
//import java.util.List;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import org.openqa.selenium.support.ui.WebDriverWait;


//public class base {
//
//public static void main(String[] args) throws InterruptedException {
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//
//WebDriver driver=new ChromeDriver();
//
////driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
//
//driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//
//Thread.sleep(3000);
//
//addItems(driver,itemsNeeded);
//
//driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//
//driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//
//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
//
//driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//
//driver.findElement(By.cssSelector("button.promoBtn")).click();
//
////explicit wait
//
//
//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//
//
//System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//
//
//}
//
//public static  void addItems(WebDriver driver,String[] itemsNeeded)
//
//{
//
//int j=0;
//
//List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
//
//
//for(int i=0;i<products.size();i++)
//
//
//{
//
//
////Brocolli - 1 Kg
//
////Brocolli,    1 kg
//
//String[] name=products.get(i).getText().split("-");
//
//String formattedName=name[0].trim();
//
////format it to get actual vegetable name
//
////convert array into array list for easy search
//
////  check whether name you extracted is present in arrayList or not-
//
//
//List itemsNeededList = Arrays.asList(itemsNeeded);
//
//
//if(itemsNeededList.contains(formattedName))
//
//{
//
//
//j++;
//
////click on Add to cart
//
//driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//
//
//if(j==itemsNeeded.length)
//
//{
//
//break;
//
//}
//
//}
//
//}
//
//}
//
//}



