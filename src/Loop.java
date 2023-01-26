import java.util.Scanner;
public class Loop {

    public static void main (String args[]){

        Scanner console = new Scanner(System.in);

        int number;
        int posNum = 0;
        int negNum = 0;
        int zero = 0;
        char choice;
https://code-with-me.global.jetbrains.com/djXrfEo_BSpHBFSP9aUEbQ#p=IU&fp=EE1B06412EAAF59C7239A8B83C2A288D8BF2B49BD68FA15188C6383340B46DAE
        do
        {
            System.out.print("Enter the number: ");
            number = console.nextInt();

            if (number > 0){
                posNum++;
            }
            else if (number < 0){
                negNum++;
            }
            else {
                zero++;
            }
            System.out.print("Do you want to keep going?(y/n): ");
            choice = console.next().charAt(0);
        } while (choice == 'y');

        System.out.print("There is "+posNum+" positive numbers.\n");
        System.out.print("There is "+negNum+" negative numbers.\n");
        System.out.print("There is "+zero+" zero numbers.\n");
    }
}
