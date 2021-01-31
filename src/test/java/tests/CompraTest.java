package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomeSteps;

@RunWith(SerenityRunner.class)
public class CompraTest {

    @Managed
    WebDriver driver;

    @Steps
    private HomeSteps homeSteps;

    @Test
    public void realizarCompraDeCamiseta(){
        homeSteps.irParaHome();
        homeSteps.realizarBusca("T-Shirt");
    }
}
