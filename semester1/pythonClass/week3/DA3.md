# Nested statement & Chained conditionals
The difference is nesting. A nested statement is putting code inside of other code, for example, putting an if statement inside of an existing if statement. On the other hand, chained conditionals are simply alternative branches using if, else, elif like the example below. There is no nesting, and all statements have the same depths in chained conditionals.

## Chained condition example:
```fNumber= input('What is your favorite number? ')
Book= input('What is your favorite book? ')
if fNumber == '9' and Book == 'Harry Potter':
   print('They are my favorites too.')
elif Book == 'Harry Potter':
   print( Book + ' is my favorite book too.')
elif fNumber != '9':
   print('Okay. My favorite number is 9. Unfortunately we are different.')```

    
## Nested statement example: Website login requirement
```age = int(input("What is your age? "))
 
requiredMinAge = 13
requiredLoc = "Mongolia"
 
if age >= requiredMinAge:
   country = input("Where are you now? ")
   if country == requiredLoc:
       print( "Welcome to our website!")
   else:
       print("Oh, unfortunately, our service is not available in your country!")
else:
   print('You are too young.')
   yearsLeft = requiredMinAge - age
 
   if yearsLeft == 1:
       print("Please come in {} year.".format(yearsLeft))
   else:
       print("Please come in {} years.".format(yearsLeft))```





## Strategy for avoiding nested conditionals:
The strategy for avoiding nesting conditions is using logical operators such as 'and', 'or' and 'not'. I used the 'and' operator in the example.

### Example of nested condition:
```def words(word1, word2):
    if len(word1) > 5:
        if len(word2) > 5:
            print(' both words are longer than 5')
        else:
            print( word1 'is longer than' word2)```


### Equivalent single conditional:
```def words2(word1, word2):
    if len(word1) >5 and len(word2) > 5:
        print(' both words are longer than 5')
    elif len(word1) >5 and len(word2)<5:
        print( word1 'is longer than' word2)```



Second strategy for avoiding nested conditionals: Guard and early return inside a function.

### Let’s transform Website login requirement code writing above. 

```def loginRequirement():
   requiredMinAge = 13
   requiredLoc = "Mongolia"
 
   age = int(input("What is your age? "))
 
   if age < requiredMinAge:
       yearsLeft = requiredMinAge - age
       yearOrYears = "year" if yearsLeft == 1 else "years"
       return "You are too young. Please come in {} {}.".format(yearsLeft, yearOrYears)
  
   country = input("Where are you now? ")
 
   if country != requiredLoc:
       return "Oh, unfortunately, our service is not available in your country!"
 
   return "Welcome to our website!"
      
 
answer = loginRequirement()
print(answer)```



    


