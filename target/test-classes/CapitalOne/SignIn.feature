@footer
Feature: This feature is used to validate sign in page

Scenario: To validate the empty username and password
Given to load the sigin application url
When i click sigin "Sign In" link
And i wait for sigin page to load
Then it should navigate sigin the "https://verified.capitalone.com/auth/signin" url
When i enter username ""
And i enter password ""
And i click sign button
Then validate user error message
Then validate password error message
Then i close signin the browser


Scenario: To validate the empty username and password
Given to load the sigin application url
When i click sigin "Sign In" link
And i wait for sigin page to load
When i enter username ""
And i enter password "test"
And i click sign button
Then validate user error message
Then i close signin the browser


Scenario: To validate the empty username and password
Given to load the sigin application url
When i click sigin "Sign In" link
And i wait for sigin page to load
When i enter username "test"
And i enter password ""
And i click sign button
Then validate password error message
Then i close signin the browser

Scenario: To validate the empty username and password
Given to load the sigin application url
When i click sigin "Sign In" link
And i wait for sigin page to load
When i enter username "test"
And i enter password "test"
And i click sign button
Then validate invalid error message
Then i close signin the browser

Scenario: To validate the forot password menu
Given to load the sigin application url
When i click sigin "Sign In" link
And i wait for sigin page to load
When i click sigin "Forgot Username or Password?" link
And i wait for sigin page to load
Then it should navigate sigin the "https://verified.capitalone.com/signinhelp.html#/sign-in-help?client=SIC" url
Then i close signin the browser

@signin
Scenario: To validate the Checking & Savings menu
Given to load the sigin application url
When i click sigin "Sign In" link
And i wait for sigin page to load
When i click sigin "Set Up Online Access" link
And i wait for sigin page to load
Then it should navigate sigin the "https://verified.capitalone.com/enroll/#/pii?originatorId=SIC" url
Then i close signin the browser

