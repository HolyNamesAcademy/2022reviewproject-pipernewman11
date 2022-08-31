import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeMakerExtraCreditTest {
    @Test
    public void printSquare() throws Exception {
        String[] output = ShapeMaker.PrintSquare(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "* * *", output[0]);
        assertEquals("Line 2", "* * *", output[1]);
        assertEquals("Line 3", "* * *", output[2]);
    }

    @Test
    public void printRectangle() throws Exception {
        String[] output = ShapeMaker.PrintRectangle(4, 3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "* * * *", output[0]);
        assertEquals("Line 2", "* * * *", output[1]);
        assertEquals("Line 3", "* * * *", output[2]);
    }

    @Test
    public void printRightTriangle() throws Exception {
        String[] output = ShapeMaker.PrintRightTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "*", output[0]);
        assertEquals("Line 2", "* *", output[1]);
        assertEquals("Line 3", "* * *", output[2]);
    }

    @Test
    public void printInvertedRightTriangle() throws Exception {
        String[] output = ShapeMaker.PrintInvertedRightTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "* * *", output[0]);
        assertEquals("Line 2", "* *", output[1]);
        assertEquals("Line 3", "*", output[2]);
    }

    @Test
    public void printBackwardsRightTriangle() throws Exception {
        String[] output = ShapeMaker.PrintBackwardsRightTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "    *", output[0]);
        assertEquals("Line 2", "  * *", output[1]);
        assertEquals("Line 3", "* * *", output[2]);
    }

    @Test
    public void printOddEquilateralTriangle() throws Exception {
        String[] output = ShapeMaker.PrintEquilateralTriangle(3).split("\n");

        assertEquals("Number of Lines", 3, output.length);
        assertEquals("Line 1", "  *", output[0]);
        assertEquals("Line 2", " * *", output[1]);
        assertEquals("Line 3", "* * *", output[2]);
    }

    @Test
    public void printEvenEquilateralTriangle() throws Exception {
        String[] output = ShapeMaker.PrintEquilateralTriangle(4).split("\n");

        assertEquals("Number of Lines", 4, output.length);
        assertEquals("Line 1", "   *", output[0]);
        assertEquals("Line 2", "  * *", output[1]);
        assertEquals("Line 3", " * * *", output[2]);
        assertEquals("Line 4", "* * * *", output[3]);
    }
}