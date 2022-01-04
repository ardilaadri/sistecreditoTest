# language: es

@Cucumber

Característica: Recorrido Básico compra de un articulo

  esta feature se trata de validar un proceso de compra hasta el momento de pago

  Scenario: Recorrido Básico
    Dado El usuario llega a falabella
    Cuando El usuario elige un articulo
    Y El usuario llena los datos de despacho
    Entonces El usuario puede realizar su pago

