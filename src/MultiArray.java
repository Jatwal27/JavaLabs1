import java.util.Scanner;

public class MultiArray {

    public static void main(String[] args){
        int[][] intArray;
        intArray = new int[9][10];

        for(int i = 1; i < 9; i++){
            for(int j = 1; j < 10; j++){
                intArray[i-1][j-1]=j*i;
                if (intArray[i-1][j-1]<10){
                    System.out.println(" "+intArray[i-1][j-1]+" | ");
                }
                else
                    System.out.println(""+intArray[i-1][j-1]+" | ");
            }
            System.out.println();
        }
    }
}

