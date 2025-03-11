package pages;

import controls.Button;
import org.openqa.selenium.By;

public class MenuOpciones {

    public Button inicio = new Button(By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/div/ul/li[1]/a"));

    public Button quienesSomos = new Button(By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/div/ul/li[2]/a"));

    public Button nuestrosProgramas = new Button(By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/div/ul/li[3]/a"));

    public Button pasismedTi = new Button(By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/div/ul/li[4]/a"));

    public Button callCenter = new Button(By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/div/ul/li[5]/a"));
}
