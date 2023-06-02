package POMCE;

public class DashboardUtils {

	public static String dashboardDropdownArrow = "//span[@class='dropdown__arrow']";
	public static String allStaffOption = "//li[text()='All Staff']";
	public static String selectedOptionText = "//div[@class='dropdown__selector__selected']/label";
	public static String meOption = "//li[text()='Me']";
	public static String openCasesAssignedToMe = "//label[text()='Open cases assigned to me']";
	public static String dashboardPage = "//a[text()='Dashboard']";
	public static String openCasesForMyAgency = "//label[text()='Open cases for my agency']";
	public static String overdueInspections = "//label[text()='Overdue Inspections']";
	public static String overdueInspection = "//label[text()='Overdue Inspection']";
	public static String inspectionsDueToday = "//label[contains(text(),'Due Today')]";
	public static String totalInspections = "//label[text()='Total Inspections']";
	public static String totalCasesForMyAgency = "//label[text()='Total cases for my agency']";
	public static String showMoreLink = "//label[text()='Total Inspections']/following::a";
	public static String totalCasesPopup = "//div[@class='modal-header']/label[@class='widget__text']";
	public static String closePopupButton = "//div[@class='modal-footer']//button";
	public static String countOpenCasesFMA = "//label[text()='Open cases for my agency']/preceding-sibling::span";
	public static String noticesToPrintLink = "//label[text()='notices in your print queue']";
	public static String noticesTotal = "(//span[@class='widget__total'])[7]";
	public static String noticeToPrintLink = "//label[text()='notice in your print queue']";
	public static String printQueuePopup = "//div[@class='modal-header' and text()='Print Queue']";
	public static String closePrintQueuePopoup = "//div[@class='modal-footer']//button[1]";
	public static String inspectionsDueTodayCount = "//label[contains(text(),'Due Today')]/preceding-sibling::span";
    public static String inspectionDueToday = "//label[text()='Inspection Due Today']";
}
