package sorting;

/**
 * An implementation of the Selection Sorting
 * algorithm applied to an array of integers
 * @author LVCC Algorithms
 */
public class SelectionSort extends Sort {

    public SelectionSort(int[] numbers) {
        super(numbers);
    }

    public void sortAscending() {
        System.out.println("\n\nBegin SelectionSort Algorithm [ASCENDING]");
        for (int x = 0; x < this.numbers.length - 1; x++) {
            int index = x;
            for (int y = x + 1; y < this.numbers.length; y++) {
                if (this.compare(index, y) == index) {
                    this.swap(index, y);
                }
            }
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }

    public void sortDescending() {
        System.out.println("\n\nBegin SelectionSort Algorithm [DESCENDING]");
        for (int x = 0; x < this.numbers.length - 1; x++) {
            int index = x;
            for (int y = x + 1; y < this.numbers.length; y++) {
                if (this.compare(y, index) == y) {
                    this.swap(y, index);
                }
            }
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }
    
}
