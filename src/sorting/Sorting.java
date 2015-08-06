package sorting;

public class Sorting {
    public static void main(String[] args)
    {
        int[] numbers = {9, 1, 3, 6, 2, 7, 8, 5, 4, 0};

        System.out.println("Original Arrangement of Numbers");
        Sorting.print(numbers, 0);
        
        // Bubble Sorting Algorithm
        BubbleSort bubble = new BubbleSort(numbers);
        bubble.sortAscending();
        bubble.sortDescending();
        
        // Selection Sorting Algorithm
        SelectionSort selection = new SelectionSort(numbers);
        selection.sortAscending();
        selection.sortDescending();
        
        // Insertion Sorting Algorithm
        InsertionSort insertion = new InsertionSort(numbers);
        insertion.sortAscending();
        insertion.sortDescending();
        
        // Quick Sorting Algorithm
        QuickSort quick = new QuickSort(numbers);
        quick.sortAscending();
        quick.displayNumbers();
    }
    
    public static void print(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            System.out.print(numbers[numbers.length - 1] + ", ");
        } else {
            System.out.print(numbers[i] + ", ");
            Sorting.print(numbers, i + 1);
        }
    }
}
