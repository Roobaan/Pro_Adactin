package com.Runner;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.base_Class.Base_Class;
import com.pom_Manager.Page_Object_Manager;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver = browserLaunch("chrome");;

	public static Page_Object_Manager pom =new Page_Object_Manager(driver);
	
	public static Logger log =Logger.getLogger(Test_Runner.class);
	
	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Session Created");
		
		url("https://adactinhotelapp.com/index.php");
		
		log.info("Browser Launched");
		
		String particularData = particularData("C:\\Users\\lenovo\\eclipse-workspace\\Maven_Project\\Data\\Book.xlsx", 1, 5);
		
		inputValues(pom.getLp().getUsername(), particularData);

		log.info("Value entered in Username");
		
		String particularData2 = particularData("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Maven_Project\\\\Data\\\\Book.xlsx", 2, 5);
		
		inputValues(pom.getLp().getPass(), particularData2);

		log.info("Value entered in Password");
		
		click(pom.getLp().getLogin());

		log.info("Login button clicked");

		select("index",pom.getSh().getLocation(), "1");

		
		
		select("index",pom.getSh().getHotel(), "2");

		select("index",pom.getSh().getRoom_type(), "4");

		select("index",pom.getSh().getRoom_nos(), "1");

		log.info("Dropdown value selected");
		
		clear(pom.getSh().getDatepick_in());
		String particularData3 = particularData("C:\\Users\\lenovo\\eclipse-workspace\\Maven_Project\\Data\\Book.xlsx", 8, 5);
		inputValues(pom.getSh().getDatepick_in(), particularData3);

		clear(pom.getSh().getDatepick_out());
		String particularData4 = particularData("C:\\Users\\lenovo\\eclipse-workspace\\Maven_Project\\Data\\Book.xlsx", 9, 5);
		inputValues(pom.getSh().getDatepick_out(), particularData4);

		select("index",pom.getSh().getAdult_room(), "2");

		select("index",pom.getSh().getChild_room(), "1");

		click(pom.getSh().getSubmit());
		waitt();

		click(pom.getSh1().getRadio());

		click(pom.getSh1().getContinu());

		String particularData5 = particularData("C:\\Users\\lenovo\\eclipse-workspace\\Maven_Project\\Data\\Book.xlsx", 15, 5);
		
		inputValues(pom.getBp().getFname(), particularData5);

		String particularData6 = particularData("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Maven_Project\\\\Data\\\\Book.xlsx", 16, 5);
		
		inputValues(pom.getBp().getLname(), particularData6);

		String particularData7 = particularData("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Maven_Project\\\\Data\\\\Book.xlsx", 17, 5);

		
		inputValues(pom.getBp().getAddress(),particularData7 );

		String particularData8 = particularData("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Maven_Project\\\\Data\\\\Book.xlsx", 18, 5);
		
		inputValues(pom.getBp().getCcnum(), particularData8);

		select("index",pom.getBp().getCctype(), "2");

		select("index",pom.getBp().getExpmonth(), "5");

		select("index",pom.getBp().getExpyear(), "12");

		inputValues(pom.getBp().getCc_cvv(), "321");

		log.info("User details entered");
		
		click(pom.getBp().getBook_now());
		waitt();

		scrollElementView(pom.getBcp().getItin());
		click(pom.getBcp().getItin());
		
		waitt();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_Project\\Screenshot\\adac.png");
		FileHandler.copy(f1, f2);
		
		log.info("Screenshot taken");
	}

}
