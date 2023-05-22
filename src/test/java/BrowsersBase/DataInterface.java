package BrowsersBase;

public interface DataInterface{

	public static String browserMain = "CHROME";
    //public static String RunEnvironment = "QA";	
    public static String RunEnvironment = "Stage";	
	//public static String RunEnvironment = "CI";	
    public static String AgencyName = "AlphaSquad";
     String agencyConfig ="GisDirect2o" ; // "GisDirect1o" ,"GisDirect2o"// ;
    
     String agencyConfigEnterprise = "Enterprise";
	 String agencyConfigGisDirect1o = "GisDirect1o";
	 String agencyConfigGisDirect2o = "GisDirect2o";
	 String agencyConfigGisLite = "GSLite";

	public void RunEnvironmentSetup();
	
	int AgencyID = BrowsersInvoked.AgencyID;
	String Instance = BrowsersInvoked.Instance;
	String AgencyUsername = BrowsersInvoked.AgencyUsername;
	String AgencyPassword = BrowsersInvoked.AgencyPassword;
	String AdminURL = BrowsersInvoked.AdminURL;
	String AdminUsername = BrowsersInvoked.AdminUsername;
	String AdminPassword = BrowsersInvoked.AdminPassword;

	public static String AgencyURL = Instance + (AgencyID) + "/login";

	public static String URLCreateCase = Instance + (AgencyID) + "/products/cases/create";
	public static String URLDashboard = Instance + (AgencyID) + "/dashboard";
	public static String URLCasesManagement = Instance + (AgencyID) + "/setup/products/case-management";
	public static String URLAssignmentRules = Instance + (AgencyID) + "/setup/agency/assignment-rules";
	public static String URLUserManagement = Instance + (AgencyID) + "/setup/agency/users-management";
	public static String URLNotices = Instance + (AgencyID) + "/setup/agency/products/notices";
	public static String URLCreateCustomerSubmission = Instance + (AgencyID) + "/products/customer-submission/create";
	public static String URLCategories = Instance + (AgencyID) + "/setup/products/categories";
	public static String URLSubmissionSettings = Instance + (AgencyID) + "/setup/products/submission-settings";
	public static String URLViolations = Instance + (AgencyID) + "/setup/products/violations";
	public static String URLReports = Instance + (AgencyID) + "/reports";

//	public static String StreetAddress = "New Street";
//	public static String City = "New Texas";
//	public static String Zip = "77440";
	
	//GIS Lite
//	public static String StreetAddress = "120 6th Street";
//	public static String City = "Texas City";
//	public static String Zip = "77590";
	
	
	public static String StreetAddress = BrowsersInvoked.StreetAddress;
	public static String City = BrowsersInvoked.City;
	public static String Zip = BrowsersInvoked.Zip;
	public static String mailReset=BrowsersInvoked.mailReset; 
	
	public static String CCPStreetAddress1 = BrowsersInvoked.CCPStreetAddress1;
	public static String CCPCity1 = BrowsersInvoked.CCPCity1;
	public static String CCPZip1 = BrowsersInvoked.CCPZip1;
	public static String CCPmailReset1=BrowsersInvoked.CCPmailReset1; 
	
	public static String searchLocationKey = "Texas City Museum"; 
	public static String searchLocationKey1O = "1851 HILLPOINTE";
	
	public static String locationMapLayerGIS12O = "/TestData/HendersonCityLimits.kmz";
	public static String locationMapLayerEnterprise = "/TestData/texas_city_KML (1).kmz";
	
	public static String locationParcelFileEnterprise = "/TestData/Texas_City.gdb.zip";
	public static String locationParcelFileGIS12O = "/TestData/HendersonCityLimits.kmz";
	
	public static String centerLongitudeEnterprise = "-94.8992156982421900000000000";
	public static String centerLatitudeEnterprise = "29.3833717078824430000000000";
	
	public static String centerLongitudeGIS12O = "-115.0253000000000000000000000";
	public static String centerLatitudeGIS120 = "36.0292000000000000000000000";
	
	
	
	
	

}
