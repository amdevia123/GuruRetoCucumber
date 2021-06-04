package RegistroEnGuruAutomation.Steps;

import RegistroEnGuruAutomation.PageObjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openStep() {

        homePage.open();

    }

    @Step
    public void irARegister() {
        homePage.irARegisterPage();

    }

    @Step
    public void loguearse(String usuario, String contrasena) {
        homePage.loguearsePage(usuario, contrasena);
    }

}
