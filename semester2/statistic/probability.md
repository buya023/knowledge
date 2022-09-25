
# Population:
parameters = characteristic of full population
Hence, µ, the population average, and the population median and the population quartiles. is a parameter. 

# population variance => 
 σ^2 = The average square deviation in the population
    = Sum of the squares of the deviations in the population / Number of values in the population 
    = sum(xi − µ)^2 / N

Standard deviation of the population = sigma or square root of the variance

# Random Variables:

statistic = characteristic of sample.

# sample function: gave random values from the height data
for example: 
> sample(pop$height,1)
[1] 154

# Probability of sample: 
The mean of the absolute value of the "difference between X and 170"
is 0.93393. This is the mean "absolute deviation from the mean".
for example: This is probability of between 150 and 190 centimeters
> mean(abs(X-170 ) <=20)
[1] 0.93393 
The ( ) is logical comparison which means that you are asking R to check if the "absolute value of X - 170" is less than or equal to 20, and if it is, count all the TRUE values as 1 and find the mean of the whole thing. The 0.93393 means that 93.3% of values are between 150 and 190.

# expectation is center of the distribution of random variable. it is equivalent to average x and the population average µ.
E = sum(x * P(x))  P(x) is probability of x and relative frequency fx/n 
So, the expectation of potential of randomly selected subject is equal to mean of populations.
E(X) = mean(pop$height)

# sample variance 

S^2 = sum((x - mean)^2) / n-1
On the other hand, 
s^2 = (n/n-1)* sum((x-mean)^2 * (fx/n))

# Variance of a random variable: Var(X) = sum((x − E(X))^2 × P(x))



Random Variable: The probabilistic model for the value of a measurement,
before the measurement is taken.

Sample Space: The set of all values a random variable may obtain.

Probability: A number between 0 and 1 which is assigned to a subset of the
sample space. This number indicates the likelihood of the random variable
obtaining a value in that subset.

Expectation: The central value for a random variable. The expectation of the
random variable X is marked by E(X).

Variance: The (squared) spread of a random variable. The variance of the
random variable X is marked by Var(X). The standard deviation is the
square root of the variance.

