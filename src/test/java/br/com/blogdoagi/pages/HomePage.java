package br.com.blogdoagi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-3713 > a > span.menu-text")
    private WebElement oagiMenu;

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getOagiMenu() {
        return oagiMenu;
    }
}
