package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

import java.time.Duration;

public class CadastroPage extends Utils {
    LoginPage loginPage = new LoginPage();

    private By inputname = By.id("user");
    private By inputEmail = By.id("email");
    private By inputPassword = By.id("password");
    private By submit = By.id("btnRegister");

    public void acessite(){
        loginPage.enterQazando();
    }

    public void fillCredencials(String name, String email, String password){

    }

    public void ScroolDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver; // o selenium permite rodar códigos Js direto no navegador, e aqui trasnformamos o driver em um executor Js para mandar comandos JS
        jse.executeScript("window.scrollTo(0,10000)"); // 0 é o eixo horizontal, significa que não irá mover na horizontal e 10000 é o eixo  vertical, faz a página rolar para baixo, garantindo que o campo esteja visível
        Thread.sleep(2000);
    }


    public void submitRegister(){

    }

    public void messageSucess(String user){

    }

    public void messageError(){

    }
}

//primeiro passo a se fazer ao iniciar o POM
// Page Objects Model, é criar o construtor que é o cara que vai receber o driver
