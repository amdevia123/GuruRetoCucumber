package RegistroEnGuruAutomation.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")

public class HomePage extends PageObject {


    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
    private WebElement btnRegistrar;

    @FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
    private WebElement campoUsuario;

    @FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
    private WebElement campoContrasena;

    @FindBy(xpath = "//tbody/tr[4]/td[2]/div[1]/input[1]")
    private WebElement btnSubmit;


    public void irARegisterPage() {
        btnRegistrar.click();

    }

    public void loguearsePage(String usuario, String contrasena) {
        campoUsuario.sendKeys(usuario);
        campoContrasena.sendKeys(contrasena);
        btnSubmit.click();

    }
}
