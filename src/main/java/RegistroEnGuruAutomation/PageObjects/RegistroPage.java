package RegistroEnGuruAutomation.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistroPage extends PageObject {

    @FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
    private WebElement nombreX;

    @FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
    private WebElement apellidoX;

    @FindBy(xpath = "//tbody/tr[4]/td[2]/input[1]")
    private WebElement telefonoX;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement emailX;

    @FindBy(xpath = "//tbody/tr[7]/td[2]/input[1]")
    private WebElement direccionX;

    @FindBy(xpath = "//tbody/tr[8]/td[2]/input[1]")
    private WebElement ciudadX;

    @FindBy(xpath = "//tbody/tr[9]/td[2]/input[1]")
    private WebElement departamentoX;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement codigoPostalX;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement usuarioX;

    @FindBy(xpath = "//tbody/tr[14]/td[2]/input[1]")
    private WebElement contrasenaX;

    @FindBy(xpath = "//tbody/tr[15]/td[2]/input[1]")
    private WebElement confContrasenaX;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement btnTerminarRegistro;


    public void contactInformationPage(String nombre, String apellido, String telefono, String email) {
        nombreX.sendKeys(nombre);
        apellidoX.sendKeys(apellido);
        telefonoX.sendKeys(telefono);
        emailX.sendKeys(email);

    }

    public void mailingInformationPage(String direccion, String ciudad, String departamento, String codigoPostal) {
        direccionX.sendKeys(direccion);
        ciudadX.sendKeys(ciudad);
        departamentoX.sendKeys(departamento);
        codigoPostalX.sendKeys(codigoPostal);
    }

    public void userInformationPage(String usuario, String contrasena, String confContrasena){
        usuarioX.sendKeys(usuario);
        contrasenaX.sendKeys(contrasena);
        confContrasenaX.sendKeys(confContrasena);
    }

    public void terminarRegistroPage() {
        btnTerminarRegistro.click();

    }

}
