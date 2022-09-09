/**
 * This program includes multiple methods to find the different values of triangles given the 3 side lengths.
 * The various methods allow the user to find the area, perimeter, and angles of the triangle.
 * Additonally, the user can check if the triangle is isosceles, equilateral, scalene, right, obtuse, or acute.
 * @author Varun Chauhan
 */

public class MathTriangle {
    
    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * find the area of the corresponding triangle.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return The area of the triangle with these side lengths.
     */
    public static double area(int a, int b, int c) {
        double s = (a + b + c) / 2.0; // semiperimeter to use Heron's Formula

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return Math.round(area * 1000) / 1000.0; // round to nearest 3 decimals
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * find the perimeter of the corresponding triangle.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return The perimeter of the triangle with these side lengths.
     */
    public static int perimeter(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * find the magnitude of the angle (in radians) opposite to the side equal to the
     * first integer input.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return The magnitude of the angle opposite to side a.
     */
    public static double angle(int a, int b, int c) {
        return Math.acos((b*b + c*c - a*a) / (2.0 * c * b)); // law of cosines
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * check if the trinagle is isoscleles (equilateral triangles inclusive).
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return true if triangle is isosceles; false if not.
     */
    public static boolean isIsosceles(int a, int b, int c) {
        return a == b || b == c || a == c;
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * check if the triangle is equilateral.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return true if the triangle is equilateral; false if not.
     */
    public static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * check if the triangle is scalene.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return true if the triangle is scalene; false if not.
     */
    public static boolean isScalene(int a, int b, int c) {
        return a != b && b != c && a != c;
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * check if the triangle is a right triangle.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return true if the triangle is right; false if not.
     */
    public static boolean isRight(int a, int b, int c) {
        if(a == b && b == c) // all equilateral triangles are acute
            return false;
        
        // use the properties of the pythagorean theorem
        if(a >= b && a >= c)
            return a*a == b*b + c*c;
        else if(b >= a && b >= c)
            return b*b == a*a + c*c;
        else
            return c*c == a*a + b*b;
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * check if the triangle is an obtuse triangle.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return true if the triangle is obtuse; false if not.
     */
    public static boolean isObtuse(int a, int b, int c) {
        if(a == b && b == c) // all equilateral triangles are acute
            return false;
        
        // use the properties of the pythagorean theorem
        if(a >= b && a >= c)
            return a*a > b*b + c*c;
        else if(b >= a && b >= c)
            return b*b > a*a + c*c;
        else
            return c*c > a*a + b*b;
    }

    /**
     * Given 3 integer inputs as the side lengths of a triangle, this method will
     * check if the triangle is an acute triangle.
     * @param a First side length.
     * @param b Second side length.
     * @param c Third side length.
     * @return true if the triangle is acute; false if not.
     */
    public static boolean isAcute(int a, int b, int c) {
        if(a == b && b == c) // all equilateral triangles are acute
            return true;
        
        // use the properties of the pythagorean theorem
        if(a >= b && a >= c)
            return a*a < b*b + c*c;
        else if(b >= a && b >= c)
            return b*b < a*a + c*c;
        else
            return c*c < a*a + b*b;
    }
    public static void main(String[] args) {
    }
}
