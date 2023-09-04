import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End_end {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/programs/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click(); 
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); 
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("it's disebled");
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount'")).click();
		
		driver.findElement(By.id("divpaxinfo")).click(); // 
		Thread.sleep(2000L); 
		
		int i=1; 
		while(i<5) { 
			driver.findElement(By.id("hrefIncAdt")).click(); 
			i++; 
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("USD"); 
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
