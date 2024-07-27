@RunAll2
Feature: test

	@test1
	Scenario: test
		Given testing given
		When test when
		Then test then
	@test1
	Scenario: test2
		Given testing given2
		When test when2
		Then test then2
	@data1
	Scenario Outline: test outline
		Given testing outline given is "<input>"
		Then test outline then
		
Examples:
| input |
| testing selenium |
| testing java |