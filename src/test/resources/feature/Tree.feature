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
@tagtree
Feature: tree

  I want to use this template for my feature file
 
@tag
 Scenario: Overview of Trees
   Given The user is in Home page after logged in
   When The user clicks the Getting Started button in Tree Pane or select Tree item from the drop down menu
   Then The user should be get directed to "Tree" Page
    
  @tag
  Scenario: Overview of Trees
    Given The user is in the Tree page after logged in
    When The user clicks Overview of Trees button
    Then The user should be get directed to "Overview of Trees" Page
        
    @tag
  Scenario: Overview of Tree in Python
    Given The user is in the Overview of Trees page after logged in
		When The user clicks on Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test    
    
    #@tag
  #Scenario: Terminologies
    #Given The user is in the Tree page after logged in
    #When The user clicks Terminologies button
    #Then The user should be directed to Terminologies Page 
       #
   #@tag
  #Scenario: Terminologies in Python
    #Given The user is in the Terminologies page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   #@tag
  #Scenario: Types of Trees 
    #Given The user is in the Tree page after logged in
    #When The user clicks Types of Trees button
    #Then The user should be directed to Types of Trees Page
    #
   #@tag
  #Scenario: Types of Trees in Python
    #Given The user is in the Types of Trees page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   #@tag
  #Scenario: Tree Traversals
    #Given The user is in the Tree page after logged in
    #When The user clicks Tree Traversals button
    #Then The user should be directed to Tree Traversals Page
    #
   #@tag
  #Scenario: Tree Traversals in Python
    #Given The user is in the Tree Traversals page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   #@tag
  #Scenario: Traversals-Illustration
    #Given The user is in the Tree page after logged in
    #When The user clicks Traversals-Illustration button
    #Then The user should be directed to Traversals-Illustration Page
    #
   #@tag
  #Scenario: Traversals-Illustration in Python
    #Given The user is in the Traversals-Illustration page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   #@tag
  #Scenario: Binary Trees
    #Given The user is in the Tree page after logged in
    #When The user clicks Binary Trees button
    #Then The user should be directed to Binary Trees Page
    #
   #@tag
  #Scenario: Binary Trees in Python
    #Given The user is in the Binary Trees page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
   #
   #@tag
  #Scenario: Types of Binary Trees
    #Given The user is in the Tree page after logged in
    #When The user clicks Types of Binary Trees button
    #Then The user should be directed to Types of Binary Trees Page
    #
   #@tag1
  #Scenario: Types of Binary Trees in Python
    #Given The user is in the Types of Binary Trees page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   #@tag1
  #Scenario: Implementation in Python
    #Given The user is in the Tree page after logged in
    #When The user clicks Implementation in Python button
    #Then The user should be directed to Implementation in Python Page
    #
   #@tag1
  #Scenario: Implementation of tree in Python
    #Given The user is in the Implementation in Python page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
     #
   #@tag1
  #Scenario: Binary Tree Traversals
    #Given The user is in the Tree page after logged in
    #When The user clicks Binary Tree Traversals button
    #Then The user should be directed to Binary Tree Traversals Page
    #
   #@tag1
  #Scenario: Binary Tree Traversals in Python
    #Given The user is in the Binary Tree Traversals page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   #@tag1
  #Scenario: Implementation of Binary Trees
    #Given The user is in the Tree page after logged in
    #When The user clicks Implementation of Binary Trees button
    #Then The user should be directed to Implementation of Binary Trees Page
    #
   #@tag1
  #Scenario: Implementation of Binary Trees in Python
    #Given The user is in the Implementation of Binary Trees after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   #@tag1
  #Scenario: Applications of Binary trees
    #Given The user is in the Tree page after logged in
    #When The user clicks Applications of Binary trees button
    #Then The user should be directed to Applications of Binary trees Page
    #
   #@tag1
  #Scenario: Applications of Binary trees in Python
    #Given The user is in the Applications of Binary trees page after logged in
    #When The user clicks on Try Here button
    #Then The user should be redirected to a page having an tryEditor with a Run button to test
    #
   @tag
  Scenario: Binary Search Trees
    Given The user is in the Tree page after logged in
    When The user clicks Binary Search Trees button
    Then The user should be get directed to "Binary Search Trees" Page
    
  @tag
  Scenario: Binary Search Trees in Python
    Given The user is in the Binary Search Trees page after logged in
    When The user clicks on Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @tag
  Scenario: Implementation Of BST
    Given The user is in the Tree page after logged in
    When The user clicks Implementation Of BST button
    Then The user should be directed to "Implementation Of BST" Page
    
  @tag
  Scenario: Implementation Of BST in Python
    Given The user is in the Implementation Of BST page after logged in
    When The user clicks on Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  #@tag
  #Scenario: Practice Questions
    #Given The user is in the Tree page after logged in
    #When The user clicks Practice Questions button
    #Then The user should be redirected to Practice page

