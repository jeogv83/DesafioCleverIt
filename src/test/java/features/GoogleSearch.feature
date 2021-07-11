Feature: ingresar a google search
  @pruebaGoogle

  Scenario: Escenario 1: Busqueda de paginas en google search
    Given me encuentro en el sitio de google search
    When ingreso la pagina a buscar "spotify"
    And presiono el link de la pagina
    Then valido que me encuentro en la pagina de spotify


  Scenario Outline: : Escenario 2: Realizar conversión de monedas utilizando google search
    Given me encuentro en el sitio de google search
    When ingreso en el buscador "conversor de monedas"
    And visualizo el conversor de monedas
    Then ingreso el monto a convertir <monto>
    And selecciono el tipo de divisa a convertir
    And visualizo el resultado de la conversión


    Examples:
      | monto|
      | 20   |


  Scenario: Escenario 3: Visualizar el detalle del reporte del clima de mi localidad utilizando google search
    Given me encuentro en el sitio de google search
    When ingreso en el buscador "reporte del clima en santiago"
    And visualizo el reporte del clima de mi localidad con la temperatura del día actual
    And presiono el link para ver el detalle del clima de mi localidad
    Then validar que se visualiza el detalle del clima de mi localidad
