# Java Discrete Math and Statistic (WIP)

This is project math, the content mostly taking from college, Please don't

## Road Map for Module 1

### Optimize code [not done]
### Print out all the module 1 theory [Not done]
### Print out all the rule module 1 [Not done]

### Finish most of the calculation module 1 [not Done]
- #### 1.1 Prime Numbers and Prime Factorization
	- Determine all prime number in number [DONE]
		- Using primeNumberFunction()
		> This function gonna return a list of every prime number from 2 to enter number

	- Determine the (prime_factorization_cal) [DONE]
		- Using primeFactorizationFunction()
		> This function determine Prime Factorization of a Composite Number
		+ Prime factorization of a number is a product of primes with the same value. 

	- Determine if the first number is divisible by the second (divisibility_for_number_cal) [not done]
		> Example:  35457 by 2; No, the last digit is not divisible by 2 (This one not important)

	- Determine all possible digit replacements for 'x' so that the first number is divisible by the second. [DONE]
		- Using replaceDivisibilityFunction()
		> This funtion gonna return a list of number that can replace x and still divisible with n
		+ Example: 764x88 by 6; will return 764x88 by 6, x ∈ [0, 3, 6, 9]

	- Determine all possible digit replacements for 'x' and 'y' so that the number is divisible by the second [NOT DONE]
		> Example: 47x9y by 18; 18 --> 2 and 9; y needs to be y ∈ {0, 2, 4, 6, 8} 
			+ If b = 0; The number is 47a90 and Sum = 20 + a; So a ∈ {7} and 47 790  
			+ If b = 2; The number is 47a92 and Sum = 22 + a; So a ∈ {5} and 47 592  
			+ If b = 4; The number is 47a94 and Sum = 24 + a; So a ∈ {3} and 47 394  
			+ If b = 6; The number is 47a96 and Sum = 26 + a; So a ∈ {1} and 47 196  
			+ If b = 8; The number is 47a98 and Sum = 28 + a; So a ∈ {8} and 47 898
			+ The five digit numbers divisible by 18 are:  47 790,  47 592;  47 394;  47 196  and  47 898

	- Determine the GCF and LCM Using Prime Factorization [NOT DONE]
	- Determine Euclidian Algorithm [NOT DONE]

- #### 1.2 Modular Arithmetic (Congruence)
	- Solve each modular equation for whole number solutions [NOT DONE]
		> Example: 4 + 0 ≡ 4 (mod 7); x ∈ {1, 8, 15, 22, ...} 

	- Square and Multiply Algorithm [NOT DONE]

- #### 1.3 Application of Modular Arithmetic
	- Airline Tickets [NOT DONE]
	- SIN [NOT DONE]
	- UPC [NOT DONE]
	- ISBN [NOT DONE]


## Road Map for Module 2


## Tool Use
-   Java
-   Intellij Idea: https://www.jetbrains.com/idea/download/

## Java library (may be not even use)
-   Javajx: https://openjfx.io/

## Bug 
-   primeNumberFunction gonna break if enter too big number ex:275625 
-   primeNumberFunction bug make primeFactorizationFunction not work as well