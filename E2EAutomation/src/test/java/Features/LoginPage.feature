Feature: Login Page Test

Scenario Outline: Login Page Test
   
    Given user is on login page
    When user enters "<username>" and "<Password>"
    And user click on Login button
    Then verify that user is on home page
    And click on top menu
    And select a white top from list
    And select the pink color
    And select the small size
    Then add into the cart
    And Click on Cart

    Examples: 
    | username  | Password |       
    |shivrajswami800@gmail.com|Shivraj@123|