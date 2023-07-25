package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);


    //Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
    //  Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
    //  enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
    //  clickOnFindJobsButton().
    @CacheLookup
    @FindBy(xpath = "//input[@id='header-search-keywords']")
    WebElement JobTitle;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;
    @CacheLookup
    @FindBy(xpath ="//select[@id='distance']" )
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;
    @CacheLookup
    @FindBy(xpath ="//button[@id='toggle-hp-search']" )
    WebElement moreSearchOption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
 @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
 @CacheLookup
 @FindBy(xpath = "//input[@id='hp-search-btn']")
 WebElement findJob;
    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;

 public void cookieHandle(){
     driver.switchTo().frame(acceptIFrame);
     clickOnElement(acceptCookies);

 }
 public  void enterJobTitle(String jobTitle){
     log.info("Sending job Title texton JobTitle field..");
     sendTextToElement(JobTitle,jobTitle);
 }
 public  void enterLocation(String location){
     sendTextToElement(Location,location);

 }public void selectDistance(String distance){
     selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public  void  clickOnMoreSearchOptionLink(){
clickOnElement(moreSearchOption);
    }
    public void enterMinSalary(String minSalary){
sendTextToElement(salaryMin,minSalary);
    }
        public void enterMaxSalary(String maxSalary){
     sendTextToElement(salaryMax,maxSalary);
        }
    //selectJobType(String jobType)
    public void  selectSalaryType(String sType){
     selectByValueFromDropDown(salaryTypeDropDown,sType);

    }
    public  void  selectJobType(String jobType){
     selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
     clickOnElement(findJob);
    }
}
