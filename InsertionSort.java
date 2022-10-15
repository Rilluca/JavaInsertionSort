import java.util.Random; //import random number

public class InsertionSort {

    public static void main(String[] args) {

        Random rand = new Random(); //generate random numbers
        int[] numbers = new int[100]; 

        for(int i=0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); //an array of 10 random 0 to 100 integers
        }

    System.out.println("Before:");
    printArray(numbers);

    insertionSort(numbers); //quick sort

    System.out.println("\nAfter:");
    printArray(numbers);

    }

    private static void insertionSort(int[] inputArray) {

        for(int i = 1; i < inputArray.length; i++) {
			
			int currentValue = inputArray[i];
			int j = i - 1;

			while (j >= 0 && inputArray[j] > currentValue) {
				inputArray[j + 1] = inputArray[j];
				j--;
			}

			inputArray[j + 1] = currentValue;
		}
        
    }

    private static void printArray(int[] numbers) { //print array

        if (numbers.length >= 1) {
            System.out.print(numbers[0]);
        }

        for (int i = 1; i < numbers.length; i++) {
            System.out.print(", " + numbers[i]);
        }

    }

}