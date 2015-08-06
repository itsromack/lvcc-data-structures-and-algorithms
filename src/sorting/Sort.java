package sorting;

public class Sort {
    protected int numbers[];

    public Sort(int[] numbers) {
        this.numbers = numbers;
    }
    
    public void swap(int indexA, int indexB) {
        System.out.println("\t>> Swapping: " + this.numbers[indexA] + " and " + this.numbers[indexB]);
        int tmp = this.numbers[indexA];
        this.numbers[indexA] = this.numbers[indexB];
        this.numbers[indexB] = tmp;
    }
    
    /**
     * Returns the 
     * @param indexA
     * @param indexB
     * @return larger number's index or -1 for equal
     */
    public int compare(int indexA, int indexB) {
        System.out.print("\tComparing: " + this.numbers[indexA] + " and " + this.numbers[indexB] + "... ");
        if (this.numbers[indexA] > this.numbers[indexB]) {
            System.out.println(this.numbers[indexA] + " is larger");
            return indexA;
        } else if (this.numbers[indexA] < this.numbers[indexB]) {
            System.out.println(this.numbers[indexB] + " is larger");
            return indexB;
        } else {
            System.out.println("are just equal");
            return -1;
        }
    }
    
    public void displayNumbers() {
        System.out.println("");
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print(this.numbers[i] + ", ");
        }
    }
}
