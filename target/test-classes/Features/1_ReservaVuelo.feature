Feature: Realizar la reserva de una vuelo desde la pagina principal de avianca

  Scenario: Reservar vuelo Bogota-Miami
    Given Yo como cliente ingresó a la pagina de Avianca
    When Dilgenció el origen
    And Diligenció el destino
    And Seleccionó las fechas del vuelo
    And Seleccionó la clase de vuelo
    And Seleccionó la cantidad de adultos
    And Seleccionó la cantidad de niños
    And Seleccionó la cantidad de bebes
    And Pulsó el boton Continuar
    And Pulsó el boton Buscar
    Then Obtengo el listado de vuelos disponibles
