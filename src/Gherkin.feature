Feature: As a User I should be able to login into my account with valid User Name and Valid Password so that i can use facility of



  Scenario: User should be able login in with valid credentials
    Given User is on login page
    When User should type valid username as 'jack123'
    And User should type valid password as 'j123456'
    And User should click on login button
    Then User should be able to login in
    And User should see Welcome to User on top left corner


  Scenario: User should not be able login in with invalid user name and valid password
    Given User is on login page
    When User should type valid username as 'jack123789'
    And User should type valid password as 'j123456'
    And User should click on login button
    Then User should not be able to login in
    And  User shoud see error message as '......'




  Scenario: User should not be able login in with valid user name and invalid password
    Given User is on login page
    When User should type valid username as 'jack123'
    And User should type valid password as 'j123456789'
    And User should click on login button
    Then User should not be able to login in
    And  User shoud see error message as '......'



  Scenario: User should not be able login in with invalid username and invalid password
    Given User is on login page
    When User should type valid username as 'jack1237777'
    And User should type valid password as 'j123456789'
    And User should click on login button
    Then User should not  be able to login in
    And  User shoud see error message as '......'



  Scenario: User should not be able login in with blank username and valid password
    Given User is on login page
    When User should type valid username as '.....'
    And User should type valid password as 'j123456'
    And User should click on login button
    Then User should not be able to login in
    And  User shoud see error message as '......'



  Scenario: User should not  be able login in with valid username and blank password
    Given User is on login page
    When User should type valid username as 'jack123'
    And User should type valid password as '......'
    And User should click on login button
    Then User should not  be able to login in
    And  User shoud see error message as '......'



  Scenario: User should not be able login in with both blank username and blank password
    Given User is on login page
    When User should type valid username as '......'
    And User should type valid password as '.....'
    And User should click on login button
    Then User should not be able to login in
    And  User shoud see error message as '......'



  Scenario: User should not be able login in with blank username and invalid password
    Given User is on login page
    When User should type valid username as '.....'
    And User should type valid password as 'j123456789'
    And User should click on login button
    Then User should be not be able to login in
    And  User shoud see error message as '......'










