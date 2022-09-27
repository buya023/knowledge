Describe how catching exceptions can help with file errors. Write three Python examples that actually generate file errors on your computer and catch the errors with try: except: blocks.  
 
1. FileNotFound
#When a file or directory is called but does not exist.
```try:
   fileName = 'text.txt'
   f = open(fileName, 'r')
   print( f.read()) 
except:
   print('There is no file with the name.')
 
Output: There is no file with the name.```
 
2.
```def lastMember(l):
   try:
       lMem= l[len(l)]
       print(lMem)
   except:
       print('Index error')
lastMember([3,6,78,5])   
 
Output: Index error```
 
3.
```def division(num1, num2):
   try:
       num1/num2
   except:
       print('ZeroDivisionError: Please input different number except 0 in num2.  ')
      
division(23, 0)```
 
```Output: ZeroDivisionError: Please input different number except 0 in num2.   
Describe how you might deal with each error(Bug) if you were writing a large production program. These descriptions should be general ideas in English, not actual Python code.
Applications = program
ship application = Release to the public
Test applications
OS = operating system
 ```


