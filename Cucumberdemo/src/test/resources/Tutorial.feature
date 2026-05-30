Feature: TutorialsNinja End to End Flow

Scenario: User Registration
Given user opens tutorialsninja website
When user clicks My Account
And user clicks Register
And user enters registration details
Then account should be created successfully


Scenario: User Login
Given user opens tutorialsninja website
When user clicks My Account
And user clicks Login
And user enters valid login credentials
Then user should login successfully


Scenario: Product Search
Given user opens tutorialsninja website
When user searches product "MacBook"
Then product should be displayed


Scenario: Add Product To Cart
Given user opens tutorialsninja website
When user searches product "MacBook"
And user adds product into cart
Then product should be added to cart


Scenario: Checkout Product
Given user opens tutorialsninja website
When user opens cart
And user proceeds to checkout
Then order should be placed successfully