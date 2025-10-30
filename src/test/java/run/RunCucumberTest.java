package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        glue = ("steps"),
        tags = "@login"
)
public class RunCucumberTest extends RunBase{

    @AfterClass //depois de cada classe
    public static void finalizar(){
           driver.quit();
    }
}
