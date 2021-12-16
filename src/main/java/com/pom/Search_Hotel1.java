package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel1 {
	
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement continu;
	

	public Search_Hotel1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinu() {
		return continu;
	}
	
}
