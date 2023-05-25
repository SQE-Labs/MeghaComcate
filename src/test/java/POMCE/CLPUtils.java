package POMCE;

public class CLPUtils {

    public static String cLP = "//a[text()='Cases']";
    public static String cases = "//label[text()='Cases: ']";
    public static String violationTypeFilter = "//label[text()='Violation Type']";
    
    public static String violationTypeCol = "//div[contains(text(),'Violation Type')]";
    public static String locationCol = "//div[contains(text(),'Location')]";
    public static String apnCol = "//div[contains(text(),'APN')]";
    
    public static String assigneeCol = "//div[text()='Assignee']";
    public static String statusCol = "//div[text()='Status']";
    public static String createdCol = "//div[text()='Created']";
    public static String closedCol = "//div[text()='Closed']";
    public static String inspectionAssigneeCol = "//div[text()='Inspection Assignee']";
    public static String nextInsepectionAssingeeCol = "//div[text()='Next Scheduled Inspection']";
    public static String deleteCol = "//div[text()='Delete']";
    
    
    
    
    
    public static String caseStatusFilter = "//label[text()='Case Status']";
    public static String createdFilter = "//label[text()='Created']";
    public static String inspectionAssigneeFilter = "//div[text()='Inspection Assignee']";
    public static String nextScheduledInspectionFilter = "//div[text()='Next Scheduled Inspection']";
    public static String paginationField = "//div[@class='table__pagination-page-nos']//input";
    public static String nextPagination = "//div[@class='table__pagination-nav-btns']/button[2]";
    public static String caseID = "//span[@class='checkbox-holder']/following::a[1]";
    public static String caseNumberHeader = "//div[text()='Case Number']";
    public static String deleteLink = "//a[text()='Delete']";
    public static String deleteCasePopup = "//div[@class='modal-header' and text()='Delete Case']";
    public static String deleteTextField = "//input[@name='deleteText']";
    public static String deleteCaseButton = "//button[text()='Delete Case']";
    public static String validationMsgDeleteCase = "//div[@class='modal-base__error modal-base__error--show']";
    public static String casesCount = "//div[@class='cs-listing__section__header']//following-sibling::span";
    public static String doNotDeleteButton = "//button[text()='Do Not Delete']";
    public static String paginationCount = "//span[@class='table__pagination-of-text']";
    public static String violationTypePF = "//label[text()='Violation Type']";
    public static String caseStatusPF = "//label[text()='Case Status']";
    public static String createPF = "//label[text()='Created']";
    public static String inspectionAssigneePF = "//div[text()='Inspection Assignee']";
    public static String nextScheduledPF = "//label[text()='Next Scheduled Inspection']";
    public static String caseStatusDropDown = "//label[text()='Case Status']/following::span[1]";
    public static String violationTypesPF = "//label[text()='Violation Type']/following::span[1]";
    public static String closedOption = "//span[text()='Closed']";
    public static String animalviolationOption = "//label[text()='Animal'][@for='Violation Type-0']";
    public static String animalViolationOptionChk = "//input[@type='checkbox'][@name='Animal']";
    public static String closedStatusCLP = "//div[@class='rt-td']/div[text()='Closed']";
    public static String clearAllFiltersLink = "//a[text()='Clear all filters']";
    public static String filterSlider = "//i[@class='fa fa-2 fa-sliders']";
    public static String violationsFilter = "//label[@for='checkbox-violations']";
    public static String outstandingBalanceFilter = "//label[@for='checkbox-outstandingBalance']";
    public static String violationsFilterCLP = "//label[text()='Violations']";
    public static String outstandingBalanceFilterCLP = "//label[text()='Outstanding Balance']";
    public static String filterSliderClose = "//button[@class='drawer__close']";
    public static String columnControlWidget = "//i[@class='fa fa-2 fa-cog']";
    public static String columnOutstandingBalance = "//label[@for='checkbox-column-outstandingBalance' and text()='Outstanding Balance']";
    public static String closeColumnControl = "//button[@class='drawer__close']";
    public static String dropdownOutstandingBalance = "//div[@id='outstandingBalance']//div/label[text()='Any']";
    public static String option2OB = "//label[@for='Outstanding Balance-2']";
    public static String applyButtonOB = "//label[@for='Outstanding Balance-2']//following::button[text()='Apply']";
    public static String crossSecondaryFilter = "//div[@class='filter-options violations']/following-sibling::button";
    public static String countSecondaryFilters = "//div[@class='filters-secondary__chip']";
    public static String cLPSearchField = "//input[@name='searchQuery']";
    public static String noCasesInfoMsg = "//div[@class='rt-noData']";
    public static String columnOutstandingBalanceCLP = "//div[text()='Outstanding Balance']";
    public static String restoreDefaultsLink = "//a[text()='Restore Defaults']";
    public static String saveAsButton = "//button[text()='Save As']";
    public static String saveAsPopup = "//div[text()='Save As']";
    public static String saveButton = "//button[text()='Save']";
    public static String errorMsgSaveAsPopup = "//span[text()='The Filter Name is required.']";
    public static String filterNameField = "//input[@placeholder='Enter Text']";
    public static String countFiltersSaveAs = "(//ul[@class='dropdown__options--single'])[1]/li";
    public static String crossIconFilters = "//button[@class='delete-btn  btn btn-primary']";
    public static String filtersDropdown = "(//div[@class='dropdown__selector__selected']/label)[1]";
    public static String createCaseButtonCLP = "//button[text()='Create Case']";
    public static String downloadButton = "//button[text()='Download']";
    public static String cSVOption = "//li[text()='CSV']";
    public static String openedCaseId = "//h2[@class='case-details__case-number']";
    public static String printButtonCLP = "//button[text()='Print']";
    public static String closeCaseIcon = "//div[@class='case-details__close-icon']/img";
    public static String cancelButtonCCP = "//button[text()='Cancel']";
    public static String agencyUserName = "//div[@class='app-header__user-name']/label";
    public static String mineButtonCLP = "//button[text()='Mine']";
    public static String assigneeColumn = "//span[@class='checkbox-holder']/following::span[2]";
}
