public class Variables {
    public static void main(String[] args) {
        // Declare and initialize variables of different data types
        int age = 23;
        double height = 5.7;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Zeanur Rahaman Zeon";

        // Print the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
    }
}

/*
 * Variables in Java are used to store data that can be used and manipulated throughout a program.
 * There are several data types in Java, including:
 * - int: for integer values
 * - double: for floating-point values
 * - char: for single characters
 * - boolean: for true/false values
 * - String: for sequences of characters
 * Each variable must be declared with a specific data type before it can be used.
 * Variables can be initialized with a value at the time of declaration or assigned a value later in the code.
 * Variables are essential for storing user input, performing calculations, and managing program state.
 * 
 * Example:
 *  2 * (a + b)
 * where 'a' and 'b' are variables storing numeric values, and 2 is a literal.
 * Literals are fixed values that do not change.
 * Examples of literals include:
 * - Numeric literals: 10, 3.14
 * - Character literals: 'A', 'z'
 * - String literals: "Hello, World!"
 * - Boolean literals: true, false
 * 
 * In summary, variables and literals are fundamental concepts in programming that allow developers to store, manipulate, and utilize data effectively.
 * 
 * Identifiers:
 * Identifiers are names given to variables, methods, classes, and other entities in Java.
 * They must begin with a letter (A-Z or a-z), a dollar sign ($), or an underscore (_), followed by letters, digits (0-9), dollar signs, or underscores.
 * Identifiers cannot be the same as Java reserved keywords (e.g., int, class, public).
 * Identifiers are case-sensitive, meaning 'Variable' and 'variable' would be considered different
 * Examples of valid identifiers: myVariable, _temp, $amount1
 * Examples of invalid identifiers: 1stVariable, my-variable, class
 * 
 * Memory Allocation:
 * When a variable is declared, memory is allocated to store the value of that variable. The amount of memory allocated depends on the data type of the variable.
 * For example, an 'int' typically requires 4 bytes of memory, while a 'double' requires 8 bytes.
 * When a variable is no longer needed, the memory can be reclaimed by the Java Garbage Collector.
 */
