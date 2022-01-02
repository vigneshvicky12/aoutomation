package com.app.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.WomenPageObjects;



public class WomenPageTest extends HomePageTest {

	WomenPageObjects womenpage;
	public WomenPageTest(){
		womenpage = new WomenPageObjects();
	}
	
	@Test(priority=7)
	public void clickwomen(){
		homepage.clickthewomentab();
	}
	
   @Test(priority=8)
   public void verifysmallsize(){
	   Assert.assertTrue(womenpage.smallsize());
   }
   @Test(priority=9)
   public void verifymediumsize(){
	   Assert.assertTrue(womenpage.mediumsize());
   }
   @Test(priority=10)
   public void verifylargesize(){
	   Assert.assertTrue(womenpage.largesize());
   }
  
    /*@Test
	public void verifynoofyproducts() {
	   
		womenpage.allproducts();
		
		//System.out.println(womenpage.allproducts());
    }*/
   
   @Test
   public void verifynoofproductsshowsontop(){
	   homepage.clickthewomentab();
	   Assert.assertSame(womenpage.allproducts(), womenpage.productshowing());
   }
   
   @Test(priority=11)
   public void verifyscroll(){
	   womenpage.scrolldown();
	   womenpage.thefirstproduct();
	  // Assert.assertTrue(womenpage.addcart().contains("Product successfully added to your shopping cart"));
   //System.out.println(womenpage.addcart());
   womenpage.continuebtn();
   }
   
  
   
}