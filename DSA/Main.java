import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // byte - 1 byte [-128 to 127]
        // short - 2 bytes [-32768 to 32767]
        // int - 4 bytes [-2147483648 to 2147483647]
        // long - 8 bytes [-9223372036854775808 to 9223372036854775807]
        // float - 4 bytes [3.4e-38 to 3.4e38]
        // double - 8 bytes
        // char - 2 bytes (Unicode character)
        // boolean - 1 byte (true or false)

        // **Initializing variables**
            String name = new String("Arnav");  // String is non-primitive data type
            int age = 20;
            long sr_no = 123456789L;
            char gender = 'M';
            boolean is_present = true;
            float grade = 9.0f;
        
        // **Printing values**
            System.out.println("Student Information:");
            System.out.println("Name: " + name);
            System.out.println("Marks: " + age);
            System.out.println("Serial Number: " + sr_no);
            System.out.println("Present: " + is_present);
            System.out.println("grade: " + grade + "\n");

        // **Character Operations: The + sign would add their unicode values insetead of concatenating**
            System.out.println("Character Operations:");
            System.out.println("Concatenating 'a' and 'b': " + "a" + "b");  // Concatenation of Strings
            System.out.println("Adding 'a' and 'b' as characters: " + ('a' + 'b'));  // Adding their Unicode values
            System.out.println("Concatenating 'a' and 'b' after converting to String: " + 'a' + "" + 'b');
            System.out.println();  

        // **String Operations**
            System.out.println("String Operations:");
        
            // Length of the string
            System.out.println("Length of name: " + name.length());
            
            // Extracting character at a specific index
            System.out.println("First character of name and gender: " + name.charAt(0) + "" + gender);

            // Replacing character in the string (String is immutable)
            String name_2 = name.replace("A", "a");
            System.out.println("Name after replacement using replace: " + name_2);

            // Extracting substring
            System.out.println("Substring of name (first 2 characters): " + name.substring(0, 2) + "\n");

        // **Arrays**
            System.out.println("Array Operations:");

            // Initializing an integer array of size 3
            int[] marks = new int[3];
            
            // Arrays are initialized to default values (0 for int)
            System.out.println("Default value of first element in marks array: " + marks[0]);

            // Assigning values to the array
            marks[0] = 20;
            marks[1] = 10;
            marks[2] = 30;
            
            // Printing the array directly would give a reference to the array, not the content
            System.out.println("Array reference (memory address): " + marks);
            System.out.println("Marks in array: " + marks[0] + " " + marks[1] + " " + marks[2]);

            // Array Length : We dont add () to get the length
            System.out.println("Length of marks array: " + marks.length);

            // Sorting the Array
            Arrays.sort(marks);
            System.out.println("Marks after sorting: " + marks[0] + " " + marks[1] + " " + marks[2] + "\n");

        // **Casting**

            // Implicit Casting : Means converting a datatype that is smaller to a datatype that is larger
            System.out.println("Casting:");
            System.out.println("int to long: " + (long)age);
            System.out.println("float to double: " + (double)grade);

            // Explicit Casting : Means converting a datatype that is larger to a datatype that is smaller
            System.out.println("Explicit Casting:");
            System.out.println("long to int: " + (int)sr_no);
            System.out.println("double to float: " + (float)grade + "\n");

        // **Constants**
            // Constants are variables that cannot be changed. They are declared using the final keyword.
            System.out.println("Constants:");
            final double PI = 3.14159;
            System.out.println("Value of PI: " + PI + "\n");

        // **Input**
            System.out.println("Input:");
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter your name: ");
            String name1 = sc.nextLine();
            System.out.println("Hello " + name1 + "!" + "\n");
            sc.close();

        // **If-Else**
            System.out.println("If-Else:");
            int a = 10; int b = 20;
            if (a > b) {
                System.out.println("a is greater than b" + "\n");
            } else if (a < b) {
                System.out.println("a is less than b" + "\n");
            } else {
                System.out.println("a is equal to b" + "\n");
            }

        // **For Loop**
            System.out.println("For Loop:");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        
        // **While Loop**
            System.out.println("\nWhile Loop:");
            int j = 0;
            while (j < 10) {
                System.out.print(j + " ");
                j++;
            }
        
        // **Do-While Loop**
            System.out.println("\nDo-While Loop:");
            int k = 0;
            do {
                System.out.print(k + " ");
                k++;
            } while (k < 10); 
        
        // **Continue**
            System.out.println("\nContinue:");
            for (int l = 0; l < 10; l++) {
                if (l == 5) {
                    continue;
                }
                System.out.print(l + " ");
            }

        // ** Try-Catch**
            // Try and catch are used to handle exceptions
            System.out.println("\nTry-Catch:");
            try {
                int result = 10 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: ");
            }print("Done!");
    }

    // **Methods**
    public static void print(String str) {
        System.out.println(str);
    }
}
