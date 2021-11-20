package q10886;

public class Factorial {
	public static void main(String args[]) {
		int i,fact = 1;
		int n=Integer.parseInt(args[0]);
		for (i=1;i<=n;i++){
			fact = fact * i;
			
		}
		System.out.println("Factorial of " + n + " is " + fact);
	}
	
}
