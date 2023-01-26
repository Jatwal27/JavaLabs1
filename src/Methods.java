import java.util.Scanner;

public class Methods {
        public static void main (String args[]){
            int width, height, area;
            Scanner userIn = new Scanner(System.in);
            System.out.println("Enter the the width of the rectangle: ");
            width = userIn.nextInt();
            System.out.println("Enter the the height of the rectangle: ");
            height = userIn.nextInt();

            calculateArea(int area);
        }
    static int calculateArea(int width, int height) {
        return width*height;
    }
}
