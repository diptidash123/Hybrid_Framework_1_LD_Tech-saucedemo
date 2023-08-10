package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends BaseTest
{
		public void drop_down(WebElement element,String text)
		{
		Select s=new Select(element);
		s.selectByVisibleText(text);
		}
		
		public void dropdown_1(WebElement element,int index)
		{
			Select s=new Select(element);
			s.selectByIndex(index);
}

}