import java.util.Scanner;
class Adder{
	static int add(int a, int b){
		return a+b;
	}
	static int add(int a, int b, int c){
		return a+b+c;
	}
}

public class TestOverloading1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Addition of two numbers: " + Adder.add(a,b));
		System.out.println("Addition of three numbers: " + Adder.add(a,b,c));
	}
}
