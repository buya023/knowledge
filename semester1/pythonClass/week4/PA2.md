

**Code**
```# is_divisible function returns True or False.
def is_divisible(x, y):
    if x % y == 0:
        return True
    else:
        return False
# calling is_power function that takes two integer arguments.
def is_power(num1, num2):
    # Checking whether num1 is integer or not.
    if not isinstance(num1, int) :
        print('is_power is only defined for integers.')
        return None
    # Checking whether num2 is integer or not.
    if not isinstance(num2, int) :
        print('is_power is only defined for integers.')
        return None
    # Checking whether num1 and num2 are positive number or not.
    elif num1 < 0 or num2 < 0:
        print('is_power is not defined for negative integers.')
        return None
    
    # base case: when num2 is equal to num1.
    if num2== num1: 
        return True
    # using is_divisible function as base case
    if is_divisible(num1, num2)==False: 
        return False
    # base case: when num2 is 1.
    if num2==1:  
        return False
        
    # is_power function calling itself recursively 
    return is_power(num1//num2, num2)

# testing cases.
print("is_power(10, 2) returns: ", is_power(10, 2))
print("is_power(27, 3) returns: ", is_power(27, 3))
print("is_power(1, 1) returns: ", is_power(1, 1))
print("is_power(10, 1) returns: ", is_power(10, 1))
print("is_power(3, 3) returns: ", is_power(3, 3))```


**Output: **
```is_power(10, 2) returns:  False
is_power(27, 3) returns:  True
is_power(1, 1) returns:  True
is_power(10, 1) returns:  False
is_power(3, 3) returns:  True```