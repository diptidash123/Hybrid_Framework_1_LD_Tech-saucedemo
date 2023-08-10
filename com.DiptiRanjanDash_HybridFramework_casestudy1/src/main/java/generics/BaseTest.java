package generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.PomClass;

public class BaseTest implements Autoconstant
{
	   public WebDriver driver;//globally web-driver calling
	   
       @BeforeClass
       public void openbrowser()
       {
    	   System.setProperty(Chrome_key, Chrome_vale);
    	   driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	   driver.navigate().to(Testurl);
    	      	   
       }
       
//       @BeforeMethod
//       public void start() throws IOException, InterruptedException
//       {
//    	   PomClass p=PageFactory.initElements(driver, PomClass.class);
//    	   p.loginsceanrio();
//    	   System.out.println("1: The execution is started");
//	   }
//       
//       @AfterMethod
//       public void end() throws InterruptedException
//       {
//    	   PomClass p1=PageFactory.initElements(driver, PomClass.class);
//    	   p1.logout();
//       }
//       
       
       @AfterClass
       public void close()
       {
    	   driver.close();
       }

}