
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestSorts {
    
    public static void test(int []numbers, int size, String title){
              long startTime, duration;

      /* initial call to quicksort with index */
      startTime = System.nanoTime();
      InsertionSort.insertionSort(numbers, size);
      duration = (System.nanoTime() - startTime)/1000;
      System.out.print(title + "\tInsertion Sort:" + duration + "\t");

      startTime = System.nanoTime();
      SelectionSort.selectionSort(numbers, size);
      duration = (System.nanoTime() - startTime)/1000;
      System.out.print("Selection Sort:" + duration + "\t");
      
      startTime = System.nanoTime();
      MergeSort.mergeSort(numbers, 0, size-1);
      duration = (System.nanoTime() - startTime)/1000;
      System.out.print("Merge Sort:" + duration + "\t");
      
      startTime = System.nanoTime();
      BubbleSort.bubbleSort(numbers, size);
      duration = (System.nanoTime() - startTime)/1000;
      System.out.print("Bubble Sort:" + duration + "\t");
      System.out.println();
    }
    
    public static ArrayList<Integer> generateRandoms(int k, int order){
        ArrayList<Integer> randList = new ArrayList<Integer>();
        Random rand = new Random(); 
        
        for (int i = 0; i < k; i++){
            randList.add(rand.nextInt(k));
        }
        
        if (order == 0) return randList;
        else{
            if (order == 1)
                Collections.sort(randList); 
            else if (order == -1)
                Collections.sort(randList, Collections.reverseOrder());
            
            return randList;
        }
    }
    
    public static void main(String [] args) {
        int numbers [] = {10, 2, 78, 4, 45, 32, 7, 11};
        final int NUMBERS_SIZE = 8;

        TestSorts.test(numbers, NUMBERS_SIZE, "Short list test");
      
        // Iteratively generate a sequence of random numbers
        // pass these numbers to our three sort algorithms and retrieve their runtimes in machine.
        int size = 0;
        ArrayList<Integer> list;
        for (int i = 1; i<=1000; i++){
            size = i * 100;
            list = generateRandoms(size, 0);
            int[] arr = new int[list.size()];
            for(int j = 0; j < list.size(); j++) {
                if (list.get(j) != null) {
                    arr[j] = list.get(j);
                }
            }
            TestSorts.test(arr, size, "Size of random numbers:" + size);
      } 
      
   }
}
