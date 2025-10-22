import java.util.Scanner;

public class JavaBasics {
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    // Return type: void, Parameters: none
    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        sc.close();
    }

    // Return type: void, Parameters: two integers
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    // Return type: int, Parameters: two integers
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void swapValues(int a, int b) {
        System.out.println("Inside swapValues method:");
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Find product of two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Calculate the factorial of a number n
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Find Binomial Coefficient C(n, r)
    // Formula: C(n, r) = n! / (r! * (n - r)!)
    public static int binomialCoefficient(int n, int r) {
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid values for n and r.");
            return -1;
        }

        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);
        return numerator / denominator;
    }

    // Function Overloading example
    public static void printValue(int a) {
        System.out.println("Integer: " + a);
    }

    public static void printValue(double a) {
        System.out.println("Double: " + a);
    }

    public static void printValue(String a) {
        System.out.println("String: " + a);
    }

    // SUM
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Convert from Binary to Decimal
    public static void binaryToDecimal(int binaryNum) {
        int myNum = binaryNum; // Store original binary number for printing
        int pow = 0;
        int decimalNum = 0;
        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decimalNum += lastDigit * (int) Math.pow(2, pow);
            pow++;
            binaryNum /= 10;
        }

        System.out.println("The decimal equivalent of binary " + myNum + " is: " + decimalNum);
    }

    // Convert from Decimal to Binary
    public static void decimalToBinary(int decimalNum) {
        int myNum = decimalNum; // Store original decimal number for printing
        int pow = 0;
        int binaryNum = 0;
        while (decimalNum > 0) {
            int remainder = decimalNum % 2;
            binaryNum += remainder * (int) Math.pow(10, pow);
            pow++;
            decimalNum /= 2;
        }
        System.out.println("The binary equivalent of decimal " + myNum + " is: " + binaryNum);
    }

    public static void main(String[] args) {
        printHelloWorld();
        printHelloWorld();
        calculateSum();
        printSum(5, 10);
        int result = getSum(7, 3);
        System.out.println("The returned sum is: " + result);
        int x = 15;
        int y = 25;
        swapValues(x, y);
        System.out.println("In main after swapValues call: x = " + x + ", y = " + y);
        System.out.println("Conclusion: Primitive types are passed by value in Java.");
        int product = multiply(4, 5);
        System.out.println("The product is: " + product);
        int num = 5;
        int fact = factorial(num);
        if (fact != -1) {
            System.out.println("The factorial of " + num + " is: " + fact);
        }
        int n = 5;
        int r = 2;
        int binomCoeff = binomialCoefficient(n, r);
        if (binomCoeff != -1) {
            System.out.println("The Binomial Coefficient C(" + n + ", " + r + ") is: " + binomCoeff);
        }

        printValue(10);
        printValue(10.5);
        printValue("Hello");
        System.out.println("Sum of 2 integers: " + sum(3, 7));
        System.out.println("Sum of 3 integers: " + sum(3, 7, 2));
        System.out.println("Sum of 2 doubles: " + sum(5.5, 4.5));
        System.out.println("Sum of 2 floats: " + sum(2.5f, 3.5f));
        int primeCheck = 29;
        System.out.println(
                isPrime(primeCheck) ? primeCheck + " is a prime number."
                        : primeCheck + " is not a prime number.");
        printPrimesInRange(10, 50);
        binaryToDecimal(1101);
        decimalToBinary(13);
        
    }
}

