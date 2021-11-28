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
