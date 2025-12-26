package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends BasePage{
	public homepage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//b[normalize-space()='ZARA COAT 3']")
	WebElement zaratext;
	
	@FindBy(xpath="//div[@class='container']//div[1]//div[1]//div[1]//button[2]")
	WebElement lnkAddToCart1;
	
	@FindBy(xpath="//div[@class='row']//div[2]//div[1]//div[1]//button[2]")
	WebElement lnkAddToCart2;
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement Tocart;
	
	public boolean verify_ZARA_txt() 
	{
		boolean y=zaratext.isDisplayed();
		return y;
	}
	
	public void addToCart1() 
	{
		lnkAddToCart1.click();
	}

	public void addToCart2() 
	{
		lnkAddToCart2.click();
	}
	public void ClickToCart() 
	{
		Tocart.click();
	}
}
