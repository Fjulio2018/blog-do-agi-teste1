package br.com.blogdoagi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-3713 > a > span.menu-text")
    private WebElement oagiMenu;

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public boolean Oagipresenteesta() {
        System.out.println("Iniciando metodo: Oagipresenteesta");
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(oagiMenu));
        return oagiMenu.isDisplayed();
    }
}
