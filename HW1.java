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
    }
}