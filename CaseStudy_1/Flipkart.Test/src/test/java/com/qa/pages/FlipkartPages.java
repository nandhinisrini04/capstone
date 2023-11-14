package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {
	WebDriver driver;
	@FindBy(xpath="//span[contains(text(),'✕')]")
	WebElement cross;
	public WebElement getCross() {
		return cross;
	}

	@FindBy(xpath="//img[@title='Flipkart']")
	WebElement logo;
	public WebElement getLogo() {
		return logo;
	}
	@FindBy(name="q")
	WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	
	
	@FindAll(@FindBy(xpath="//div[@class='_4rR01T']"))
	List<WebElement> searchitems;
	public List<WebElement> getSearchItems() {
		return searchitems;
	}
	
	

	
	public FlipkartPages(WebDriver rDriver) {
		this.driver= rDriver;
		PageFactory.initElements(rDriver, this);
	}
}

