package RegistroEnGuruAutomation.Steps;

import RegistroEnGuruAutomation.PageObjects.LoginCompletoPage;
import net.thucydides.core.annotations.Step;

public class LoginCompletoStep {

    LoginCompletoPage loginCompletoPage = new LoginCompletoPage();

    @Step
    public boolean confirmarMensaje() throws InterruptedException {
        return loginCompletoPage.confirmarMensajePage();
    }


}