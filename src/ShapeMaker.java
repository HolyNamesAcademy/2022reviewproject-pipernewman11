
public class ShapeMaker {
    /*
    Prints a square with sides of size "size". If size = 5, the square looks like this:

        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
     */
    public static String PrintSquare(int size)
    {
        String output = "";
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                output += "* ";
            }
            output += "\n";
        }

        return output;
    }

    /*
    Prints a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:

        * * * * *
        * * * * *
        * * * * *
        * * * * *
     */
    public static String PrintRectangle(int length, int height)
    {
        // write your code here

        return "";
    }

    /*
    Prints a right triangle with sides of size "size". If size = 5, the triangle looks like this:

        *
        * *
        * * *
        * * * *
        * * * * *
     */
    public static String PrintRightTriangle(int height)
    {
        // write your code here

        return "";
    }

    /*
    Prints an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:

        * * * * *
        * * * *
        * * *
        * *
        *
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        // write your code here

        return "";
    }

        /*
    Prints a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:

                *
              * *
            * * *
          * * * *
        * * * * *
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        // write your code here

        return "";
    }

    /*
    Prints an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:

            *
           * *
          * * *
         * * * *
        * * * * *
     */
    public static String PrintEquilateralTriangle(int height)
    {
        // write your code here

        return "";
    }
}
