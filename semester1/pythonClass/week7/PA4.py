alphabet = "abcdefghijklmnopqrstuvwxyz"   
test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"] 
test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"] 

# From Section 11.2 of: 
# Downey, A. (2015). Think Python: How to think like a computer scientist. Needham, Massachusetts: Green Tree Press. 
def histogram(s):
     d = dict()
     for c in s:
          if c not in d:
               d[c] = 1
          else:
               d[c] += 1
     return d 
 
 # checking whether each string is duplicated or not.
def has_duplicates(s):
    for val in histogram(s).values():  
        if val > 1:
            return True
    return False
# printing whether each string is duplicated or not.
for i in test_dups:
    if has_duplicates(i):
        print(i, 'has duplicates')
    else:
        print(i, 'has no duplicates')

# missingLetter function 
def missing_letters(string):
    global alphabet   # calling alphabet global variable
    letter=''
    for alp in alphabet:
        if alp not in histogram(string):   # checking whether each alp is in dictionary.
            letter+=(alp)
    return letter
    
for eachTest in test_miss:
    if len(missing_letters(eachTest)) ==0:   # if there is no missing letter, all letters are used.
        print(eachTest, 'uses all the letters.')
    else:
        print(eachTest, 'is missing letters', missing_letters(eachTest) )
        