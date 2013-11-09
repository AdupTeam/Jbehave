Narrative:
In order to quickly find out the deduction of two numbers
As a user
I want to use a calculator to deduct two numbers

Meta:
@author Don Joe
@themes Calc base tests

Scenario:  Deduct two valid numbers

Given a calculator
When I deduct <number1> and <number2>
Then the outcome should <result>

Examples:
|number1|number2|result|
|10|5|5|
|10|3|7|
|10|4|6|
|10|1|9|
|10|10|0|
|10|4|6|
