#Autor: Claudia Nieto
# Email: cmarce86@yahoo.es
# language: en
# encoding: utf-8

Feature: Validate control pop-ups platform
  As an automator
  I want to control the popup windows of the aliexpress page
  To validate that functionality

  @CaseOne
  Scenario Outline:close popups
    Given that i access the aliexpress platform
    When i close the platform pop-ups
    Then i verify that the login pop up message to appears "<message>"

    Examples:
      | message                            |
      | Inicia sesión para ver más ofertas |

