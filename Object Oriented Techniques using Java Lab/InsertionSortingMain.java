package q11040;
class InsertionSorting {
	public void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i - 1; 
			int key = a[i];  
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];   
				j -= 1;           
			}                    
			a[j + 1] = key;       
		}
		for (int item: a) { 
			System.out.println(item);
		}                  
	}                      
}
public class InsertionSortingMain{
		public static void main(String[] args) {
			int[] array = new int[args.length];
			for (int i = 0; i < args.length; i++)
			{
		     array[i] = Integer.parseInt(args[i]);
			}
			InsertionSorting inSorting = new InsertionSorting();
			inSorting.insertionSort(array);
	}
}
