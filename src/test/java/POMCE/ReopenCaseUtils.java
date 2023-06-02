package POMCE;

public class ReopenCaseUtils {

    public static String statusColumnSort = "//div[text()='Status']";
    public static String closedCase = "//span[@class='checkbox-holder']/following::a[1]";
    public static String reOpenCaseGrid = "//span[contains(text(),' Reopened')]//parent::div//parent::div//preceding-sibling::div//span[@class='checkbox-holder']/following::a[1]";
    public static String reopenCaseOption = "//li[text()='Reopen Case']";
    public static String closedCaseGrid = "//div[contains(text(),'Closed')]//parent::div//parent::div//preceding-sibling::div//span[@class='checkbox-holder']/following::a[1]";
    public static String reopenCasePopup = "//div[@class='modal-header']/following::span[text()='Reopen Case']";
    public static String violationsOnCDP = "//span[@class='violation-label']";
    public static String reopenCaseButton = "//button[text()='Reopen Case']";
    public static String errorMessageRCP = "//h5[@id='reopen-case-heading']";
    public static String violationsOnRCP = "//div[@class='case-violation-list reopen-variant']//span[@class='violation-label']";
    public static String nonCompliantButton = "//button[text()='Non-Compliant']";
    public static String reopenedCaseActivity = "//h4[@class='case-activity__label' and text()='Case Reopened']";
    public static String dateReopenedCase = "//h4[text()='Case Reopened']/following-sibling::span";
    public static String userInfoRCP = "//h4[text()='Case Reopened']/following::label[@class='case-activity__user-info']";

}
