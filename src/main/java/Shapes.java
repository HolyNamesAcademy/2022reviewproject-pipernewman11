import java.util.Scanner;

public class Shapes {
    public static void Run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int length = scanner.nextInt();
        System.out.print("Enter a height: ");
        int height = scanner.nextInt();

        System.out.println("Square:");
        System.out.println(ShapeMaker.PrintSquare(length));

        System.out.println("Rectangle:");
        System.out.println(ShapeMaker.PrintRectangle(length, height));

        System.out.println("Right Triangle:");
        System.out.println(ShapeMaker.PrintRightTriangle(height));

        System.out.println("Inverted Right Triangle:");
        System.out.println(ShapeMaker.PrintInvertedRightTriangle(height));

        System.out.println("Backwards Right Triangle:");
        System.out.println(ShapeMaker.PrintBackwardsRightTriangle(height));

        System.out.println("Equilateral Triangle:");
        System.out.println(ShapeMaker.PrintEquilateralTriangle(height));
    }
}