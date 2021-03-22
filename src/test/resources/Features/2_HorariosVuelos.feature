Feature: Realizar la consulta del itinerario de vuelos de Avianca

  Scenario: Consultar Itinerario del trayecto Bogota-Cartagena
    Given Como cliente ingresó a la pagina de Avianca
    When Pulsó el boton Menu
    And Pulsó horarios de vuelo
    And Diligenció desde donde viajar
    And Diligenció hacia donde viajar
    And Seleccionó la fecha de ida
    And Seleccionó la fecha de vuelta
    And Pulsó el boton consultar
    And Organizó los resultados por fecha de salida
    Then Obtengo el listado de vuelos disponibles ordenados
