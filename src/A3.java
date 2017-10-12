/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A3 {
    
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp; 
    }
    
    // question 1
    public void newSelectionSort(int[] array) {
        // only swap once the absolute smallest number is found
        for (int pos = 0; pos < array.length; pos++) {
            // identify the lowest number and its position in the array
            int lowestNumberPosition = pos;
            int lowestNumber = array[pos];
            // go through the array after going through each position
            for (int i = pos + 1; i < array.length; i++) {
                // find the absolute lowest number
                if(lowestNumber > array[i]){
                    lowestNumberPosition = i;
                    lowestNumber = array[i];
                }
                }
            // put lowest number in its position after it's gone through the array and been found
            swap(array, pos, lowestNumberPosition);
            }
        }

    // question 2
    public int smallestMissingNumber(int[] array){
        // start with lowest number possible, zero
        int missingNumber = 0;
        // go through the entire array
        for (int i = 0; i < array.length; i++) {
            // if numbers match add 1 and then start checking again
            if(missingNumber == array[i]){
                missingNumber++;
            }
        }
        // return the missing number
        return missingNumber;
    }
    
    // question 3
    public int countOnes(int[] array){
        // start with lowest number
        int total = 0;
        // go through the entire array
        for (int i = 0; i < array.length; i++) {
        // see if there is a 1. if there is a 1 add it to the total
            if(array[i] == 1){
                total++;
            }
        }
        // return the total amount
        return total;
    }
    
    // question 4
    public void countingSort(int[] array){
        // track the position
        int sortedPosition = 0;
        // create the large array
        int[] countingSort = new int[101];
        // go through the array and add 1 to numbers in their place 
        for (int i = 0; i < array.length; i++) {
        }
        // go through the array
        for (int i = 0; i < countingSort.length; i++) {
            // counts the amount of the same numbers
            int counter = countingSort[i];
            // after i changes go through the array again
            for (int k = 0; k < counter; k++) {
                // add 1 to the sorted position to keep moving
                sortedPosition++;
                // sort the numbers based on how many of each there are
                array[sortedPosition] = i;
            }
        }
    }
    

    public void swapL(int p1, String word) {
        int temp = p1;
        p1 = p1;
        p1 = temp; 
    }
    // question 5
    public void alphabeticalOrder(String[] array){
        // start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            //store the position behind the one youre looking at 
            int position = i - 1;
            // the current word you are looking at
            String word = array[i];
            
            while(position >= 0){
                // if the word is a greater value than zero the loop must break
                if(word.compareTo(array[position]) > 0){
                    break;
            }else{
                    // if the word is not a greater value than zero switch the words and move on
                    array[position + 1] = array[position];
                    position--;
                }
            }
            // switch the array position and the word
            
            swapL(position, word);
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3 test = new A3();

        // make a random array of ints
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
        }
        // BEFORE
        System.out.println("NEW SELECTION SORT: ");
        System.out.println("BEFORE: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // SORT HERE
       test.newSelectionSort(numbers);
        // AFTER
        System.out.println("AFTER: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        
        
        System.out.println("SMALLEST MISSING NUMBER: ");
        System.out.println(test.smallestMissingNumber(numbers));
        
        
        // BEFORE
        int[] bnums = new int[5];
        System.out.println("COUNT ONES");
        System.out.println("BEFORE: ");
        for (int i = 0; i < bnums.length; i++) {
            System.out.println(bnums[i]);
        }
        // SORT HERE
        System.out.println("AFTER: ");
        System.out.println(test.countOnes(bnums));
        
        
        
        
        // make a random array of ints
        int[] num = new int[101];
        for (int i = 0; i < num.length; i++) {
            // make a random number
            num[i] = (int) (Math.random() * 101);
        }
        // BEFORE
        System.out.println("COUNTING SORT: ");
        System.out.println("BEFORE: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        // SORT HERE
       test.countingSort(num);
        // AFTER
        System.out.println("AFTER: ");
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
        
        
        
        System.out.println("ALPHABETICAL ORDER: ");
        // make a random array of ints
        String[] abcd = {"abc", "bca", "tth", "tht", "ugh", "hug", "ick", "kic", "vfg"};
        // BEFORE
        System.out.println("BEFORE: ");
        for (int i = 0; i < abcd.length; i++) {
            System.out.println(abcd[i]);
        }
        // SORT HERE
        test.alphabeticalOrder(abcd);
        // AFTER
        System.out.println("AFTER: ");
        for (int i = 0; i < abcd.length; i++) {
            System.out.println(abcd[i]);
        }
    }
}
