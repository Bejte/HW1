/**
 * HW1
 */
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an array size: ");
        int size = in.nextInt();

        int[] array = HW1.createArray(size);
        System.out.println("Array is :");
        System.out.print("{");
                for(int i = 0; i< array.length ; i++)
                {
                    if(i == array.length - 1)
                    {
                        System.out.print(array[i] + "}");
                    }
                    else
                    {    
                        System.out.print(array[i] + ", ");
                    }
                }
        System.out.println();

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
                // Display the maximum and the minimum of the array TODO
                case 1:{
                    break;
                }
            
                // Display how each element of the array differs from the average TODO
                case 2:{
                    break;
                }

                // Display the sum of odd elements and the sum of even elements TODO
                case 3:{
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