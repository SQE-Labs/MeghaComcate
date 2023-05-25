package BrowsersBase;

import CommonMethods.PropertiesUtils;
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
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--window-size=1552,832");
			driver = new ChromeDriver(options);
			driver.get(DataInterface.AgencyURL);
			Dimension currentDimension = driver.manage().window().getSize();
			int height = currentDimension.getHeight();
			int width = currentDimension.getWidth();
			System.out.println("Current height: "+ height);
			System.out.println("Current width: "+width);
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
		driver.get(DataInterface.AgencyURL);
	}


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
	public static String CCPStreetAddress2;
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
				AgencyPassword = "";

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
				
				AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyID_QAGisDirect1O"));
				Instance = PropertiesUtils.getPropertyValue("InstanceQA");
				AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsername_QaGisDirect1O");
				AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPassword_QAGisDirect1O");

				StreetAddress = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
				City = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
				Zip = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
				mailReset=PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

				CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddressQAGISDirect1O");
				CCPCity1 = PropertiesUtils.getPropertyValue("CityQAGISDirect1O");
				CCPZip1 = PropertiesUtils.getPropertyValue("ZipQAGISDirect1O");
				CCPmailReset1=PropertiesUtils.getPropertyValue("mailResetQAGISDirect1O");
			}
			else if(DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisLite)) {
				System.out.print(DataInterface.agencyConfigGisLite);
				
				AgencyID = 000;
				Instance = "";
				AgencyUsername = "";
				AgencyPassword = "";
				StreetAddress = "";
				City = "";
				Zip = "";
				mailReset="";
			}

		else {
			AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyIDQA"));
			Instance = PropertiesUtils.getPropertyValue("InstanceQA");
			AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsernameQA");
			AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPasswordQA");

			StreetAddress = PropertiesUtils.getPropertyValue("StreetAddressQAEnterPrise");
			City = PropertiesUtils.getPropertyValue("CityQAEnterPrise");
			Zip = PropertiesUtils.getPropertyValue("ZipQAEnterPrise");
			mailReset=PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");

			CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddressQAEnterPrise");
			CCPCity1 = PropertiesUtils.getPropertyValue("CityQAEnterPrise");
			CCPZip1 = PropertiesUtils.getPropertyValue("ZipQAEnterPrise");
			CCPmailReset1=PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");


			}
			AdminURL = PropertiesUtils.getPropertyValue("AdminURL");
			AdminUsername = PropertiesUtils.getPropertyValue("AdminUsername");
			AdminPassword = PropertiesUtils.getPropertyValue("AdminPassword");
			break;
		}
		
		
		
		
		case "CI": {
			AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyIDCI"));
			Instance = PropertiesUtils.getPropertyValue("InstanceCI");
			AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsernameCI");
			AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPasswordCI");
			AdminURL = PropertiesUtils.getPropertyValue("AdminURLCI");
			AdminUsername = PropertiesUtils.getPropertyValue("AdminUsernameCI");
			AdminPassword = PropertiesUtils.getPropertyValue("AdminPasswordCI");
			break;
		} 
		
		
		
		
		
		
		case "STAGE": {
			
			if(DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
                System.out.print(DataInterface.agencyConfigGisDirect2o);
				
				AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyID_StageGisDirect2O"));
				Instance = PropertiesUtils.getPropertyValue("InstanceStage");
				AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsername_StageGisDirect2O");
				AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPassword_StageGisDirect2O");

				StreetAddress = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
				City = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
				Zip = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
				mailReset=PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

				CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
				CCPCity1 = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
				CCPZip1 = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
				CCPmailReset1=PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");
				CCPStreetAddress2 = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect_1O");
			}
			else if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect1o)) {
				System.out.print(DataInterface.agencyConfigGisDirect1o); 
				
				AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyID_StageGisDirect1O"));
				Instance = PropertiesUtils.getPropertyValue("InstanceStage");
				AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsername_StageGisDirect1O");
				AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPassword_StageGisDirect1O");

				StreetAddress = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
				City = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
				Zip = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
				mailReset=PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

				CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
				CCPCity1 = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
				CCPZip1 = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
				CCPmailReset1=PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

			}
			else if(DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisLite)) {
				System.out.print(DataInterface.agencyConfigGisLite);
				
				AgencyID = 00;
				Instance = PropertiesUtils.getPropertyValue("InstanceStage");
				AgencyUsername = "";
				AgencyPassword = "";

			}
			
			
		else {
			AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyIDStage"));
            Instance = PropertiesUtils.getPropertyValue("InstanceStage");
            AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsernameStage");
            AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPasswordStage");

			StreetAddress = PropertiesUtils.getPropertyValue("StreetAddressQAEnterPrise");
			City = PropertiesUtils.getPropertyValue("CityQAEnterPrise");
			Zip = PropertiesUtils.getPropertyValue("ZipQAEnterPrise");
			mailReset=PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");

			CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddressQAEnterPrise");
			CCPCity1 = PropertiesUtils.getPropertyValue("CityQAEnterPrise");
			CCPZip1 = PropertiesUtils.getPropertyValue("ZipQAEnterPrise");
			CCPmailReset1=PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");
		}

			AdminURL = PropertiesUtils.getPropertyValue("AdminURLStage");
			AdminUsername = PropertiesUtils.getPropertyValue("AdminUsernameStage");
			AdminPassword = PropertiesUtils.getPropertyValue("AdminPasswordStage");

			break;
            
            
		}
		
		}
	}
}
