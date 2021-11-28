package q11044;
class LinearSearch{
	public void linearSearch(int[] a, int key){
		int p = 0, pos = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] == key){
				p = 1; 
				pos = i; 
				break;   
			}     	
		}     		
		if(p == 1)
		System.out.println("Search element " + key + " is found at position : "+ pos);
		else
		System.out.println("Search element " + key + " is not found");
	}
}

public class LinearSearchMain{
		public static void main(String[] args){
		int[] array = new int[args.length];
		int n = args.length-1;
		
			for (int i = 0; i < n; i++)
			{
		      array[i] = Integer.parseInt(args[i]);
			}
			int key = Integer.parseInt(args[n]);
			LinearSearch lSearch = new LinearSearch();
			lSearch.linearSearch(array, key);
	}
}
