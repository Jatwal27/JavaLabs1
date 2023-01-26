import java.util.Scanner;

public class MultiArray {

    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        int index = 0;
        int i = 0;
        int y = 0;
        int[][] intArray = new int[9][10];

        for(index = 0; i < 9; i++)
        {
            for(y = 0; y < 10; y++)
            {
                System.out.println("Enter a number: ");
                intArray[i][y] = userIn.nextInt();
            }
        }
    }
}

