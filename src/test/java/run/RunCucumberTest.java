package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/reports/json/report.json", "html:target/reports/index.html"},
        features = "src/test/resources/features",
        glue = ("steps"),
        tags = ""
)
public class RunCucumberTest extends RunBase{

    @AfterClass
    public static void finalizar(){
           driver.quit();
    }
}
