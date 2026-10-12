// This is slingshot version 3.2.0

/**
 * Demonstration class for MathUtils functionality.
 * This class contains examples of how to use the MathUtils utility methods.
 * 
 * @version 2.0

 * @since 2026-10-05
 */
public final class MathUtilsDemo {

    // CHANGE: Added constant for consistent output formatting
    private static final String SEPARATOR = "=".repeat(50);


    /**
     * Private constructor to prevent instantiation.
     */
    private MathUtilsDemo() {
        throw new UnsupportedOperationException(
            "MathUtilsDemo is a demonstration class and cannot be instantiated"
        );
    }

    
    /**
     * Main method demonstrating the usage of MathUtils methods.
     *

     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // CHANGE: Added welcome message for better user experience
        printHeader("MathUtils Demonstration");

        demonstrateIntegerAddition();
        demonstrateDoubleAddition();
        demonstrateVarargsAddition();
        demonstrateEdgeCases();

        // CHANGE: Added completion message
        printFooter();
    }

    
    /**
     * Demonstrates integer addition functionality.
     */
    private static void demonstrateIntegerAddition() {
        printSectionHeader("Integer Addition");

        // CHANGE: Added more test cases for better demonstration
        executeAndPrint("5 + 3", () -> MathUtils.add(5, 3));
        executeAndPrint("0 + 0", () -> MathUtils.add(0, 0));
        executeAndPrint("-5 + 3", () -> MathUtils.add(-5, 3));
        executeAndPrint("-5 + -3", () -> MathUtils.add(-5, -3));

        System.out.println();
    }

    
    /**
     * Demonstrates double addition functionality.
     */
    private static void demonstrateDoubleAddition() {
        printSectionHeader("Double Addition");

        // CHANGE: Added more test cases including precision scenarios
        executeAndPrint("5.5 + 3.2", () -> MathUtils.add(5.5, 3.2));
        executeAndPrint("0.1 + 0.2", () -> MathUtils.add(0.1, 0.2));
        executeAndPrint("-5.5 + 3.2", () -> MathUtils.add(-5.5, 3.2));
        executeAndPrint("1.0E10 + 2.0E10", () -> MathUtils.add(1.0E10, 2.0E10));

        System.out.println();
    }

    
    /**
     * Demonstrates variable arguments addition functionality.
     */
    private static void demonstrateVarargsAddition() {
        printSectionHeader("Variable Arguments Addition");

        // CHANGE: Enhanced varargs demonstrations with diverse scenarios
        executeAndPrint("1 + 2 + 3 + 4 + 5", () -> MathUtils.add(1, 2, 3, 4, 5));
        executeAndPrint("Empty varargs", () -> MathUtils.add());
        executeAndPrint("Single value: 42", () -> MathUtils.add(42));
        executeAndPrint("10 + 20 + 30", () -> MathUtils.add(10, 20, 30));

        System.out.println();
    }

    
    /**
     * Demonstrates edge cases and error handling.
     */
    private static void demonstrateEdgeCases() {
        printSectionHeader("Edge Cases & Error Handling");

        // CHANGE: Organized edge cases with clear subsections
        System.out.println("Overflow Protection:");
        demonstrateOverflow();

        System.out.println("\nNaN Validation:");
        demonstrateNaNValidation();

        // CHANGE: Added infinity handling demonstration
        System.out.println("\nInfinity Handling:");
        demonstrateInfinityHandling();

        System.out.println();
    }

    // CHANGE: Extracted overflow demonstration into separate method for better organization
    private static void demonstrateOverflow() {
        executeWithExceptionHandling(
            "Integer.MAX_VALUE + 1",
            () -> MathUtils.add(Integer.MAX_VALUE, 1),
            ArithmeticException.class
        );

        executeWithExceptionHandling(
            "Integer.MIN_VALUE + (-1)",
            () -> MathUtils.add(Integer.MIN_VALUE, -1),
            ArithmeticException.class
        );
    }

    // CHANGE: Extracted NaN demonstration into separate method
    private static void demonstrateNaNValidation() {
        executeWithExceptionHandling(
            "NaN + 5.0",
            () -> MathUtils.add(Double.NaN, 5.0),
            IllegalArgumentException.class
        );

        executeWithExceptionHandling(
            "5.0 + NaN",
            () -> MathUtils.add(5.0, Double.NaN),
            IllegalArgumentException.class
        );
    }

    // CHANGE: Added new method to demonstrate infinity handling
    private static void demonstrateInfinityHandling() {
        executeWithExceptionHandling(
            "POSITIVE_INFINITY + 5.0",
            () -> MathUtils.add(Double.POSITIVE_INFINITY, 5.0),
            IllegalArgumentException.class
        );

        executeWithExceptionHandling(
            "NEGATIVE_INFINITY + 5.0",
            () -> MathUtils.add(Double.NEGATIVE_INFINITY, 5.0),
            IllegalArgumentException.class
        );
    }

    // CHANGE: Added utility method for consistent output formatting
    private static void printHeader(String title) {
        System.out.println(SEPARATOR);
        System.out.println(centerText(title, SEPARATOR.length()));
        System.out.println(SEPARATOR);
        System.out.println();
    }

    // CHANGE: Added utility method for section headers
    private static void printSectionHeader(String section) {
        System.out.println("=== " + section + " ===");
    }

    // CHANGE: Added utility method for footer
    private static void printFooter() {
        System.out.println(SEPARATOR);
        System.out.println(centerText("Demonstration Complete", SEPARATOR.length()));
        System.out.println(SEPARATOR);
    }

    // CHANGE: Added utility method to center text
    private static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }

    // CHANGE: Added generic method to execute and print results
    private static <T> void executeAndPrint(String expression, java.util.function.Supplier<T> operation) {
        try {
            T result = operation.get();
            System.out.println(expression + " = " + result);
        } catch (Exception e) {
            System.out.println(expression + " -> Error: " + e.getMessage());
        }
    }

    // CHANGE: Added generic method for exception handling demonstrations
    private static <T> void executeWithExceptionHandling(
            String expression,
            java.util.function.Supplier<T> operation,
            Class<? extends Exception> expectedExceptionType) {
        try {
            System.out.print("Testing " + expression + "... ");
            operation.get();
            System.out.println("UNEXPECTED: No exception thrown");
        } catch (Exception e) {
            if (expectedExceptionType.isInstance(e)) {
                System.out.println("✓ " + expectedExceptionType.getSimpleName() +
                                 " caught: " + e.getMessage());
            } else {
                System.out.println("✗ Unexpected exception: " + e.getClass().getSimpleName() +
                                 " - " + e.getMessage());
            }
        }
    }

}
