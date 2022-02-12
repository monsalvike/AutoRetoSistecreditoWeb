Feature: the user open thhe falabella virtual store, add a product and pay

  Scenario: the user wants to buy a product in the falabella virtual store
    Given the user enters the falabella virtual store
    When the user add an iphone11 128GB to cart
    And the user enter the shipping information
    |email              |departamento|ciudad  |barrio  |direccion      |complementoDireccion|
    |prueba1@prueba1.com|ANTIOQUIA   |MEDELLIN|MEDELLIN|circular3#88-95|piso 4              |
    Then the user can pay for the added product and see "Elige tu medio de pago"
