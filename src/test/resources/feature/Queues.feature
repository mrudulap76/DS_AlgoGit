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
Feature: dque
  I want to use this template for my feature file

  @tag
  Scenario: Queue
    Given user is in the Home page after logged in
    When user clicks the Getting Started button in Queue Pane or select Queue item from the drop down menu
    Then user should be directed to "Queue" Page   

  @tag
  Scenario: Queue in Python
    Given user is on the Queue page after logged in
    When user clicks Implementation of Queue in Python button
    Then The user should be directed to "Implementation of Queue in Python" Page   

    @tag
  Scenario: Queue in Python tryhere btn
    Given user is in the Implementation of Queue in Pythonpage after logged in
    When user clicks TryHere button
    Then user be redirected to a page having an tryEditor with a Run button to test   
    
    @tag
  Scenario: Implementation using Collections.deque button
    Given user is on the Queue page after logged in
    When user clicks Implementation using Collections.deque button
    Then The user should be directed to "Implementation using collections.deque" Page   
    
    @tag
  Scenario: Implementation using Collections.deque page tryhere
    Given The user is in the Implementation using Collections.deque page after logged in
    When user clicks TryHere button
    Then user be redirected to a page having an tryEditor with a Run button to test  
    
    @tag
  Scenario: Implementation using Array
    Given user is on the Queue page after logged in
    When user clicks Implementation using Array button
    Then user should be directed to Implementation using Array Page   
    
    @tag
  Scenario: Implementation using Array tryhere
    Given user is in the Implementation using Array page after logged in
    When user clicks TryHere button
    Then user be redirected to a page having an tryEditor with a Run button to test   
    
    @tag
  Scenario: Queue Operations
    Given user is on the Queue page after logged in
    When user clicks Queue Operations button
    Then user should be directed to "Queue Operations" Page
    
    @tag
  Scenario: Queue Operations in Tryhere
    Given user is in the Queue Operations page after logged in
    When user clicks TryHere button
    Then user be redirected to a page having an tryEditor with a Run button to test   
    
    @tag
  Scenario: Queue Operations in Tryhere
    Given user is on the Queue page after logged in
    When user clicks Practice Questions button
    Then user should be directed to "Practice Questions" Page
    
    