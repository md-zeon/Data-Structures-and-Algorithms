public class DataTypes {
    public static void main(String[] args) {
        // Integer data types
        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 100000;
        long longVar = 100000L;

        // Floating-point data types
        float floatVar = 10.5f;
        double doubleVar = 20.99;

        // Character data type
        char charVar = 'A';

        // Boolean data type
        boolean boolVar = true;

        // Print the variables
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Integer Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Character Value: " + charVar);
        System.out.println("Boolean Value: " + boolVar);

        // There are also Non-primitive data types like Strings, Arrays, Classes,
        // Objects, and Interfaces.
    }
}

/*
 * Java is a statically-typed programming language, which means that
 * variables must be declared with a specific data type before they can be used.
 * This helps catch errors at compile-time and ensures type safety.
 * 
 * Data Types in Java:
 * 1. Primitive Data Types:
 * - byte: 8-bit integer (-128 to 127)
 * - short: 16-bit integer (-32,768 to 32,767)
 * - int: 32-bit integer (-2,147,483,648 to 2,147,483,647)
 * - long: 64-bit integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
 * - float: 32-bit floating point (-3.40282347E+38 to 3.40282347E+38)
 * - double: 64-bit floating point (-1.7976931348623157E+308 to 1.7976931348623157E+308)
 * - char: 16-bit Unicode character (0 to 65,535)
 * - boolean: true/false value (1 bit)
 * 
 * 2. Non-Primitive Data Types:
 * - String: A sequence of characters (e.g., "Hello")
 * - Array: A collection of similar types (e.g., int[] numbers = {1, 2, 3};)
 * - Class: A blueprint for creating objects (e.g., class Car {})
 * - Object: An instance of a class (e.g., Car myCar = new Car();)
 * - Interface: A contract for classes (e.g., interface Animal {})
 */