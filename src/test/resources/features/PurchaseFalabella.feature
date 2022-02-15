Feature: the user open thhe falabella virtual store, add a product and pay

  Scenario: the user wants to buy a product in the falabella virtual store
    Given the user enters the falabella virtual store "https://www.falabella.com.co/falabella-co/"
    When the user search an "iphone 11 128GB"
    And the user add an iphone 11 128GB to cart
    And the user enter the shipping information
      | email               | state     | city     | neighborhood | address         | addressComplement |
      | prueba1@prueba1.com | ANTIOQUIA | MEDELLIN | MEDELLIN     | circular3#88-95 | piso 4            |
    Then the user can pay for the added product and see "Elige tu medio de pago"