/*
 * Functions in Java:
 * - A function (or method) is a block of code that performs a specific task.
 * - Functions help in code reusability, organization, and modularity.
 * - Functions can take inputs (parameters) and can return outputs (return
 * values).
 * - Functions can be called (invoked) from other parts of the code to execute
 * the defined task.
 * 
 * - Functions are defined using the following syntax:
 * returnType functionName(parameter1Type parameter1Name, parameter2Type
 * parameter2Name, ...) {
 * // function body
 * }
 * 
 * - Example:
 * public static int add(int a, int b) {
 * return a + b;
 * }
 * 
 * - To call the function:
 * int sum = add(5, 10);
 * 
 * - Functions can have zero or more parameters.
 * - The return type can be any valid data type or void if no value is returned.
 * 
 * - Functions can be categorized into:
 * 1. Void Functions: Do not return any value.
 * 2. Non-Void Functions: Return a value of a specified type.
 * 
 * - Functions can also have different access modifiers (public, private,
 * protected) to control their visibility.
 * - Functions can be overloaded by defining multiple functions with the same
 * name but different parameter lists.
 * - Example of Function Overloading:
 * public static int add(int a, int b) {
 * return a + b;
 * }
 * public static double add(double a, double b) {
 * return a + b;
 * }
 * 
 * - Recursion: A function can call itself to solve a problem in a smaller
 * subproblem.
 * Example:
 * public static int factorial(int n) {
 * if (n == 0) {
 * return 1;
 * } else {
 * return n * factorial(n - 1);
 * }
 * }
 * 
 * main function in Java:
 * - The main function is the entry point of any Java application.
 * - It has the following signature:
 * public static void main(String[] args) {
 * // code to be executed
 * }
 * - The main function must be declared as public and static.
 * - The return type of the main function is void, meaning it does not return
 * any value.
 * - The main function is where the program starts executing.
 * - It can call other functions defined in the class or other classes.
 * - The main function can also accept command-line arguments through the String
 * array parameter.
 * 
 * 
 * main takeaways:
 * - Functions are essential for structuring code in Java.
 * - They enhance code readability and maintainability.
 * - Understanding functions is crucial for effective programming in Java.
 * - The main function is the entry point of any Java application.
 * 
 * functions vs methods:
 * - In Java, the terms "function" and "method" are often used interchangeably.
 * - However, technically, a method is a function that is associated with an
 * object or class.
 * - All methods are functions, but not all functions are methods.
 * - Functions can exist independently, while methods are always part of a
 * class.
 * - In Java, since everything is encapsulated within classes, we typically
 * refer
 * to them as methods.
 * 
 * 
 * parameters vs arguments:
 * - Parameters are the variables defined in the function/method signature that
 * accept values when the function/method is called.
 * - Arguments are the actual values passed to the function/method when it is
 * invoked.
 * - Example:
 * public static int add(int a, int b) { // 'a' and 'b' are parameters
 * return a + b;
 * }
 * int sum = add(5, 10); // '5' and '10' are arguments
 * 
 * What happens in memory when a function is called?
 * - When a function is called, a new stack frame is created in the call stack.
 * - The stack frame contains the function's parameters, local variables, and
 * return address.
 * - The function's parameters are initialized with the values of the arguments
 * passed during the call.
 * - The function's code is executed, and any local variables are allocated
 * memory in the stack frame.
 * - Once the function completes execution, the stack frame is popped off the
 * call stack, and control returns to the calling function.
 * - If the function has a return value, it is passed back to the caller.
 * - This process helps manage function calls and maintain the state of each
 * function invocation.
 * 
 * 
 * Call by Value vs Call by Reference:
 * - Call by Value: In Java, primitive data types (int, float, char, etc.) are
 * passed to functions by value. This means that a copy of the actual value is
 * made and passed to the function. Changes made to the parameter inside the
 * function do not affect the original value outside the function.
 * - Call by Reference: In Java, objects (instances of classes) are passed to
 * functions by reference. This means that a reference (or pointer) to the
 * actual object is passed to the function. Changes made to the object's
 * properties inside the function will affect the original object outside the
 * function.
 * - Example of Call by Value:
 * public static void modifyValue(int num) {
 * num = num + 10; // This change will not affect the original variable
 * }
 * - Example of Call by Reference:
 * public static void modifyObject(MyClass obj) {
 * obj.value = obj.value + 10; // This change will affect the original object
 * }
 * 
 * 
 * inbuilt functions/methods vs user defined functions/methods:
 * - Inbuilt functions/methods are pre-defined in Java and are part of the Java
 * API.
 * - They are provided by the Java platform and can be used directly without any
 * additional code.
 * - Examples include System.out.println(), Math.max(), etc.
 * 
 * - User defined functions are created by the programmer to perform specific
 * tasks.
 * - They are defined using the 'function' keyword (or 'method' in Java) and can
 * be called as needed.
 * - User defined functions enhance code reusability and modularity.
 * 
 * 
 * Function Overloading:
 * - Function overloading is a feature in Java that allows multiple functions
 * to have the same name but different parameter lists (different types or
 * number of parameters).
 * - The correct function to be called is determined at compile-time based on
 * the arguments passed during the function call.
 * - Function overloading enhances code readability and allows for more
 * intuitive function names.
 * - Example:
 * public static int add(int a, int b) {
 * return a + b;
 * }
 * public static float add(float a, float b) {
 * return a + b;
 * }
 * public static double add(double a, double b) {
 * return a + b;
 * }
 * 
 * Function OverLoading using parameters:
 * - Function overloading can be achieved by changing the number of parameters
 * or the types of parameters.
 * - Example:
 * public static int multiply(int a, int b) {
 * return a * b;
 * }
 * public static int multiply(int a, int b, int c) {
 * return a * b * c;
 * }
 * public static double multiply(double a, double b) {
 * return a * b;
 * }
 * 
 * Function OverLoading using return type:
 * - In Java, function overloading cannot be achieved solely by changing the
 * return type.
 * - The parameter list must differ in order to overload a function.
 * - Example:
 * public static int compute(int a, int b) {
 * return a + b;
 * }
 * public static double compute(int a, int b) {
 * return a / (double)b;
 * } // This will cause a compile-time error due to same parameter list
 * 
 * Function OverLoading using Different Data Types:
 * - Function overloading can also be achieved by using different data types for
 * parameters.
 * - Example:
 * public static void printValue(int a) {
 * System.out.println("Integer: " + a);
 * }
 * public static void printValue(double a) {
 * System.out.println("Double: " + a);
 * }
 * public static void printValue(String a) {
 * System.out.println("String: " + a);
 * }
 * 
 * 
 * Variable Scope in Functions/Methods:
 * - Local Scope: Variables declared within a method are local to that method
 * and cannot be accessed outside of it.
 * - Instance Scope: Variables declared as instance variables (non-static) are
 * accessible by all methods within the same class and can be accessed using
 * the 'this' keyword.
 * - Static Scope: Variables declared as static are shared among all instances of
 * the class and can be accessed using the class name.
 * - Block Scope: Variables declared within a block (e.g., within loops or
 * conditionals) are local to that block and cannot be accessed outside of it.
 */
