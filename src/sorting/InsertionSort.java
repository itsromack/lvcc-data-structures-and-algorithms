package sorting;

/**
 * An implementation of the Insertion Sorting
 * algorithm applied to an array of integers
 * @author LVCC Algorithms
 */
public class InsertionSort extends Sort {
    public InsertionSort(int[] numbers) {
        super(numbers);
    }

    
    public void sortAscending() {
        int x, y, tmp;
        System.out.println("\n\nBegin InsertionSort Algorithm [ASCENDING]");
        for (x = 1; x < this.numbers.length; x++) {
            tmp = this.numbers[x];
            y = x;
            while (y > 0 && this.numbers[y - 1] > tmp) {
                this.numbers[y] = this.numbers[y - 1];
                y--;
            }
            this.numbers[y] = tmp;
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }

    public void sortDescending() {
        int x, y, tmp;
        System.out.println("\n\nBegin InsertionSort Algorithm [DESCENDING]");
        for (x = 1; x < this.numbers.length; x++) {
            tmp = this.numbers[x];
            y = x;
            while (y > 0 && this.numbers[y - 1] < tmp) {
                this.numbers[y] = this.numbers[y - 1];
                y--;
            }
            this.numbers[y] = tmp;
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }

}
