import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeMakerTest {
    @Test
    public void printSquare() throws Exception {
        String[] output = ShapeMaker.PrintSquare(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "* * *", trimRight(output[0]));
        assertEquals("Line 2", "* * *", trimRight(output[1]));
        assertEquals("Line 3", "* * *", trimRight(output[2]));
    }

    @Test
    public void printRectangle() throws Exception {
        String[] output = ShapeMaker.PrintRectangle(4, 3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "* * * *", trimRight(output[0]));
        assertEquals("Line 2", "* * * *", trimRight(output[1]));
        assertEquals("Line 3", "* * * *", trimRight(output[2]));
    }

    @Test
    public void printRightTriangle() throws Exception {
        String[] output = ShapeMaker.PrintRightTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "*", trimRight(output[0]));
        assertEquals("Line 2", "* *", trimRight(output[1]));
        assertEquals("Line 3", "* * *", trimRight(output[2]));
    }

    @Test
    public void printInvertedRightTriangle() throws Exception {
        String[] output = ShapeMaker.PrintInvertedRightTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "* * *", trimRight(output[0]));
        assertEquals("Line 2", "* *", trimRight(output[1]));
        assertEquals("Line 3", "*", trimRight(output[2]));
    }

    @Test
    public void printBackwardsRightTriangle() throws Exception {
        String[] output = ShapeMaker.PrintBackwardsRightTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "    *", trimRight(output[0]));
        assertEquals("Line 2", "  * *", trimRight(output[1]));
        assertEquals("Line 3", "* * *", trimRight(output[2]));
    }

    @Test
    public void printOddEquilateralTriangle() throws Exception {
        String[] output = ShapeMaker.PrintEquilateralTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "  *", trimRight(output[0]));
        assertEquals("Line 2", " * *", trimRight(output[1]));
        assertEquals("Line 3", "* * *", trimRight(output[2]));
    }

    @Test
    public void printEvenEquilateralTriangle() throws Exception {
        String[] output = ShapeMaker.PrintEquilateralTriangle(4).split("\n");

        assertEquals("Number of Lines", 4, output.length);
        assertEquals("Line 1", "   *", trimRight(output[0]));
        assertEquals("Line 2", "  * *", trimRight(output[1]));
        assertEquals("Line 3", " * * *", trimRight(output[2]));
        assertEquals("Line 4", "* * * *", trimRight(output[3]));
    }

    private static String trimRight(String input) {
        return input.substring(0, input.lastIndexOf('*') + 1);
    }

}