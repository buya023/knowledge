## Example 1:
	
`def Function1(arg):`
   ` print(arg)`
`Funcion('Example1')`

Output:
	`Example1`
Parameter:
	arg
Argument:
	'Example1'
Explanation:
	Giving 'Example1' argument to arg parameter of function. That function prints the parameter.

## Example2:

### When the argument is a value:
Function1('Argument is a value')

Output:
	Argument is a value
Argument:
	'Argument is a value'
Explanation:
	The argument is given directly as value when calling the function. 


### When an argument is expression.
Function1('Mean'*3)

Output:
	MeanMeanMean

Argument:
	'Mean'*3
Explanation:
	'Mean'*3 is an expression used as an argument.

### When an argument is variable.
add='argument is a variable'
Function1(add)

Output:
	argument is a variable

Argument:
	add

Explanation: 
	Giving 'add' variable a value. Then, giving that variable as an argument to a function called Function1.


## Example 3:

### Function with local variable
def Function2(arg2):
    var=arg2+arg2
    print(var)
Function2(67)


Output:
	134


### When variable is outside the function
def Function2(arg2):
    var=arg2+arg2
    print(var)
Function2(67)
print(var)

Output:
134

NameError: name 'var' is not defined. Did you mean: 'vars'?
    print(var)


Explanation:
	Function2 will run fine. Thus, the output is 134. When trying to execute print(var), the var is not defined globally. Thus, a Name error has happened. If the var had a value, the value would be output. For example, if there is var=45 above the print(var), output would be 45 instead of error.


## Example 4:
def Function3(Uni):
    print(Uni)
Function3('Example4')
print(Uni)

Output:
NameError: name 'Uni' is not defined. Did you mean: 'argv'?
    print(Uni)

Explanation:
	When I try to print the parameter called ‘Uni’ outside of the function, there is a NameError error because the Uni has no value outside of the function. 


## Example 5:
num =67
def calcu():
    num=34
    print(num*num)
calcu()
print(num+23)

Output:
1156
90

Explanation:
	num variable inside function used only inside the function.Thus, result of calcu is ‘1156’ as shown above. When calcu terminates, the num variable is destroyed. As explained in chapter 3 of Think Python. The num outside function with different value is a new variable that will be used outside that function. Thus, the output of print(num+23) is ‘90’.


