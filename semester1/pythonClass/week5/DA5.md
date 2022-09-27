
1. 
```def any_lowercase1(s):
     for c in s:
          if c.islower():
               return True
          else:
               return False```

Explanation: This function is checking whether the first letter in the ‘s’ argument is a lowercase letter or not. Then, immediately returning True or False. So, When the first letter of s comes, after checking whether lowercase or not, the function returns the result and stops. 
Example:
```print(any_lowercase1('Buya'))  => False ```
The first letter of the example is ‘B’. The B is not a lowercase letter. So, the output is False. The function does not check the rest of the letters of argument. 



2. 
```def any_lowercase2(s):
     for c in s:
          if 'c'.islower():
               return 'True'
          else:
               return 'False'```

Explanation: 
A function only checks whether the ‘c’ letter is a lowercase letter or not. So, the function will always return ‘True’ despite any given arguments.

Example: 
```print(any_lowercase2('BOLD'))  => True    
print(any_lowercase2('Any'))     => True```
The function does not check the argument’s letter but checks only the ‘c’ letter. So, the output will always be True.


3. 
```def any_lowercase3(s):
     for c in s:
          flag = c.islower()
     return flag```

Explanation: 
This function is the opposite of the first function. The function will only check the last letter of argument. Whenever checking letters, we give a new value to the ‘flag’ variable. When a new value is given to the variable, we lose former information(Downey, 2015). So, the final value of the variable is the last letter’s result.

Example:
When we give an argument that ends with an uppercase letter, there will be an incorrect result.
```print(any_lowercase3('anY'))   => False```
First, we check the first 2 letters. The variable has a value that is ‘True’.  After checking the last letter which is ‘Y’, the variable is ‘False’. So, the output is ‘False’.


4.
```def any_lowercase4(s):
     flag = False
     for c in s:
          flag = flag or c.islower()
     return flag```

Explanation: 
The function will check whether the argument has any lowercase letters or not as supposed to be. The default state is false by giving the variable the ‘False’. If one letter is lowercase after the  c.islower()method, the ‘flag’ variable will have a ‘True’ value. (false or true), (true or true), (true or false) all will give ‘True’ value. So, when the true value comes from c.islower(), the result will always be true. 


5.
```def any_lowercase5(s):
     for c in s:
          if not c.islower():
               return False
     return True```

Explanation:
This function is almost opposed to the intended function. The function will return False if it meets characters that are not lowercase. 

Example:
```print(any_lowercase5('nnnnA'))  => False```
If we pass a string that is full of lower letters and one uppercase letter, the output will be False. The reason is the function checks whether there is any uppercase or not in the string.
