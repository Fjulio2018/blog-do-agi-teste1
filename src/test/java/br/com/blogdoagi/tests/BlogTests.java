package br.com.blogdoagi.tests;

import br.com.blogdoagi.pages.CarreiraPage;
import br.com.blogdoagi.utils.hooks.Hooks;

import org.testng.Assert;
import org.testng.annotations.Test;
import br.com.blogdoagi.pages.HomePage;


public class BlogTests extends Hooks {


    @Test
    public void validaMenuOagibank() {
        boolean acessouhomePage = new HomePage(navegador)
                .acessaHomePage()
                .Oagipresenteesta();
        Assert.assertTrue(acessouhomePage, "Não esta presente");

    }


    @Test
    void acessarCarreiraPage() {
        String tituloEsperado = "Carreira";
        String tituloAtual = new HomePage(navegador)
                .acessaHomePage()
                .acessarCarreiraPage()
                .getCarreiraTitle();

        Assert.assertEquals(tituloAtual, tituloEsperado, "Titulo diferente do esperado");


    }

}
