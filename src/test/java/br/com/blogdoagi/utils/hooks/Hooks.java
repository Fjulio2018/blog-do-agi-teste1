package br.com.blogdoagi.utils.hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Hooks {
    protected WebDriver navegador;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
        navegador.navigate().to("https://blogdoagi.com.br/");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (navegador != null) {
            navegador.quit();
        }
    }


    public WebDriver getDriver() {
        return navegador;
    }
}