package com.app.pages;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects extends BasePage {
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]/a")
	private WebElement womenmenu;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dressesmenu;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirtmenu;
	
	public HomePageObjects(){
		PageFactory.initElements(driver, this);
	}
	
    public String womentab(){
    	return womenmenu.getText();
    }
    public String dressestab(){
    	return dressesmenu.getText();
    	
    }
    public String tshirttab(){
    	return tshirtmenu.getText();
    }
    
    
    public void clickthewomentab(){
    	
    	womenmenu.click();
    }
    
    @FindBy(xpath="//span[@class='cat-name']")
    private WebElement womentab;
    
    public String womenproducts(){
    
    return womentab.getText();
    
    }
    
    
    public void clickthedressestab(){
    	dressesmenu.click();
    }
    
    @FindBy(xpath="//span[@class='cat-name']")
    private WebElement dressestab;
     
    public String dressesproducts(){
        
        return womentab.getText();
        
        }
    
    public void clickthetshirttab(){
    	tshirtmenu.click();
    }
    
    @FindBy(xpath="//span[@class='cat-name']")
    private WebElement tshirttab;
    	
    @FindBy(xpath="//input[@id='newsletter-input']")
    private WebElement email;
    
    @FindBy(xpath="//div/button[@type='submit']")
    private WebElement emailbtn;
    
  @FindBy(xpath="//p[@class='alert alert-success']")
  private WebElement emailreg;
     
    public void emailsubscription(String user){
  	  setText(email, user);
  	  emailbtn.click();
	
  	 } 	
    public String emailregister(){
    	return emailreg.getText();
    }
    
	
	
}
