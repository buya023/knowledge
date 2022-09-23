Difference between formal parameters and actual parameters

1. 


## Throwing exceptions : throw  new  IllegalArgumentException( error-message );

static void print3NSequence(int startingValue) {
   
   if (startingValue <= 0)  // The contract is violated!
      throw new IllegalArgumentException( "Starting value must be positive." );
   
## Global and local variable
There are local variable, formal parameter and static member variable.
1. Local variable has no connection with outside of the subroutine and only works inside the subroutine. 
2. Parameters are used to give values to the subroutine. The parameter is like local variable. CHanges are made inside and has no impact outside of the subroutine.
3. Global variable exists independently. The variable can be defined outside of the subroutine. But, be sure to use the global variable with the reasonable reason.

