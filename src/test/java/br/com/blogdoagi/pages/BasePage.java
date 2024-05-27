package br.com.blogdoagi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver navegador;

    public BasePage(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
        System.out.println("Pagefactory: iniciada");
    }
}