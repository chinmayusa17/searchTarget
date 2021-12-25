Feature: google search----Feeling Lucky

Scenario Outline: feeling lucky---google search
			
			Given I am on the google home page
			When I enter search "<term>"
			And I click on submit button
			Then I land on the first result home page
			And I click on Target
			Then I land on target web page
			
			Examples:
					|term                       |
			         
					|Target          |
					
			