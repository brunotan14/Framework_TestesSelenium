package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import run.RunCucumberTest;
import pages.CadastroPage;

public class Cadastro_steps extends RunCucumberTest {
    CadastroPage driver = new CadastroPage(); // criação de um objeto das pages para utilizar os métodos dela.
    Faker faker = new Faker();
    String user;
    String email;
    String password = faker.internet().password();

    @Dado("que eu estou no site da qazando na página de cadasto")
    public void acessQazando(){ driver.acessite(); }

    @Quando("eu preencho minhas credenciais")
    public void fillcredencials(){
        user = faker.name().fullName();
        email = faker.internet().emailAddress(); // gerar email simples
        password = faker.internet().password();

        driver.fillCredencials(user, email, password);
    }

    @Quando("eu preencho minhas credenciais com um email já existente")
     public void enteremailExist(){
        String email1 = "docontra12@gmail.com";
        driver.fillCredencials(user, email1, password);
    }

    @Quando("preencho meu nome e email invalido ou vazio")
     public void entername(){
        String name = faker.name().fullName();
        String email = faker.name().firstName() + "@";

       driver.fillCredencials(name, email, null);
    }

    @Quando("eu preencho minhas credenciais \"<nome>\" e \"<email>\"")
     public void enterNameEmail(){
        user = faker.name().fullName();
        email = faker.internet().emailAddress();

        driver.fillCredencials(user, email, null);
    }

    @E("clico em registrar")
     public void submitRegister() throws InterruptedException {
        driver.LoadingCastroPage();
        driver.ScroolDown();
        driver.submitRegister();
    }

    @Então("Eu vejo a mensagem de registrado com sucesso")
    public void CheckRegister(){
        driver.messageSucess(user);
    }

    @Então("Devo visualizar mensagem de erro")
    public void ErroMessage(){
        driver.messageError();
    }
}
