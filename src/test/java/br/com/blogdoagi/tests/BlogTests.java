package br.com.blogdoagi.tests;

import br.com.blogdoagi.utils.hooks.Hooks;

import org.testng.Assert;
import org.testng.annotations.Test;
import br.com.blogdoagi.pages.HomePage;


public class BlogTests extends Hooks {

    @Test
    public void validaMenuOagibank() {
        System.out.println("Iniciando teste: validaMenuOagibank");
        navegador = getNavegador();
        HomePage homepage = new HomePage(navegador);
        Assert.assertTrue(homepage.Oagipresenteesta(),"Não esta presente");
    }
}
