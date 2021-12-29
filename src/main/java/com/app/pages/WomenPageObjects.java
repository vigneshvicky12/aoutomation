package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WomenPageObjects extends BasePage {
	
		
	@FindBy(xpath="//ul[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
    private WebElement Ssize;
	@FindBy(xpath="//ul[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
    private WebElement Msize;
	@FindBy(xpath="//ul[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
    private WebElement Lsize;
	@FindBy(xpath="//div[@id='center_column']/h1/span[2]")
    private WebElement totalproductshowing;
	 @FindBys({@FindBy(xpath="//div[@id='center_column']/ul/li")})
	   private List <WebElement> productlist;

	public WomenPageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	
	
    public boolean smallsize(){
    	return Ssize.isDisplayed();
    }
    
    public boolean mediumsize(){
    	return Msize.isDisplayed();
    }
    public boolean largesize(){
    	return Lsize.isDisplayed();
    }

 
   
         public int allproducts(){
    	  return productlist.size();
         }
         public int productshowing(){
        	return Integer.parseInt(totalproductshowing.getText().split(" ")[2]);
        	
         }
    
   /* @FindBy(xpath="//span[text()='There are 7 products.']")
    private WebElement productresult;
    
    public void noofproductsshowsontop(){
    String a = "productresult";
    String arr[]= a.split(" ");
    String productno = arr[2];
	return productno;
    }*/
     
   
    @FindBy(xpath="//div[@id='center_column']/ul/li[1]") 
   private WebElement firstproduct;
    @FindBy(xpath="//li[1]/div/div[2]/div[2]/a[1]/span[text()='Add to cart']")
    private WebElement add;
    @FindBy(xpath="//div[@id='center_column']/ul/li[1]/div/div[2]/h5/a")
    private WebElement scroll;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void scrolldown(){
    	js.executeScript("arguments[0].scrollIntoView();", scroll);
    	
    }
   
      
   public void thefirstproduct(){
	   
	   Actions mouse = new Actions(driver);
	   mouse.moveToElement(firstproduct).build().perform();
	 // return firstproduct;
	   add.click();
	   
	   
   }
   
   @FindBy(xpath="//div[@id='layer_cart']/div[1]/div[1]/h2")
   private WebElement cart;
   @FindBy(xpath="//span[@class='continue btn btn-default button exclusive-medium']")
   private WebElement continuebox;
   
   /*public String addcart(){
	   return cart.getText();
   }*/
   
   public void continuebtn(){
	   continuebox.click();
   }
   
   
   }

   
   
    



