Feature: Hago un registro

  Este feature se trata de realizar un registro y validar luego ese registro en Guru

  Scenario: Registrar y validar registro
    Given que el usuario entra a Guru
    When se registra Andres, Devia, 123, andres12377@gmail.com, Avenida Siempre Viva 123, Medellin, Antioquia, 00000, andres12377@gmail.com, 123456, 123456
    And se loguea andres12377@gmail.com, 123456
    Then el usuario puede validar que el logueo y por tanto el registro, fueron exitosos