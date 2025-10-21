public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Conditional Statements: ");
        System.out.println("1. If-Else Statement");
        System.out.println("2. Else-If Ladder");
        System.out.println("3. Switch Statement");
        System.out.println("4. Ternary Operator");

        // If-Else Statement
        System.out.println("\nIf-Else Statement Example:");
        System.out.println("if (condition) {");
        System.out.println("    // code to be executed if condition is true");
        System.out.println("} else {");
        System.out.println("    // code to be executed if condition is false");
        System.out.println("}");

        // Example of If-Else Statement
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Else-If Ladder
        System.out.println("\nElse-If Ladder Example:");
        System.out.println("if (condition1) {");
        System.out.println("    // code to be executed if condition1 is true");
        System.out.println("} else if (condition2) {");
        System.out.println("    // code to be executed if condition2 is true");
        System.out.println("} else {");
        System.out.println("    // code to be executed if both conditions are false");
        System.out.println("}");

        // Example of Else-If Ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Switch Statement
        System.out.println("\nSwitch Statement Example:");
        System.out.println("switch (variable) {");
        System.out.println("    case value1:");
        System.out.println("        // code to be executed if variable == value1");
        System.out.println("        break;");
        System.out.println("    case value2:");
        System.out.println("        // code to be executed if variable == value2");
        System.out.println("        break;");
        System.out.println("    default:");
        System.out.println("        // code to be executed if variable doesn't match any case");
        System.out.println("}");

        // Example of Switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Ternary Operator
        System.out.println("\nTernary Operator Example:");
        System.out.println("variable = (condition) ? value_if_true : value_if_false;");
        // Example of Ternary Operator
        int age = 20;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Age: " + age + " - " + eligibility);
    }
}
