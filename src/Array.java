import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        int index = 0;
        int sum = 0;
        int[] intArray = new int[10];

        while (index < 10);{
            System.out.println("Enter the number: ");
            intArray[index] = userIn.nextInt();
            sum = sum + intArray[index];
            index ++;
        }

    }
}
