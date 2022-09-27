
## Part 1:
Describe the difference between objects and values using the terms “equivalent” and “identical”. Illustrate the difference using your own examples with Python lists and the “is” operator. 

```num1 =[9, 6,6.6,7,2]
num2 =[9, 6,6.6,7,2]
print(num1 is num2) # False
print(num1 == num2) # True```

In simple words, an object is a box, and a value is a content inside the box. Identical(“Is” operator) means whether 2 objects are actually in the same box. Equivalent (“==”  operator) means whether the contents inside 2 objects are the same. For example, num1 and num2 have the same content(Equivalent) but refer to different objects(Not identical).

	
## Part 2:
Describe the relationship between objects, references, and aliasing. Again, create your own examples with Python lists.
Reference is the bond between variable and object (Downey, 2015). Aliasing is the same instance with different names. Alias exist between objects with two or more references when they refer to the same object in memory during program execution (Ohata and Inoue, 2006). An aliased object is mutable. If one change happened in one alias, the change will happen also in other aliases (Downey, 2015). 

```randomList1 = [9, 34, 9,3, 4]  
randomList2 = [2, 0, 'aa', 98]
randomList2 = randomList1   # alias
randomList2.append("Buya")
randomList1.append("Hi")
print(randomList1, randomList2)
```
 
```Output: [9, 34, 9, 3, 4, 'Buya', 'Hi'] [9, 34, 9, 3, 4, 'Buya', 'Hi']```

## Part 3:
create your own example of a function that modifies a list passed in as an argument. Describe what your function does in terms of arguments, parameters, objects, and references. 
```def deleteMiddleNum(oddList):
    if len(oddList) % 2==1:
        del oddList[len(oddList)//2]
numList =[1,5,6,4,8]
deleteMiddleNum(numList)
print(numList)

Output: [1, 5, 4, 8]```

The function takes a list as an argument- and returns a modified list. The function deletes the middle number when the length of the function is odd. Both parameters oddList and numList refer to the same object. So they are  aliases of each other. Since list is mutable, the function does not create a new list. It only mutates the list.
 
 
Reference:
Downey, A. ( 2015). Think Python: how to think like a computer scientist. Green Tea Press. https://my.uopeople.edu/pluginfile.php/1587157/mod_page/content/54/TEXT%20-%20Think%20Python%202e.pdf
 
 
