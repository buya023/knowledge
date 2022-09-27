

lists three possibilities to consider if a function is not working.
  - Describe each possibility in your own words.
  - Define "precondition" and "postcondition" as part of your description.
  - Create your own example of each possibility in Python code. List the code for each example, along with sample output from trying to run it.

### If a function is not working, there are three possibilities to consider: 
• There is something wrong with the arguments the function is getting; a precondition is violated. 
• There is something wrong with the function; a postcondition is violated. 
• There is something wrong with the return value or the way it is being used.

### If a function is not working, there are three possibilities to consider: 
The precondition is a problem that has to be confirmed before the function call(Downey, A. 2015). It is important to make sure that correct arguments are passed. A common example is like missing a type of argument. 

Example 1: 
```def addNum(num1, num2):
    Total = num1+num2
    return Total
    
addNum(34)```

Output:
```TypeError: addNum() missing 1 required positional argument: 'num2'```

Explanation: 
# There is an error because one argument is missing. The function expects 2 arguments. But there is one argument given in the example.
# To fix the issue, make sure to give the required number of arguments when calling functions.


The postcondition is a requirement that has been satisfied by the function before it ends (Downey, A. 2015). An example of the problem would be a variable name that is mistakenly changed inside a function. 
	
Example 2:

```def findAveGrade(grades):    
    aveGrade= sum(grades)//len(grades)
    return aveGrade  
print(findAveGrade([]))
```

Output:
```print(findAveGrade([1,2,3]))  => 2
print(findAveGrade([]))  => ZeroDivisionError: integer division or modulo by zero```

Explanation: 
# It is a postcondition violation. 
# When the argument list is empty, the length of grades is zero. The number can not be divided by zero. So, it creates a zero division error inside the function.
# To fix the error, we need to add a condition that checks whether grades are empty or not.

The correct function:
```def findAveGrade(grades):  
    if len(grades) ==0:
        return ('Please input grades')
    aveGrade= sum(grades)//len(grades)
    return aveGrade  ```

The last problem is that the return value could be used wrongly or not used at all. It happened when the programmer used a print statement where the return statement is supposed to be. There is no value that is returned without a return statement. That led to a lot of confusion. 

Example 3:
```def multiplyNum(num):
    multy=num*num
    print(multy)

print(multiplyNum(2)*3)
```

Output:
```4
TypeError: unsupported operand type(s) for *: 'NoneType' and 'int'```

Explanation: 
# multiplyNum function does not return anything, only prints a variable named ‘multy’. When we try to multiply the output of the function by a number 3, there is a TypeError. So, we have to return the output to be able to use it further.



Reference:
Downey, A. (2015). Think Python: How to think like a computer scientist. Green Tea Press. https://my.uopeople.edu/pluginfile.php/1587157/mod_page/content/54/TEXT%20-%20Think%20Python%202e.pdf


