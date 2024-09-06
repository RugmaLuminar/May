package pagepkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class westsidepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-sections--15527152713781__header\"]/sticky-header/header/div[2]/div[2]/a/span")
	WebElement signin;
	@FindBy(xpath="//*[@id=\"verify_mNum\"]")
	WebElement phoneno;
	@FindBy(xpath="//*[@id=\"send_otp_btn\"]")
	WebElement sentotp;
	@FindBy(xpath="//*[@id=\"Search-In-Modal\"]")
	WebElement searchbutton;
	@FindBy(xpath="//*[@id=\"MainContent\"]/div[1]/div[2]/div[2]/div[1]/div[1]/div/a/span[1]")
	WebElement filter;
	@FindBy(xpath="//*[@id=\"MainContent\"]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/ul/li[2]/span[1]/span[1]/div")
	WebElement selecttshirt;
	@FindBy(xpath="//*[@id=\"swiper-wrapper-18adfc6efa41d447\"]/div[1]/div/img")
	WebElement tshirt;
	@FindBy(xpath="//*[@id=\"ProductSubmitButton-template--15527172309045__main\"]")
	WebElement addtocart;
	@FindBy(xpath="//*[@id=\"product-form-template--15527172309045__main\"]/div[2]/div/div/a/i")
	WebElement wishlist;
	
	
	
	public westsidepage(WebDriver driver)
	{   
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
		public void signinn()
		{
			signin.click();
		
	}   
	public void setValues(String phno)
	{    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		phoneno.sendKeys(phno);
		
	}
	public void otp() throws InterruptedException
	{
		//Thread.sleep(20000);
		sentotp.click();
		
			}
	
	public void actions()
	{
		searchbutton.sendKeys("mens shirt",Keys.ENTER);
		filter.click();
		 
		selecttshirt.click();
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1500)", "");
		tshirt.click();
		addtocart.click();
		wishlist.click();
	}
	public void screshot()throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\midhu\\OneDrive\\Desktop\\screenwestside"));
	}
	public void urlverification()
	{
		String actual="https://www.westside.com/products/eta-sage-floral-printed-slim-fit-t-shirt-300956328?variant=42674466127925";
		String expected=driver.getCurrentUrl();
		
		if(actual.equals(expected))
		{
			System.out.println("Login validation pass");
		}
		{
			System.out.println("Login validation failed");
		}
	}
}	
			
	

			
	