package RegistroEnGuruAutomation.Steps;

import RegistroEnGuruAutomation.PageObjects.RegistroCompletoPage;
import net.thucydides.core.annotations.Step;

public class RegistroCompletoStep {

    RegistroCompletoPage registroCompletoPage = new RegistroCompletoPage();

    @Step
    public void desloguearse() {
        registroCompletoPage.desloguearsePage();

    }
}
