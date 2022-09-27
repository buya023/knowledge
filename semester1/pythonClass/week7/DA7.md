### Part 1: A tuple with lists:
To iterate two lists or strings using the zip function and return a list of tuples in one loop. Let's think there are a and b lists. You could get elements from each a and b list and create a collection of tuples. For example,

```a=[1,2,3,4]   # 1st list
b=['a', 'b', 'c', 'd']      # 2nd list```

#listing tuples from elements from a and b lists.
```zipVer=list(zip(a,b)) ```

#looping over the tuples that formed from each element of a and b lists
```for index, tuplePair in enumerate(zipVer):   
    print(index,tuplePair) ```

Output:
```0 (1, 'a')
1 (2, 'b')
2 (3, 'c')
3 (4, 'd')```


### Part2 : A tuple with a dictionary:
Tuples can be used with loops over a dictionary in the following way.
To iterate a dictionary’s key-value pairs using the items method and return tuples that are key-value pairs. 

```def itemedDict(myInfo):
    itemed=myInfo.items()  # iterating the dictionary's key-value pairs
    for key, val in itemed:   # loop over dict-items contains key and value tuples
        print(key, val)
        
myInfo={ 'name': 'Buya', 'school': 'UoPeople', 'country': 'Mongolia'}
itemedDict(myInfo)```

Output:
```name Buya
school UoPeople
country Mongolia```



Reference:
Downey, A. (2015). Think Python: How to think like a computer scientist. Needham, Massachusetts. Green Tree Press. https://my.uopeople.edu/pluginfile.php/1587157/mod_page/content/54/TEXT%20-%20Think%20Python%202e.pdf

