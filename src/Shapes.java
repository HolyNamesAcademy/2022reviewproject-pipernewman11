import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int length = scanner.nextInt();
        System.out.print("Enter a height: ");
        int height = scanner.nextInt();

        System.out.println(ShapeMaker.PrintSquare(length));
        System.out.println(ShapeMaker.PrintRectangle(length, height));
        System.out.println(ShapeMaker.PrintRightTriangle(height));
        System.out.println(ShapeMaker.PrintInvertedRightTriangle(height));
        System.out.println(ShapeMaker.PrintBackwardsRightTriangle(height));
        System.out.println(ShapeMaker.PrintEquilateralTriangle(height));
    }
}