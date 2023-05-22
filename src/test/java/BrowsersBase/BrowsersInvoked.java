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
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--window-size=1552,832");
			//options.addArguments("screenshot");
			driver = new ChromeDriver(options);
			driver.get(DataInterface.AgencyURL);
			//driver.manage().window().maximize();
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

//		Dimension currentDimension = driver.manage().window().getSize();
//		int height = currentDimension.getHeight();
//		int width = currentDimension.getWidth();
//		System.out.println("Current height: "+ height);
//		System.out.println("Current width: "+width);
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

	@BeforeSuite
	public void RunEnvironmentSetup() {
		switch (DataInterface.RunEnvironment.toUpperCase()) {
		case "QA": {
			AgencyID = 659;
			Instance = "https://app-qa-new.comcate.com/agencies/";
			AgencyUsername = "659qa2@yopmail.com";
			AgencyPassword = "Test@123";
			AdminURL = "https://admin-qa-new.comcate.com";
			AdminUsername = "support@comcate.com";
			AdminPassword = "test@123";
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
			AgencyID = 181;
            Instance = "https://app-stage.comcate.com/agencies/";
            AgencyUsername = "MarkShane@yopmail.com";
            AgencyPassword = "Hello@1234";
            AdminURL = "https://admin-stage.comcate.com/agencies";
            AdminUsername = "support@comcate.com";
            AdminPassword = "C0de#432!";
            break;
		}
		}
	}
}
