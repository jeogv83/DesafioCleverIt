package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStep extends BaseTest{
    @Given("^me encuentro en el sitio de google search$")
    public void meEncuentroEnElSitioDeGoogleSearch()  {
        screenShot.takeScreenShot();
        googleSearchPage.verificarElementoGoogleSearch();
    }

    @When("^ingreso la pagina a buscar \"([^\"]*)\"$")
    public void ingresoLaPaginaABuscar(String nombPagina)  {
        screenShot.takeScreenShot();
        googleSearchPage.buscarPagina(nombPagina);
    }

    @When("^presiono el link de la pagina$")
    public void presionoLinkPagina()  {
        screenShot.takeScreenShot();
        googleSearchPage.presionarLinkPagina();
    }

    @Then("^valido que me encuentro en la pagina de spotify$")
    public void validoQueMeEncuentroEnLaPaginaDeSpotify()  {
        screenShot.takeScreenShot();
        googleSearchPage.validarSitio();
    }

    @When("^ingreso en el buscador \"([^\"]*)\"$")
    public void ingresoEnElBuscador(String arg1) {

    }

    @When("^visualizo el conversor de monedas$")
    public void visualizoElConversorDeMonedas() {

    }

    @Then("^ingreso el monto a convertir (\\d+)$")
    public void ingresoElMontoConvertir(int arg1) {

    }

    @Then("^selecciono el tipo de divisa a convertir$")
    public void seleccionoElTipoDeDivisaConvertir() {

    }

    @Then("^visualizo el resultado de la conversión$")
    public void visualizoElResultadoDeLaConversión(){

    }

    @When("^visualizo el reporte del clima de mi localidad con la temperatura del día actual$")
    public void visualizoReporteClimaConLaTemperaturaDelDía()  {

    }

    @When("^presiono el link para ver el detalle del clima de mi localidad$")
    public void presionoLinkParaVerDetalleDelClima() {

    }

    @Then("^validar que se visualiza el detalle del clima de mi localidad$")
    public void validarQueSeVisualizaDetalleDelClimaDeMiLocalidad() {

    }



}
