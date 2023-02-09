package AmazonTestPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResultPage {
	
	@FindBy(xpath="(//span[.='See more'])[1]") private WebElement seemore;
	@FindBy(xpath = "//div[@id='brandsRefinements']/ul/li//div") private List<WebElement> brands;
	
	
	public ProductResultPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}	
	public void clickSeeMore() {
		seemore.click();
	}
	public void selectbrands() {
		for(WebElement b1:brands) {
			b1.click();
		}
	}
}
