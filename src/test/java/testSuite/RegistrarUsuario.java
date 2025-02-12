package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;
import session.Session;

public class RegistrarUsuario {

    PaginaInicial paginaInicial = new PaginaInicial();

    PaginaRegistros paginaRegistros = new PaginaRegistros();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://theloniousmed.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Test
    public void registrarUsuarios() throws InterruptedException {

        String fullEmail = "diegosantos98@gmail.com";
        String fullPassword = "40987Diego.";
        String fullNombres = "Diego Alejandro";
        String fullApellidoPaterno = "Santos";
        String fullApellidoMaterno = "Nava";
        String fullFechaNacimiento ="19/09/1997";
        String fullTelefono = "61143115";
        String fullTelefonoReferencia = "76259956";
        String fullNumeroDocumento = "12452751";

        paginaInicial.registroUsuario.click();
        Thread.sleep(5000);

        paginaRegistros.email.setText(fullEmail);
        paginaRegistros.password.setText(fullPassword);
        paginaRegistros.nombres.setText(fullNombres);
        paginaRegistros.apellidoPaterno.setText(fullApellidoPaterno);
        paginaRegistros.apellidoMaterno.setText(fullApellidoMaterno);
        paginaRegistros.fechaNacimiento.setText(fullFechaNacimiento);
        paginaRegistros.genero.click();
        Thread.sleep(5000);
        paginaRegistros.generoMasculino.click();
        Thread.sleep(5000);
        paginaRegistros.telefono.setText(fullTelefono);
        paginaRegistros.telefonoReferencia.setText(fullTelefonoReferencia);
        paginaRegistros.numeroDocumento.setText(fullNumeroDocumento);
        paginaRegistros.tipoDocumento.click();
        Thread.sleep(5000);
        paginaRegistros.carnetIdentidad.click();
        Thread.sleep(5000);
        paginaRegistros.guardarRegistro.click();
        Thread.sleep(5000);

        
        Thread.sleep(5000);
    }
}
