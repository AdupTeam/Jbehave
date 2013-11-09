Narrative:
In order to quickly find out the sum of two numbers
As a user
I want to use a calculator to add two numbers

Meta:
@author Don Joe
@themes Calc base tests

Scenario:  Add two valid numbers

Given a calculator
When I add <number1> and <number2>
Then the outcome should <result>

Examples:
|number1|number2|result|
|10|10|20|
|11|11|22|
|1|1|2|
|1|2|3|
|1|3|4|



