package Test;

import java.io.IOException;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.PomClass;

public class TestClass extends BaseTest {

	@Test
	public void execution() throws IOException, InterruptedException
	{
		PomClass p=new PomClass(driver);
		p.loginsceanrio();
		p.validation();
		p.logout();
	}
	
	@Factory
	public void meqan()
	{
		System.out.println("Hello this is a factory element");
	}

}
