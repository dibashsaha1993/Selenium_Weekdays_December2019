
Feature: This feature is used to validate homepage sign in page

Scenario: To validate the empty username and password
Given to load the application url
And i wait for page to load
When i enter home username ""
And i enter home password ""
And i click home sign button
Then validate home user error message
Then i close the browser

Scenario: To validate the empty username and password
Given to load the application url
And i wait for page to load
When i enter home username "test"
And i enter home password ""
And i click home sign button
Then validate home password error message
Then i close the browser

Scenario: To validate the empty username and password
Given to load the application url
And i wait for page to load
When i enter home username ""
And i enter home password "test"
And i click home sign button
Then validate home user error message
Then i close the browser

Scenario: To validate the empty username and password
Given to load the application url
And i wait for page to load
When i enter home username "test"
And i enter home password "test"
And i click home sign button
And i wait for page to load
Then validate home invalid error message
Then i close the browser

Scenario: To validate the forot password menu
Given to load the application url
And i wait for page to load
When i click "Forgot Username or Password?" link
And i wait for page to load
Then it should navigate the "https://verified.capitalone.com/signinhelp.html" url
Then i close the browser

Scenario: To validate the Set Up Online Access menu
Given to load the application url
When i click "Set Up Online Access" link
And i wait for page to load
Then it should navigate the "https://verified.capitalone.com/enroll/#/pii" url
Then i close the browser

Scenario: To validate the Get Rewarded menu
Given to load the application url
And i wait for page to load
When i click "Learn More" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/credit-cards/walmart-rewards/" url
Then i close the browser

Scenario: To validate the Start Saving menu
Given to load the application url
And i wait for page to load
When i click "Start Saving" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/bank/savings-accounts/online-performance-savings-account/" url
Then i close the browser

Scenario: To validate the Let's Do This menu
Given to load the application url
When i click "Let's Do This" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/credit-cards/prequalify/" url
Then i close the browser
