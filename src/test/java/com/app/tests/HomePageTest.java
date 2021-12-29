package com.app.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;



public class HomePageTest {
     int random = new Random().nextInt(5000);
	HomePageObjects homepage;
	public HomePageTest(){
		homepage= new HomePageObjects();
	}
	
	
	@Test (priority=1)
	public void verifywomentab(){
		
		Assert.assertTrue(homepage.womentab().contains("WOMEN"));
		
	}
	
	@Test(priority=2)
	public void verifydressestab(){
		Assert.assertTrue(homepage.dressestab().contains("DRESSES"));
	}
	@Test(priority=3)
	public void verifytsirttab(){
		Assert.assertTrue(homepage.tshirttab().contains("T-SHIRT"));
	}
	
	@Test(priority=4)
	public void verifyclickthewomentab(){
		homepage.clickthewomentab();
		Assert.assertTrue(homepage.womenproducts().equals("WOMEN "));
	
	}
	
	@Test(priority=5)
	public void verifyclickthedressestab(){
		homepage.clickthedressestab();
		Assert.assertTrue(homepage.dressesproducts().equals("DRESSES "));
	
	}
	@Test(priority=6)
	public void verifyclickthetshirttab(){
		homepage.clickthetshirttab();
		Assert.assertTrue(homepage.tshirttab().equals("T-SHIRTS"));
	}
	
	@Test
	   public void verifyemailsubscription(){
		   homepage.emailsubscription("vignesh"+ random +"@gmail.com");
		   //System.out.println(homepage.emailregister().concat("This"));
		   Assert.assertTrue(homepage.emailregister().contains("successfully"));
		   //System.out.println(homepage.emailregister());
	   }
	
}