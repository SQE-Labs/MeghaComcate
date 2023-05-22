package BrowsersBase;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.*;

public class BrowsersInvoked {
	public static WebDriver driver;
	public String browser = DataInterface.browserMain;
	public String FinalBrowser = browser.toUpperCase();

	@BeforeSuite
	public void SetProp() {
		switch (FinalBrowser) {
		case "CHROME": {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			break;
		}
		case "FIREFOX": {
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(firefoxOptions);
			break;
		}
		case "EDGE": {
			EdgeOptions edgeOptions = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(edgeOptions);
			break;
		}
		case "OPERA": {
			OperaOptions operaOptions = new OperaOptions();
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver(operaOptions);
			break;
		}
		case "IEXPLORER": {
			InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver(internetExplorerOptions);
			break;
		}
		}

		driver.manage().window().maximize();

		Dimension currentDimension = driver.manage().window().getSize();
		int height = currentDimension.getHeight();
		int width = currentDimension.getWidth();
		System.out.println("Current height: "+ height);
		System.out.println("Current width: "+width);
//		
//		// Set new size
//		Dimension newDimension = new Dimension(1024, 768);
		//Dimension newDimension = new Dimension(768, 1024);
		//driver.manage().window().setSize(newDimension);
//		
//		// Getting 
//		Dimension newSetDimension = driver.manage().window().getSize();
//		int newHeight = newSetDimension.getHeight();
//	    int newWidth = newSetDimension.getWidth();
//	    System.out.println("New height: "+ newHeight);
//		System.out.println("New width: "+newWidth);
		
		driver.get(DataInterface.AgencyURL);
	}

//	@AfterSuite
//	public void toClose() {
//		driver.quit();
//	}

	public static int AgencyID;
	public static String Instance;
	public static String AgencyUsername;
	public static String AgencyPassword;
	public static String AdminURL;
	public static String AdminUsername;
	public static String AdminPassword; 
	
	public static String StreetAddress ;
	public static String City;
	public static String Zip;
	public static String mailReset; 
	
	public static String CCPStreetAddress1 ;
	public static String CCPCity1 ;
	public static String CCPZip1;
	public static String CCPmailReset1;
	

