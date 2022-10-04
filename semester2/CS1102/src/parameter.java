
public class parameter {
	private static int multiplyNums(int x, int y) {   // x and y are the formal parameter. The parameters are used inside the subroutine.
		
		return x * y;
	}
	public static void main(String[] args) {
		int num1 = 34;
		int num2 = 78;
		int mul =  multiplyNums(num1, num2);   // the num1 and num2 are actual parameters. They are passed when the method is called.  
		System.out.printf("multiplacation of %d and %d is %d", num1, num2, mul);
	}

}
