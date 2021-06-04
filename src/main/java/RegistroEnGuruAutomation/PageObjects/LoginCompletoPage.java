package RegistroEnGuruAutomation.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginCompletoPage extends PageObject {

    @FindBy(xpath = "//h3[contains(text(),'Successfully')]")
    private WebElement bannerLoginSucces;

    public boolean confirmarMensajePage(){
        if (bannerLoginSucces.getText().equals("Login Successfully")) {
            System.out.println("Mensaje confirmado. El logueo ha sido exitoso.");
            return true;
        } else {
            System.out.println("Mensaje errado, logueo no exitoso.");
            return false;
        }

    }
}
