@RunAll
Feature: test

Background: launching site
	Given launch site test
		
	@test
	Scenario: test
		Given testing given
		When test when
		Then test then
	@test2
	Scenario: test2
		Given testing given2
		When test when2
		Then test then2
	@data
	Scenario Outline: test outline
		Given testing outline given is "<input>"
		Then test outline then
		
Examples:
| input |
| testing selenium |
| testing java |