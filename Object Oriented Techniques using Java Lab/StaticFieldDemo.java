package q11291;
import java.util.Scanner;
public class StaticFieldDemo{
	public static void main(String[] args){
		System.out.print("Enter a StaticField number");
		Scanner x = new Scanner(System.in);
		A.aStaticField = x.nextInt();
		A a1 = new A(x.nextInt());
		A a2 = new A(x.nextInt());
		System.out.println("a1 ="+a1);
		System.out.println("a2 ="+a2);
		System.out.println("A.aStaticField = "+A.aStaticField);
	}
}
class A{
		public static int aStaticField;
		private int instanceField;
		public A(int instanceField){
			this.instanceField = instanceField;
		}
		public String toString(){
			return " A [instanceField = "+instanceField+", aStaticField = "+aStaticField+"]";
	}
}
