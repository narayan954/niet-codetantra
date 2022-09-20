package q11039;

public class BubbleSorting {

  public void bubbleSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}

public class BubbleSortingMain {

  public static void main(String[] args) {
    int[] array = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      array[i] = Integer.parseInt(args[i]);
    }
    BubbleSorting bSorting = new BubbleSorting();
    bSorting.bubbleSort(array);
  }
}
