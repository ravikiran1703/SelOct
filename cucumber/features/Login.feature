Feature: Login for Leaftaps Application 
@smoke	
Scenario Outline: TC001_Login Positive flow 
	And enter the username as <username>
	And enter the password as <password>
	When click login button 
	Then verify login is success 
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
 
@reg @smoke	
Scenario: TC003_Login Negative flow 
	And enter the username as DemoCSR1 
	And enter the password as crmsfa 
	When click login button 
#	But verify login is failed 
	
	
	
	
	
	
	
	
	
	
	