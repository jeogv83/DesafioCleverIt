package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends BasePage{

    By inputBuscador = By.name("q");
    By linkPagina = By.xpath("//*[@href='https://www.spotify.com/cl/']");
    String titulo;
    By textoSpotifyAB = By.xpath("//span[contains(text(),'© 2021 Spotify AB')]");

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void verificarElementoGoogleSearch(){
        titulo = driver.getTitle();
        Assert.assertEquals("Titulo de la pagina no coincide con el esperado: ","Google",titulo);

    }

    public void buscarPagina(String nombPagina){
        WebElement nombre = esperarElementoVisible(inputBuscador , 15);
        ingresarTexto(nombre ,nombPagina);
        enviarTexto(nombre);
    }

    public void presionarLinkPagina(){
        WebElement linkPag = esperarElementoVisible(linkPagina , 15);
        hacerClicElemento(linkPag);
    }

    public void validarSitio(){
        titulo = driver.getTitle();
        Assert.assertEquals("Titulo de la pagina no coincide con el esperado: ","Escuchar es todo - Spotify",titulo);
        WebElement textSpotiFy =  esperarElementoVisible(textoSpotifyAB , 15);
        moverHastaElemento(textSpotiFy);
        Assert.assertEquals("Los textos no coinciden","© 2021 Spotify AB",textoDelElemento(textSpotiFy));
    }

}
