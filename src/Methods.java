import java.util.Scanner;
public class Methods {
    public static void main (String[] args){
        int l, w;
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the the width of the rectangle: ");
        w = userIn.nextInt();
        System.out.println("Enter the the length of the rectangle: ");
        l = userIn.nextInt();
        Rectangle r = new Rectangle(l,w);
        System.out.println("Area : "+r.calculateArea());
    }
}
class Rectangle {
    int length;
    int width;
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    public int calculateArea() {
        return length*width;
    }
}

