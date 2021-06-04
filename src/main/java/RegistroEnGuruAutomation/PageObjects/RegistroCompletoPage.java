package RegistroEnGuruAutomation.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistroCompletoPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'SIGN-OFF')]")
    private WebElement btnSignOff;

    public void desloguearsePage() {
        btnSignOff.click();

    }
}