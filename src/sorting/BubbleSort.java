package sorting;

/**
 * An implementation of the Bubble Sorting
 * algorithm applied to an array of integers
 * @author LVCC Algorithms
 */
public class BubbleSort extends Sort {

    public BubbleSort(int[] numbers) {
        super(numbers);
    }

    public void sortAscending() {
        System.out.println("\n\nBegin BubbleSort Algorithm [ASCENDING]");
        for (int x = 0; x < this.numbers.length - 1; x++) {
            for (int y = 0; y < this.numbers.length - 1; y++) {
                if (this.compare(y, y + 1) == y) {
                    this.swap(y, y + 1);
                }
            }
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }

    public void sortDescending() {
        System.out.println("\n\nBegin BubbleSort Algorithm [DESCENDING]");
        for (int x = 0; x < this.numbers.length - 1; x++) {
            for (int y = 0; y < this.numbers.length - 1; y++) {
                if (this.compare(y + 1, y) == y + 1) {
                    this.swap(y + 1, y);
                }
            }
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }
}
