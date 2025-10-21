public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic Operators (Binary)
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        // Arithmetic Operators (Unary)
        System.out.println("Pre Increment: " + (++a));
        System.out.println("Pre Decrement: " + (--b));
        System.out.println("Post Increment: " + (a++));
        System.out.println("Post Decrement: " + (b--));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a; // Simple assignment
        System.out.println("c = a: " + c);
        c += b; // c = c + b
        System.out.println("c += b: " + c);
        c -= b; // c = c - b
        System.out.println("c -= b: " + c);
        c *= b; // c = c * b
        System.out.println("c *= b: " + c);
        c /= b; // c = c / b
        System.out.println("c /= b: " + c);
        c %= b; // c = c % b
        System.out.println("c %= b: " + c);
        c = a; // Reset c
        c &= b; // c = c & b
        System.out.println("c &= b: " + c);
        c |= b; // c = c | b
        System.out.println("c |= b: " + c);
        c ^= b; // c = c ^ b
        System.out.println("c ^= b: " + c);
        c = a; // Reset c
        c <<= 1; // c = c << 1
        System.out.println("c <<= 1: " + c);
        c >>= 1; // c = c >> 1
        System.out.println("c >>= 1: " + c);
    }
}

/*
 * Operators in Java:
 * 1. Arithmetic Operators: +, -, *, /, %, ++, --
 * 2. Relational Operators: ==, !=, >, <, >=, <=
 * 3. Logical Operators: &&, ||, !
 * 4. Bitwise Operators: &, |, ^, ~, <<, >>
 * 5. Assignment Operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=
 * 6. Unary Operators: +, -, ++, --
 * 
 * Pre and Post Increment/Decrement:
 * - Pre-increment (++a): Increments the value of 'a' before using it in an expression.
 * - Post-increment (a++): Uses the current value of 'a' in an expression, then increments it.
 * - Pre-decrement (--b): Decrements the value of 'b' before using it in an expression.
 * - Post-decrement (b--): Uses the current value of 'b' in an expression, then decrements it.
 * 
 * Operators Precedence in Java (from highest to lowest):
 * 1. Parentheses ()
 * 2. Unary Operators (++ , -- , + , -, !, ~)
 * 3. Multiplicative (* , / , %)
 * 4. Additive (+ , -)
 * 5. Bitwise Shift (<< , >> , >>>)
 * 6. Relational (== , != , > , < , >= , <=)
 * 7. Equality (== , !=)
 * 8. Bitwise AND (&)
 * 9. Bitwise Exclusive OR (^) (XOR)
 * 10. Bitwise Inclusive OR (|) (OR)
 * 11. Logical AND (&&)
 * 12. Logical OR (||)`
 * 13. Logical NOT (!)
 * 14. Ternary ( ? : )
 * 15. Assignment (= , += , -= , *= , /= , %= , &= , |= , ^= , <<= , >>=)
 *
 * Associativity of Operators:
 * - Most operators in Java are left associative, meaning they are evaluated from left to right.
 * - Some operators, like assignment operators, are right associative, meaning they are evaluated from right to left.
 * - The ternary operator ( ? : ) is also right associative.
 * - Also others such as unary operators, assignment operators, and the exponentiation operator (if implemented) are right associative.
 */