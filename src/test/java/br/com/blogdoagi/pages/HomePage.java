package br.com.blogdoagi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-3713 > a > span.menu-text")
    private WebElement oagiMenu;
    @FindBy(css = "a[href='https://blogdoagi.com.br/sua-carreira/']")
    private WebElement carreiraItem;

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public HomePage acessaHomePage(){
        System.out.println("Metodo iniciado: acessarHomePage");
        navegador.navigate().to("https://blogdoagi.com.br/");
        return new HomePage(navegador);
    }

    public boolean Oagipresenteesta() {
        System.out.println("Metodo iniciado: Oagipresenteesta");
        return oagiMenu.isDisplayed();
    }

    public CarreiraPage acessarCarreiraPage(){
        System.out.println("Metodo iniciado: acessarCarreiraPage");
        acessaHomePage();
        Actions actions = new Actions(navegador);
        actions.moveToElement(oagiMenu).perform();
        carreiraItem.click();
        return new CarreiraPage(navegador);
    }
}
