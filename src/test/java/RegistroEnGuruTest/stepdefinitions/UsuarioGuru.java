package RegistroEnGuruTest.stepdefinitions;

import RegistroEnGuruAutomation.Steps.HomeStep;
import RegistroEnGuruAutomation.Steps.LoginCompletoStep;
import RegistroEnGuruAutomation.Steps.RegistroCompletoStep;
import RegistroEnGuruAutomation.Steps.RegistroStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class UsuarioGuru {

    @Steps
    RegistroStep registroStep;

    @Steps
    HomeStep homeStep;

    @Steps
    RegistroCompletoStep registroCompletoStep;

    @Steps
    LoginCompletoStep loginCompletoStep;

    @Given("^que el usuario entra a Guru$")
    public void ingresar_a_Guru() {

        //homeStep.setDefaultBaseUrl("http://demo.guru99.com/test/newtours/index.php");
        homeStep.openStep();
    }


    @When("^se registra (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void registrarse_en_Guru(String nombre, String apellido, String telefono, String email,
                                    String direccion, String ciudad, String departamento, String codigoPostal,
                                    String usuario, String contrasena, String confContrasena){

        homeStep.irARegister();
        registroStep.contactInformation(nombre,apellido,telefono,email);
        registroStep.mailingInformation(direccion,ciudad,departamento,codigoPostal);
        registroStep.userInformation(usuario,contrasena,confContrasena);
        registroStep.terminarRegistro();
    }

    @And("^se loguea (.*), (.*)$")
    public void logearse_en_Guru(String usuario, String contrasena) {
        registroCompletoStep.desloguearse();
        homeStep.loguearse(usuario, contrasena);
    }

    @Then("^el usuario puede validar que el logueo y por tanto el registro, fueron exitosos$")
    public void verificar_logueo_en_Guru() throws InterruptedException {
        Assert.assertTrue(loginCompletoStep.confirmarMensaje());
    }
}
