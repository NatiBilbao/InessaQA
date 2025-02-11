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

        paginaInicial.registroUsuario.click();

        //Assertions.assertTrue(paginaInicial.registroUsuario.isControlDislayed(), "El botón de registro no está visible");

        Thread.sleep(1000);

    }
}
