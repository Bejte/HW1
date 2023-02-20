/**
 * HW1
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW1 {

    public static int[] createArray(int a)
    {
        int[] array = new int[a];
        Random rand = new Random();
        for(int i=0; i < a ; i++)
        {
            array[i] = rand.nextInt(100);
        }
        return array;
    }
     public static int getMinimum(int[] array){
        int minimum=array[0];
        for(int i=0;i<array.length;i++){
            if(minimum>array[i]){
                minimum=array[i];
            }
        }
        return minimum;}
    public static int getMaximum(int[] array){
        int maximum=array[0];
        for(int i=0;i<array.length;i++){
            if(maximum<array[i]){
                maximum=array[i];
            }
        }
        return maximum;

    }
    
    public static int [] displayVariance(int [] array) {
        int arraySum = 0;
        for (int el : array) {
            arraySum += el;
        }
        int average = arraySum / array.length;

        int [] varienceArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            varienceArray[i] = array[i] - average;
        } 
        return varienceArray;
    }
    public static void displaySums(int [] numbers){
        int sumofEven = 0;
        System.out.print("Sum of the even indexes is : ");

        for(int i=0;i<numbers.length;i=i+2){
            sumofEven = sumofEven + numbers[i];
        }
        System.out.println(sumofEven);

        int sumofOdd = 0;
        System.out.print("Sum of the odd indexes is : ");

        for(int i=1;i<numbers.length;i=i+2){
            sumofOdd = sumofOdd + numbers[i];

        }
        System.out.println(sumofOdd);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an array size: ");
        int size = in.nextInt();

        int[] array = HW1.createArray(size);
        System.out.println("Array is : " + Arrays.toString(array));

        boolean finished = false;
        
        while (!finished)
        {
            System.out.println("Options:");
            System.out.println("1- Display the maximum and the minimum of the array");
            System.out.println("2- Display how each element of the array differs from the average");
            System.out.println("3- Display the sum of odd elements and the sum of even elements");
            System.out.println("4- Quit");

            System.out.print("Please choose an option: ");
            int option = in.nextInt();

            switch (option){
                
                case 1:{
                    System.out.println("Minimum value of the array : "+getMinimum(array));
                    System.out.println("Maximum value of the array : "+getMaximum(array));
                    
                    break;
                }
            
                // Display how each element of the array differs from the average 
                case 2:{
                    String output = "The difference of elements in " + Arrays.toString(array) + " from average are " + Arrays.toString(displayVariance(array));
                    System.out.println(output);
                }

                // Display the sum of odd elements and the sum of even elements TODO
                case 3:{
                    displaySums(array);
                    break;
                }

                // Quit
                case 4:{
                    finished = true;
                    break;
                }
            }
        }
        System.out.println("Bye bye!");
    }
}
