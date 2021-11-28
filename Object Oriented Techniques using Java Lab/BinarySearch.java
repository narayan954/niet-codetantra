package q11045;
public class BinarySearch{
	public void binarySearch(int[] array, int key){
		int beg = 0, end = array.length - 1; 
		while(beg <= end){
			int mid = beg + (end-1) / 2;
			if(array[mid] == key){
				System.out.println("Search element " + key + " is found at position : " + mid);
				return;
			}   
			if(key > array[mid]){ 
				beg = mid + 1; 
			}
			else{
				end = mid - 1;
			}
		}
		System.out.println("Search element " + key + " is not found");
	}
}
	
public class BinarySearchMain{
		public static void main(String[] args){
		int[] array = new int[args.length];
		int n = args.length-1;
		
			for (int i = 0; i < n; i++)
			{
		      array[i] = Integer.parseInt(args[i]);
			}
			int key = Integer.parseInt(args[n]);
			BinarySearch biSearch = new BinarySearch();
			biSearch.binarySearch(array, key);
	}
}
