# Discussion assignment 1

1.  `>>> print 'Hello, World!'`


**Output: **

` File "<stdin>", line 1`
 `   print 'Hello, World!'`
          `              ^`
`SyntaxError: Missing parentheses in call to 'print'. Did you mean print('Hello, World!')?`


**Explanation of output:**

The output shows that there is a bug. The bug is a SyntaxError due to the missing parentheses of the ‘print’ function. Also, there is a suggestion for the possible correction of the bug. 

**Python version comparison:**

In Python 2 version:	        In Python 3 version:

>>> print 'Hello, World!' 	    >>> print 'Hello, World!' 

Result: Hello, World!           Result: SyntaxError

This executes in version 2.     The parentheses are needed to execute in version 3. 
                                    >>> print('Hello, World!')
                                 

So, I am using Python 3 and executed Python 2 code, which resulted in a bug.

2.  `>>> 1/2`
  	

**Output:** `0.5`


**Explanation of output:**

The operator ’ / ‘ performs division. So, 1/2 is 0.5 as shown above.

**Comparison: **

Similar example is  >>> 84 / 2 in page 3 of chapter 1.  Answer of 84 / 2 is 42.0. So, Both answer’s types are floating-point numbers.

**What it means about my version of Python:**

In Python 2 version:	        In Python 3 version:

>>> 1/2                         >>> 1/2

Result: 0                       Result: 0.5

‘ / ‘ shows the integer         ‘ / ‘ shows float value
value of a division.            of a division
     

So, I am using Python 3.


3.   `>>> type(1/2)`

**Output:**   `<class 'float'>`

**Explanation of output:**

This is showing a type of 1/2. The type is float. The ‘ class ‘ is used as a category in the above. 

**Comparison:**

Similar example is >>> type(42.0) in page 4 of chapter 1. 

`>>> type(42.0)             >>> type(1/2)`
`<class 'float'>            <class 'float'>`

Both of them are indicating types of each value. Both types are floats.

What it means about my version of Python:

In Python 2 version:	            In Python 3 version:

>>> type(½)                         >>> type(½)

Result: <type ‘int’>                Result: < class ‘float’>

‘ / ‘ shows the integer value       ‘ / ‘ shows the float value of 
of a division.                       a division. So, type is float
Thus, type is integer.                                    




4. `>>> print(01)`

**Output:**

`File "<stdin>", line 1`
    `print(01)`
     `      ^`
`SyntaxError: invalid token`


**Explanation of output:**

The output shows that there is a bug. The bug is invalid token in SyntaxError. 
in Python 3, leading zeros are not allowed on numbers. Thus, 02 should be written as 2 instead.


**Comparison:**

Similar example is question 4 in Exercise 1.1. The question is ‘ What happens if you try 02 in Python? ‘
Both of them are showing similar output which is ‘ SyntaxError: invalid token ‘


**What it means about my version of Python:**

In Python 2 version:	        In Python 3 version:

>>> print(01)                   >>> print(01)

Result: 1                       Result: SyntaxError: invalid token

Numbers can start               Numbers can not start 
with zero in version 2          with zero in version 3





5.  `>>> 1/(2/3)`


**Output:**  `1.5`


**Explanation of output:**

This is a simple arithmetic operation. First operation is inside two parentheses. Last operation is 1 divided by the first operation’s answer. Thus, Output is 1.5.

**Comparison:**
Similar example is Exercise 1.2 on page 8.
Question 2 in Exercise 1.2 is to find how many miles in 10 kilometers. Answer is 10/ 1.61.


**What it means about my version of Python:**

In Python 2 version:	            In Python 3 version:

>>> 1/(⅔)                           >>> 1/(⅔)

Result: ZeroDivisionError:          Result: 1.5
integer division by zero

⅔ =0.                               ⅔=⅔
1/0 is unacceptable.                1*(3/2)= 1.5
Thus, There is a bug.                                  





























