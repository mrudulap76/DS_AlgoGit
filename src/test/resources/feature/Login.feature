#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SignIn
  I want to use this template for my feature file

  @tag
  Scenario Outline: Title of your scenario
    Given User is in the Sign in page
    When User gets values from excel Sheet Name "<Sheet Name>" , Testcase <Test case>
    Then User be redirected to Home Page with the message You are logged in and with the user name on the top
 
 Examples: 
       |Sheet Name	|Test case |
       |Sheet1|1|   
 