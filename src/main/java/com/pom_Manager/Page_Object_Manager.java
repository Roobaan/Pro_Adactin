package com.pom_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.Booking_Page;
import com.pom.Bookingconfir_Page;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Search_Hotel1;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private Login_Page lp;
	
	private Search_Hotel sh;
	
	private Search_Hotel1 sh1;
	
	private Booking_Page bp;
	
	private Bookingconfir_Page bcp;
	
	public Page_Object_Manager(WebDriver driver2) {

		driver=driver2;
	}

	public Login_Page getLp() {
		
		if(lp==null)
			lp=new Login_Page(driver);
		
		return lp;
	}

	public Search_Hotel getSh() {
		
		if(sh==null)
			sh=new Search_Hotel(driver);
		
		return sh;
	}

	public Search_Hotel1 getSh1() {
		
		if(sh1==null)
			sh1=new Search_Hotel1(driver);
		
		return sh1;
	}

	public Booking_Page getBp() {
		
		if(bp==null)
			bp=new Booking_Page(driver);
		
		return bp;
	}

	public Bookingconfir_Page getBcp() {
		
		if(bcp==null)
			bcp=new Bookingconfir_Page(driver);
		return bcp;
	}
}
