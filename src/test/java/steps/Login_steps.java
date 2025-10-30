package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;
import run.RunCucumberTest;

public class Login_steps extends RunCucumberTest {
      LoginPage driver = new LoginPage(); //funciona como uma importação do arquivo da Page, crio um objeto para poder utilizar os métodos da page
      Faker faker = new Faker(); // importa a biblioteca faker para gerar dados randomicos toda vez que o teste for rodar
      @Dado("que eu estou no site da qazando")
       public void acessQazando(){ driver.enterQazando(); }

      @E("acesso a área de login")
        public void loginacess(){ driver.LoginAcess();}

      @Quando("eu preencho minhas credenciais {string} {string}")
        public void enterInformations(String user, String senha){
          driver.enterinformations(user, senha);
      }

      @E("clico em Login")
      public void submittlogin(){
          driver.loginsubmit();
      }

      @Então("vejo mensagem de login realizado com sucesso")
        public void SucessLogin(){
           driver.LoginSucessCheck();
      }

      @Então("vejo mensagem {string} de error")
      public void checkError(String message){
            driver.LoginErrorCheck(message);
      }


}
