package q11264;

class Student{
	int id;
	String name;
	void setData(int a, String b){
		this.id = a;
		this.name = b;
	}
	
	void displayData(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
}

class Marks extends Student{
	float javaMarks, cMarks, cppMarks;
	void setMarks(float c,float d,float e){
		this.javaMarks = c;
		this.cMarks = d;
		this.cppMarks = e;
	}
	
	void displayMarks(){
		System.out.println("Java marks : " + javaMarks);
		System.out.println("C marks : " + cMarks);
		System.out.println("Cpp marks : " + cppMarks);
	}
}

class Result extends Marks{
	float total,avg;
	void compute(){
		this.total = cppMarks + cMarks + javaMarks;
		this.avg = total/3;
	}
	
	void showResult(){
		System.out.println("Total : " + total);
		System.out.println("Avg : " + avg);
	}
}

public class MultilevelInheritanceDemo{
	public static void main(String[] args){
		Result ob = new Result();
		ob.setData(Integer.parseInt(args[0]),args[1]);
		ob.setMarks(Float.parseFloat(args[2]),Float.parseFloat(args[3]),Float.parseFloat(args[4]));
		ob.compute();
		ob.displayData();
		ob.displayMarks();
		ob.showResult();
	}
}
