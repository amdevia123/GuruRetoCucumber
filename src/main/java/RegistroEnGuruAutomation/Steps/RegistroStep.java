package RegistroEnGuruAutomation.Steps;

import RegistroEnGuruAutomation.PageObjects.RegistroPage;
import net.thucydides.core.annotations.Step;

public class RegistroStep {

    RegistroPage registroPage = new RegistroPage();


    @Step
    public void contactInformation(String nombre, String apellido, String telefono, String email) {
        registroPage.contactInformationPage(nombre, apellido, telefono, email);
    }

    @Step
    public void mailingInformation(String direccion, String ciudad, String departamento, String codigoPostal) {
        registroPage.mailingInformationPage(direccion, ciudad, departamento, codigoPostal);

    }

    @Step
    public void userInformation(String usuario, String contrasena, String confContrasena){
        registroPage.userInformationPage(usuario, contrasena, confContrasena);
    }

    @Step
    public void terminarRegistro() {
        registroPage.terminarRegistroPage();

    }

}

