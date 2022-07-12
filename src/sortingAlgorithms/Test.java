package sortingAlgorithms;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5,2,7,5,9,0,3};
        System.out.print("Before Sorting :");
        for(int i : arr) System.out.print(" "+i);
        InsertionSort.ascending(arr);
        System.out.print("\nAfter Sorting : ");
        for(int i : arr) System.out.print(" "+i);
    }
}
