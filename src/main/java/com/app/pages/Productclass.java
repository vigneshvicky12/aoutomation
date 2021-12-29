package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productclass extends BasePage {

	//@FindBy(xpath="//div/a[@title='Faded Short Sleeve T-shirts']/img")
	@FindBy(xpath="//h5/a[@title='Faded Short Sleeve T-shirts']")
	   private WebElement productfirst;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
      private WebElement tweet;	
	
	@FindBy(xpath="//button[@class='btn btn-default btn-facebook']")
    private WebElement share;
	
	@FindBy(xpath="//div[@id='short_description_content']/p")
    private WebElement description;
	
	
	public Productclass(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickfirstproduct(){
		productfirst.click();
		
	}
		   
		
	public boolean tweetbox(){
		return tweet.isDisplayed();
	}
	
	public boolean sharebox(){
		return share.isDisplayed();
	}
	
	
	public boolean descrip(){
//System.out.println(description.getText());
	    return description.isDisplayed();
	    
	}
	
}
