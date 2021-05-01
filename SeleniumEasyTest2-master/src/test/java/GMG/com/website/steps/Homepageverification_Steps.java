package GMG.com.website.steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import GMG.com.website.pages.Homepageverification;
import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.support.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Date Pickers
 */

public class Homepageverification_Steps {

    PageHome homeSeleniumEasy = new PageHome();
    Homepageverification pageverification = new Homepageverification();
    WebElement driver2;

    @Given("Click on URL and verify whether page is loaded successfully")
    public void the_page_date_pickers_is_visible() throws InterruptedException {
    	
    	//driver2.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")).click();
       // homeSeleniumEasy.acessarBootstrapDatePicker();
        //pageBootstrap.assertPageTitle();
    }

    @When("click on Men Menu and it should land on Mens page")
    public void MenMenuvalidation() throws InterruptedException {
       // homeSeleniumEasy.acessarBootstrapDatePicker();
    	//pageBootstrapDatePicker.assertPageTitle();
    	Thread.sleep(1000);
    	
    	pageverification.clickMenMenubutton();
    }

	

    @And("click SHOP ALL button")
    public void ClickShopAll() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	pageverification.clickShopbutton();
    }
    
    @Then("Click on any product from PLP")
    public void ClickProduct() throws InterruptedException {
    	
    	Thread.sleep(1000);
        pageverification.Clickonproduct();
        
    	
    }

    @Then("Click on Colour")
    public void ClickSize() throws InterruptedException {
    	pageverification.clickColor();
    }

    @And("Add the product to Bag")
    public void AddtoBag() throws InterruptedException {
    	pageverification.clickAddtoBag();
    	
    	Thread.sleep(2000);
    	pageverification.clickonCart();
    	Thread.sleep(2000);
    }

    @Then("Validate the \"(.*)\" is added to the Cart")
    public void ValidateProduct(String product) throws InterruptedException {
    	
    	Thread.sleep(2000);
    	pageverification.verifyAddedProductToCartPage(product);
    }
    
    
    @And("Select the Size")
 public void SelectSize(String Product) throws InterruptedException {
    	
    	Thread.sleep(2000);
    	//pageverification.verifyAddedProductToCartPage(Product);
    }
    
    
  
   
  
}

	  
