#Autor: Claudia Nieto
# Email: cmarce86@yahoo.es
# language: en
# encoding: utf-8

Feature: Validate has been Add product to cart for shipment to Colombia
  As an automator
  I want to select a product to add to cart from the aliexpress page
  To validate that the product has been added to the cart with shipment to Colombia

  @CaseOne
  Scenario Outline:Validate that the product has been added to the cart with shipment to Colombia
    Given that i access the aliexpress platform
    When i add product to cart
      | <product> | <country> |
    Then i verify that the product was added

    Examples:
      | product                                    | country  |
      | Reloj ultradelgado minimalista para hombre | Colombia |
