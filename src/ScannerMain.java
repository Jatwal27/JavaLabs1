import java.util.Scanner;
public class ScannerMain {
    public static void main(String[] args){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("your age is "+age+".");

        if (age > 0 & age <= 5){
            System.out.println("You are an infant.");
        }
        else if (age > 5 & age <= 17){
            System.out.println("You are a child.");
        }
        else if (age >= 18){
            System.out.println("You are an adult.");
        }
        else {
            System.out.println("Your age is invalid.");
        }
    }
}
