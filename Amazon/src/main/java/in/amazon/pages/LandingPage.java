package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	//Locator of the web-elements landing page of amazon
	//private WebElement mobile=driver.findElement(By.linktext("Mobiles")
	//mobiles.click()
	
	private Actions actions;
	
	@FindBy(linkText="Mobiles")
	private WebElement mobiles;
	
	@FindBy(id="nav-link-accountList")
	private WebElement signInMenu;
	
	@FindBy(linkText="Sign in")
	private WebElement signInBtn;
	

	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		actions=new Actions(driver);
	}
	
    public void clickMobiles()
    {
    	mobiles.click();
    }
    public void hoverOverHelloSignInMenu() {
    	actions.moveToElement(signInMenu).build().perform();
    }
    public void clickSignInBtn() {
    	signInBtn.click();
    }
}
