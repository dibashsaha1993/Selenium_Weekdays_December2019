
Feature: This feature is used to validate menu navigation in home page

Scenario: To validate the Credit card menu
Given to load the application url
When i click "Credit Cards" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/credit-cards/" url
Then i close the browser

Scenario: To validate the Checking & Savings menu
Given to load the application url
When i click "Checking & Savings" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/bank/" url
Then i close the browser

Scenario: To validate the Auto Loans menu
Given to load the application url
When i click "Auto Loans" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/auto-financing" url
Then i close the browser

Scenario: To validate the Business menu
Given to load the application url
When i click "Business" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/small-business-bank/" url
Then i close the browser

Scenario: To validate the Commercial menu
Given to load the application url
When i click "Commercial" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/commercial/" url
Then i close the browser

Scenario: To validate the Learn & Grow menu
Given to load the application url
When i click "Learn & Grow" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/learn-grow/?external_id=COF01_HUB_HUB_NAV_SITE_LGH_D99" url
Then i close the browser

Scenario: To validate the Life Events menu
Given to load the application url
When i click "Learn & Grow" link
When i click "Life Events" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/learn-grow/life-events" url
Then i close the browser

Scenario: To validate the Money Management menu
Given to load the application url
When i click "Learn & Grow" link
When i click "Money Management" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/learn-grow/money-management" url
Then i close the browser

Scenario: To validate the More Than Money menu
Given to load the application url
When i click "Learn & Grow" link
When i click "More Than Money" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/learn-grow/more-than-money" url
Then i close the browser

Scenario: To validate the Tech & Innovation menu
Given to load the application url
When i click "Learn & Grow" link
And i wait for page to load
When i click "Tech & Innovation" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/learn-grow/tech-innovation" url
Then i close the browser

Scenario: To validate the Privacy & Security menu
Given to load the application url
When i click "Learn & Grow" link
When i click "Privacy & Security" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/learn-grow/privacy-security" url
Then i close the browser

Scenario: To validate the Sign In menu
Given to load the application url
When i click "Sign In" link
And i wait for page to load
Then it should navigate the "https://verified.capitalone.com/auth/signin" url
Then i close the browser

Scenario: To validate the Bredcrum menu
Given to load the application url
When i click "Credit Cards" link
And i wait for page to load
When i click "Capital One Home" link
And i wait for page to load
Then it should navigate the "https://www.capitalone.com/" url
Then i close the browser

