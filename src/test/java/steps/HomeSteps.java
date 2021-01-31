package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomeSteps {
    HomePage home;

    @Step
    public void irParaHome() {
        home.open();
    }

    public void realizarBusca(String itemBuscado) {
        home.preencherCampoBusca(itemBuscado);
        home.clicarBotaoLupa();
    }
}
