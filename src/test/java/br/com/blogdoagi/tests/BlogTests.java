package br.com.blogdoagi.tests;

import br.com.blogdoagi.utils.hooks.Hooks;

import org.testng.Assert;
import org.testng.annotations.Test;
import br.com.blogdoagi.pages.HomePage;



public class BlogTests extends Hooks {

    @Test
    public void validaMenuOagibank() {
        System.out.println("Iniciando teste: validaMenuOagibank");
        navegador = getDriver();
        HomePage homepage = new HomePage(navegador);
        Assert.assertTrue(homepage.getOagiMenu().isDisplayed(),"Não esta presente");
        Assert.assertTrue(homepage.getOagiMenu().isEnabled(),"Não esta disponivel");

    }
}
