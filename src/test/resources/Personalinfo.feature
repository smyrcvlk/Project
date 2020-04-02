Feature: Editing personal information
  Background:

  Scenario: creating account

    Given Go to the yourlogo website
    And Go to Sign in button
    And type your "email" and "password"
    Then Click on the Sign in Button


  Scenario: Editing personal information

    And Click on My Personal Information
    And Click on social title
    And type to"First name"and "Last name" and "E-mail address"
    And type "Current Password"and "New Password"
    And Click on Save button
