// This is slingshot version 3.2.0

/**
 * Utility class for mathematical operations
 */
public class MathUtils {
    
    /**
     * Adds two integers and returns the result
     * 
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Adds two double values and returns the result
     * 
     * @param a first double value
     * @param b second double value
     * @return sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Adds multiple integers and returns the result
     * 
     * @param numbers variable number of integers
     * @return sum of all numbers
     */
    public static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Main method for testing the addition methods
     */
    public static void main(String[] args) {
        // Test integer addition
        System.out.println("5 + 3 = " + add(5, 3));
        
        // Test double addition
        System.out.println("5.5 + 3.2 = " + add(5.5, 3.2));
        
        // Test variable arguments addition
        System.out.println("1 + 2 + 3 + 4 + 5 = " + add(1, 2, 3, 4, 5));
    }
}