	@BeforeSuite
	public void RunEnvironmentSetup() {
		switch (DataInterface.RunEnvironment.toUpperCase()) {
		case "QA": {
			
			if(DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
				System.out.print(DataInterface.agencyConfigGisDirect2o);
				
				AgencyID = 000;
				Instance = "";
				AgencyUsername = "";
				AgencyPassword = "";   //Hello@123
				AdminURL = "https://admin-qa-new.comcate.com";
				AdminUsername = "support@comcate.com";
				AdminPassword = "test@123";
				
				StreetAddress = "";
				City = "";
				Zip = "";
				mailReset="";  
				
				
				CCPStreetAddress1 = "" ;
				CCPCity1 = "" ;
				CCPZip1 = "";
				CCPmailReset1 = "";
			}
			else if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect1o)) {
				System.out.print(DataInterface.agencyConfigGisDirect1o); 
				
				AgencyID = 832;
				Instance = "https://app-qa-new.comcate.com/agencies/";
				AgencyUsername = "832qa1@yopmail.com";
				AgencyPassword = "Hello@123";   //Test@123
				AdminURL = "https://admin-qa-new.comcate.com";
				AdminUsername = "support@comcate.com";
				AdminPassword = "test@123";
				
				
				StreetAddress = "1851 HILLPOINTE RD";
				City = "HENDERSON";
				Zip = "89074";
				mailReset="";  
				
				
				
				CCPStreetAddress1 = "1851 HILLPOINTE RD" ;
				CCPCity1 = "HENDERSON" ;
				CCPZip1 = "89074";
				CCPmailReset1 = "";
			}
			else if(DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisLite)) {
				System.out.print(DataInterface.agencyConfigGisLite);
				
				AgencyID = 000;
				Instance = "";
				AgencyUsername = "";
				AgencyPassword = "";   //Hello@123
				AdminURL = "https://admin-qa-new.comcate.com";
				AdminUsername = "support@comcate.com";
				AdminPassword = "test@123";
				
				StreetAddress = "";
				City = "";
				Zip = "";
				mailReset="";
			}
			
			
		else {
			AgencyID = 659;
			Instance = "https://app-qa-new.comcate.com/agencies/";
			AgencyUsername = "659qa2@yopmail.com";
			AgencyPassword = "Test@123";
			AdminURL = "https://admin-qa-new.comcate.com";
			AdminUsername = "support@comcate.com";
			AdminPassword = "test@123"; 
			
			StreetAddress = "New Street";
			City = "New Texas";
			Zip = "77440";
			mailReset="";  
			
			
			
			
		}
			break;
		}
		
		
		
		
		case "CI": {
			AgencyID = 1095;
			Instance = "https://6141.comcateprime.com:4400/agencies/";
			AgencyUsername = "1095ci2@yopmail.com";
			AgencyPassword = "Hello@123";
			AdminURL = "https://6141.comcateprime.com:4401/";
			AdminUsername = "support@comcate.com";
			AdminPassword = "test@123";
			break;
		} 
		
		
		
		
		
		
		case "STAGE": {
			
			if(DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
                System.out.print(DataInterface.agencyConfigGisDirect2o);
				
				AgencyID = 226;
				Instance = "https://app-stage.comcate.com/agencies/";
				AgencyUsername = "GISDirect20@yopmail.com";
				AgencyPassword = "Hello@123";
				AdminURL = "https://admin-stage.comcate.com/agencies";
				AdminUsername = "support@comcate.com";
				AdminPassword = "C0de#432!";
				
				
				StreetAddress = "1851 HILLPOINTE RD";
				City = "HENDERSON";
				Zip = "89074";
				mailReset="";  
				
				
				
				CCPStreetAddress1 = "1851 HILLPOINTE RD" ;
				CCPCity1 = "HENDERSON" ;
				CCPZip1 = "89074";
				CCPmailReset1 = "";
			}
			else if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect1o)) {
				System.out.print(DataInterface.agencyConfigGisDirect1o); 
				
				AgencyID = 220;
				Instance = "https://app-stage.comcate.com/agencies/";
				AgencyUsername = "GISStageo1@yopmail.com";
				AgencyPassword = "Hello@123";
				AdminURL = "https://admin-stage.comcate.com/agencies";
				AdminUsername = "support@comcate.com";
				AdminPassword = "C0de#432!";
				
				
				StreetAddress = "1851 HILLPOINTE RD";
				City = "HENDERSON";
				Zip = "89074";
				mailReset="";  
				
				
				
				CCPStreetAddress1 = "1851 HILLPOINTE RD" ;
				CCPCity1 = "HENDERSON" ;
				CCPZip1 = "89074";
				CCPmailReset1 = "";
			}
			else if(DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisLite)) {
				System.out.print(DataInterface.agencyConfigGisLite);
				
				AgencyID = 00;
				Instance = "https://app-stage.comcate.com/agencies/";
				AgencyUsername = "";
				AgencyPassword = "";
				AdminURL = "https://admin-stage.comcate.com/agencies";
				AdminUsername = "support@comcate.com";
				AdminPassword = "C0de#432!";
				
				StreetAddress = "120 6th Street";
				City = "Texas City";
				Zip = "77590";
				mailReset=""; 
			}
			
			
		else {
			AgencyID = 181;
            Instance = "https://app-stage.comcate.com/agencies/";
            AgencyUsername = "MarkShane@yopmail.com";
            AgencyPassword = "Hello@1234";
            AdminURL = "https://admin-stage.comcate.com/agencies";
            AdminUsername = "support@comcate.com";
            AdminPassword = "C0de#432!";
            
            StreetAddress = "New Street";
			City = "New Texas";
			Zip = "77440";
			mailReset="";  
			
			CCPStreetAddress1 = "New Street" ;
			CCPCity1 = "New Texas" ;
			CCPZip1 = "77440";
			CCPmailReset1 = "";
		} 
            break;
            
            
		}
		
		}
	}
}
