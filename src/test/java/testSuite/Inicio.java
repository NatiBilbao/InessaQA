package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaInicial;
import session.Session;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Inicio {

    PaginaInicial paginaInicial = new PaginaInicial();

    ChromeDriver chrome;

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://inessa.ong/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Test
    public void descubreLosProgramas() throws InterruptedException {

        Thread.sleep(10000);

        paginaInicial.nuestrosServicios.click();

        Thread.sleep(10000);

    }
}
