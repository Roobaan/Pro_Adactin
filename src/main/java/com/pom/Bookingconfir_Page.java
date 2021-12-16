package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfir_Page {

	public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement itin;

	public Bookingconfir_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItin() {
		return itin;
	}

	
}
