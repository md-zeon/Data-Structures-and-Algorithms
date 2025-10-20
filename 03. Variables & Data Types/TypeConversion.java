public class TypeConversion {
    public static void main(String[] args) {
        // Example of Implicit Casting (Widening)
        int intValue = 100;
        float floatValue = intValue; // int to float
        System.out.println("Implicit Casting (int to float): " + floatValue);

        // Example of Explicit Casting (Narrowing)
        float anotherFloatValue = 9.78f;
        int anotherIntValue = (int) anotherFloatValue; // float to int
        System.out.println("Explicit Casting (float to int): " + anotherIntValue);

        // Demonstrating type conversion in arithmetic operations
        byte byteValue = 10;
        short shortValue = 20;
        int sum = byteValue + shortValue; // byte and short are promoted to int
        System.out.println("Sum of byte and short (promoted to int): " + sum);

        // Converting String to Integer
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("String to Integer: " + parsedInt);

        // Converting Integer to String
        int number = 456;
        String convertedString = Integer.toString(number);
        System.out.println("Integer to String: " + convertedString);
    }
}

/*
 * Type Conversion happens when:
 *  a. type compatible
 *  b. destination type > source type (widening)
 *  c. explicit casting for narrowing conversion
 * 
 * byte -> short -> int -> float -> long -> double
 * 
    * Examples:
    * 1. Implicit Casting (Widening):
    *    int to float
    *    char to int
    * 2. Explicit Casting (Narrowing):
    *    float to int
    *    double to float
   
    * Note:
    * - Implicit casting is done automatically by the compiler when converting a smaller data type to a larger data type.
    * - Explicit casting requires the programmer to specify the target data type in parentheses before the value
    * - Lossy conversion can occur during explicit casting if the value being cast is outside the range of the target data type.
    
 */
