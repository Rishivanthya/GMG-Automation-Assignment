package GMG.com.website.pages;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import br.com.seleniumeasytest.jussara.support.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;

import static org.junit.Assert.assertEquals;

import java.util.List;

/**
 * @author jussaragranja
 * Class represents the page Bootstrap Date Picker from site SeleniumEasy
 */

public class Homepageverification extends PageBase {

    @FindBy(xpath = "//i[@class='glyphicon glyphicon-th']")
    private WebElement buttonSelectDate;

    @FindBy(xpath = "/html/body/div[3]/div[1]/table/tfoot/tr[1]/th")
    private WebElement todayDate;

    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/input")
    private WebElement date;
    
    @FindBy(xpath = "//*[@id=\"sg-navbar-collapse\"]/div/div/nav/div[2]/div[3]/div/ul/li[1]/a")
    private WebElement MenMenubutton;

    @FindBy(xpath = "//*[@id=\"mens\"]/div/div/div[1]/section/figcaption/div/a")
    private WebElement Shopbutton;

    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/input")
    private WebElement date1;

    @FindBy(xpath = "//*[@id=\"product-search-results\"]/div[2]/div[2]/div/div[1]/div/div/div[2]/div[1]/a")
    private WebElement clickproduct;
    
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div/div[2]/div/div[6]/div[2]/div/div/div[4]/div/button/span[1]")
    private WebElement Color;
    
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div/div[2]/div/div[2]/div/div/a/span")
    private WebElement AddtoBag;
    
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/nav/div[1]/div/div[3]/div/div[2]/a/span[1]")
    private WebElement productConfiramationOverlay;
    
    @FindBy(css = "line-item-name")
    private WebElement productNameOnCart;
    
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/nav/div[1]/div/div[3]/div/div[2]/a")
    private WebElement ClickonCart;
    
    
  
    
    public void clickMenMenubutton() throws InterruptedException {
		// TODO Auto-generated method stub
		
	
        click(MenMenubutton);
		
	}
    
    public void click(WebElement element){
        
        element.click();
    
}

	public void clickShopbutton() throws InterruptedException {
		// TODO Auto-generated method stub
		
        click(Shopbutton);
		
		
	}
	
	public void clickColor() throws InterruptedException {
		// TODO Auto-generated method stub
		
        click(Color);
		
		
	}
	
	public void clickAddtoBag() throws InterruptedException {
		// TODO Auto-generated method stub
		
        click(AddtoBag);
		
		
	}
	
	
	
	
	

    public void assertPageTitle(){
        assertEquals("SSSS Home", driver.getTitle());
    }

    
    public void Clickonproduct()
    {
    	click(clickproduct);
    	
    }
    

public void clickonCart()
{
	click(ClickonCart);
}
    
    

    public void verifyAddedProductToCartPage(String productName) {
       waitForElement(productConfiramationOverlay);
       assertEquals(productNameOnCart, productName);
    }
    
    
    public void SelectSize() throws InterruptedException
    {
    Thread.sleep(4000);
    String options = driver.findElement(By.xpath("//span[@class='select2- results']")).getText();
    System.out.println(options);

    for (int i = 0; i < options.length(); i++) {
       WebElement cityName = driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[" + (i+1) + "]"));
       try{
           if (cityName.getText().equals("Chandigarh")) {
                cityName.click();
                break;
           }
       }catch (Exception e){
           System.out.println("ABC");
       }
    }
    
    
    


    }
}
