import java.util.Scanner;
public class Loop {

    public static void main (String args[]){

        Scanner console = new Scanner(System.in);

        int number;
        int posNum = 0;
        int negNum = 0;
        int zero = 0;
        char choice;

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
