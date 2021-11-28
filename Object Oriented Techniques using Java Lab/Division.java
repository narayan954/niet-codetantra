package q11329;
class Division {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		try{
			int res = a/b;
			System.out.println("Result = " + res);
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught : divide by zero occurred");
		}
	} 
}
