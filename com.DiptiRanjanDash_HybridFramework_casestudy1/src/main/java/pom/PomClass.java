package pom;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomClass extends BasePage implements Autoconstant {
	
	public WebDriver driver;
	//declaration
	//initialization
	//utilization
	
	//declaration
	@FindBy (xpath = "(//input[@class=\"input_error form_input\"])[1]")
	private WebElement username;
	
	@FindBy (xpath = "(//input[@class=\"input_error form_input\"])[2]")
	private WebElement password;
	
	@FindBy (xpath = "//input[@class=\"submit-button btn_action\"]")
	private WebElement loginbutton;
	
    @FindBy (xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement burgermenu;
    
    @FindBy(xpath = "//a[@id=\"logout_sidebar_link\"]")
    private WebElement logout;
    
    
	
   //initialization
	
	public PomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	//utilization
	public void loginsceanrio() throws IOException, InterruptedException
	{
		TakesScreenshot srcshot=((TakesScreenshot)driver);
		File sourcfile=srcshot.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("D:\\Eclipse Folder\\com.DiptiRanjanDash_HybridFramework_casestudy1\\screenshots\\screenshot_1.png");
		FileUtils.copyFile(sourcfile, destinationfile);
		username.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname, 0, 1));
		Thread.sleep(2000);
		password.sendKeys(ExcelLibrary.fetchdata(excelfilepath, excelsheetname, 1, 1));
		Thread.sleep(2000);
		loginbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("6: successfully Login");
		System.out.println("7: Test excution is completed");
	}
	public void validation()
	{
	 String	url=driver.getCurrentUrl();
	 String expectedurl="https://www.saucedemo.com/";
	 if (url.equals(expectedurl))
	 {
		System.out.println("2: url is correct validated");
//		System.out.println("========================");
	  }
	 else 
	 {
		System.out.println("3: url is incorrect validated");
//		System.out.println("==========================");
	}
	 
	String title=driver.getTitle();
	String expectedtitle="Swag Labs";
	if (title.equals(expectedtitle)) 
	{
		System.out.println("4: title is correct");
//		System.out.println("================");
		
	}
	else 
	{
		System.out.println("5: title is incorrect");
//		System.out.println("==================");
	}
	}
	//public void login()
	//{
	//	loginbutton.click();
	//	try {
	//		Thread.sleep(5000);
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		//System.out.println("6: successfully Login");
//		System.out.println("==================");
	//	System.out.println("7: Test excution is completed");
	//}
	public void logout() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeAsyncScript("arguments[0].click;", burgermenu);
		//burgermenu.click();
		//Thread.sleep(2000);
		TakesScreenshot srcshot=((TakesScreenshot)driver);
		File sourcfile1=srcshot.getScreenshotAs(OutputType.FILE);
		File destinationfile1=new File("D:\\Eclipse Folder\\com.DiptiRanjanDash_HybridFramework_casestudy1\\screenshots\\screenshot_2.png");
		FileUtils.copyFile(sourcfile1, destinationfile1);
		burgermenu.click();
		Thread.sleep(3000);
		logout.click();
		Thread.sleep(3000);
	}
}