package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    // Locators - resultText

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Permanent Tester jobs in London']")
    WebElement resultText;
    public void  verifyTheResults(String result){
        String actual =getTextFromElement(resultText);
        Assert.assertEquals(actual,result);
    }
}
