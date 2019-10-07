import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nInsert HEIGHT value of a triangle : ");
        double height = in.nextDouble();
        System.out.print("Insert BASE value of a triangle : ");
        double base = in.nextDouble();

        double area = ((base * height) / 2);

        System.out.printf("\nThe area of a triangle with a height and base of %.1f and ", height);
        System.out.printf("%.1f", base);
        System.out.printf(" is %.1f", area);
        in.close();
      }
}
