
# PROBLEM 
ASKED by Amazon.com

There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

- 1, 1, 1, 1
- 2, 1, 1
- 1, 2, 1
- 1, 1, 2
- 2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.



### Run with gradlew : 
> ./gradlew run -Psize={STAIR_SIZE} -Psteps={LIST_OF_STEPS }


Where STAIR SIZE is Int and LIST_OF_STEPS is a string composed of int 
separated by comma.

Example :
 
> ./gradlew run -Psize=4 -Psteps=1,2,3

 