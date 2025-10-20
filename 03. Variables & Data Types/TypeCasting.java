public class TypeCasting {
    public static void main(String[] args) {
        //  TYPE CASTING IN JAVA
        float a = 10.5f;
        int b = (int) a; // Explicit casting from float to int
        System.out.println("Value of b after casting: " + b); // Output: 10

        char ch = 'A';
        int asciiValue = (int) ch; // Explicit casting from char to int
        System.out.println("ASCII value of " + ch + " is: " + asciiValue); // Output: 65
        
    }

}

/*
* Type casting in Java is the process of converting a variable from one data type to another. There are two types of type casting:
* 1. Implicit Casting (Widening): Automatically done by the compiler when converting a smaller data type to a larger data type (e.g., int to float).
* 2. Explicit Casting (Narrowing): Manually done by the programmer when converting a larger data type to a smaller data type (e.g., float to int).
* In the example above, we perform explicit casting from a float to an int, which truncates the decimal part.

* Type Promotion in Expressions:
* When performing operations on mixed data types, Java automatically promotes smaller data types to larger data types to prevent data loss. For example, in an expression involving an int and a float, the int is promoted to a float before the operation is performed.
* This means that the result of the operation will be of the larger data type (float in this case), and any potential loss of precision is avoided.

* Example:
* char a = 'a';
* int b = a; // Implicit casting from char to int
* Here, the char 'a' is implicitly cast to its ASCII integer value 97.

* Example of Type Promotion with bucket:
* byte x = 10;
* int y = 20;
* float z = 30.5f;
* float result = x + y + z; // Here, byte and int are promoted to float before addition
* In this case, both byte and int are promoted to float, and the final result is a float.
* This ensures that no data is lost during the arithmetic operation.

* Suppose we have 2 buckets of different sizes (data types). When we pour water (data) from a smaller bucket into a larger bucket, all the water fits perfectly without any overflow (implicit casting). However, if we try to pour water from a larger bucket into a smaller bucket, some water will spill out (explicit casting), and we need to be careful about how much we pour to avoid losing too much water (data loss).


*/