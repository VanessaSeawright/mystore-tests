package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://bugbox.com.br/presta/index.php")
public class HomePage extends PageObject {

    //OBJETOS

    @FindBy(id="search_query_top")
    private static WebElementFacade campoBusca;

    @FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")
    private static WebElementFacade botaoLupa;


    //METODOS

    public void preencherCampoBusca(String item) {
        campoBusca.sendKeys(item);
    }

    public void clicarBotaoLupa(){
        botaoLupa.click();
    }


}
