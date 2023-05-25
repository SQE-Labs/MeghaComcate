package POMCE;

public class CaseAssignmentUtils {

	public static String editAssignmentIcon = "//div[text()='Case Created']//following::button[1]";
	public static String editAssignmentPopup = "//div[@class='full-page-modal__header']/h1";
	public static String nameField = "//label[@title='Name']/following::input[@name='label']";
	public static String descriptionField = "//input[@name='description']";
	public static String actionDropdown = "//div[@class='Select-value']";
	public static String optionActionDropdown = "//*[text()='Submission Received']";
	public static String saveButton = "//button[text()='Save']";
	public static String crossIconRuleSet = "//div[@class='sortable-table__body__td']/button[2]";
	public static String validationNoRule = "//div[@class='modal-base__error modal-base__error--show']";
	public static String addRuleButton = "//button[text()='Add Rule']";
	public static String createRule = "//h1[text()='Create Rule']";
	public static String criteriaFields = "//label[@title='Attribute']/following::div[@class='Select-placeholder'][1]";
	public static String zipOption = "//*[text()='Zip']";
	public static String equalsOption = "//*[text()='Equals']";
	public static String addCriteriaLink = "//a[text()='Add Criteria']";
	public static String valueField = "//input[@name='value']";
	public static String blockOption = "//*[text()='Block']";
	public static String equalsOption2 = "(//*[text()='Equals'])[2]";
	public static String valueField2 = "(//input[@name='value'])[2]";
	public static String caseAssigneeField = "//label[@for='caseAssignee']/following::label";
	public static String inspectionAssigneeField = "//label[@for='inspectionAssignee']/following::label[text()='Select Option']";
	public static String userOptionCA = "//label[@for='caseAssignee']/following::ul/li[1]";
	public static String userOptionIA = "//label[@for='inspectionAssignee']/following::ul/li[1]";
	public static String createRulebutton = "//button[text()='Create Rule']";
	public static String addedRule = "//div[@class='sortable-table__body__tr']";
	public static String editRuleIcon = "//div[@class='sortable-table__body__td']/button[1]";
	public static String crossCriteriaIcon = "(//div[@class='close-icon'])[2]";
	public static String userOptionCA2 = "//label[@for='caseAssignee']/following::ul/li[2]";
	public static String saveButtonEditRule = "//h1[text()='Edit Rule']/following::button[text()='Save']";
	public static String assignCaseToColumn = "//div[@class='sortable-table__body__td'][2]";
	public static String deleteRuleIcon = "//div[@class='sortable-table__body__td']/button[2]";
	public static String inactiveToggle = "//button[text()='Inactive']";
	public static String activeToggle = "//button[text()='Active']";

}
