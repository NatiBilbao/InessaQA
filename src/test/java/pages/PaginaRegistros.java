package pages;

import controls.TextBox;
import org.openqa.selenium.By;

public class PaginaRegistros {
    public TextBox email = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[2]/div[2]/input"));

    public TextBox password = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[3]/div[2]/input"));

    public TextBox nombres = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[4]/div[2]/input"));

    public TextBox apellidoPaterno = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[5]/div[2]/input"));

    public TextBox apellidoMaterno = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[6]/div[2]/input"));

    public TextBox fechaNacimiento = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[7]/div[2]/div/input"));

}
