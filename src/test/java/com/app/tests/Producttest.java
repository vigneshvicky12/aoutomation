package com.app.tests;

import org.testng.annotations.Test;

import com.app.pages.Productclass;

import graphql.Assert;

public class Producttest extends WomenPageTest {

	Productclass productpage;
	public Producttest(){
		productpage = new Productclass();
	}
	
	@Test(priority=12)
	public void verifyproduct(){
		productpage.clickfirstproduct();
	}
	
	@Test(priority=13)
	public void verifytweet(){
		Assert.assertTrue(productpage.tweetbox());
	}
	
	@Test(priority=14)
	public void verifyshare(){
		Assert.assertTrue(productpage.sharebox());
	}
	
	@Test(priority=15)
	public void verifydescription(){
		//productpage.descrip();
		Assert.assertTrue(productpage.descrip());
	
	}

}
