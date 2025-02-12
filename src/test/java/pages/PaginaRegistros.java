package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class PaginaRegistros {
    public TextBox email = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[2]/div[2]/input"));

    public TextBox password = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[3]/div[2]/input"));

    public TextBox nombres = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[4]/div[2]/input"));

    public TextBox apellidoPaterno = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[5]/div[2]/input"));

    public TextBox apellidoMaterno = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[6]/div[2]/input"));

    public TextBox fechaNacimiento = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[7]/div[2]/div/input"));

    public Button genero = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[8]/div[2]/div/span"));

    public Button generoMasculino = new Button(By.xpath("/html/body/div[3]/div/ul/li[1]"));

    public Button generoFemenino = new Button(By.xpath("/html/body/div[3]/div/ul/li[2]"));

    public TextBox telefono = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[9]/div[2]/input"));

    public TextBox telefonoReferencia = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[10]/div[2]/input"));

    public TextBox numeroDocumento = new TextBox(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[11]/div[2]/input"));

    public Button tipoDocumento = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[12]/div[2]/div/span"));

    public Button carnetIdentidad = new Button(By.xpath("/html/body/div[4]/div/ul/li[1]"));

    public Button pasaporte = new Button(By.xpath("/html/body/div[4]/div/ul/li[2]"));

    public Button documentoNacionalIdentidad = new Button(By.xpath("/html/body/div[4]/div/ul/li[3]"));

    public Button licenciaConducir = new Button(By.xpath("/html/body/div[4]/div/ul/li[4]"));

    public Button guardarRegistro = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[13]/button[1]/span/span"));

    public Button cancelarRegistro = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[13]/button[2]/span/span"));
}
