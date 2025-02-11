public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int result = 0; // Initialize result to a default value
        
        if (j != 0) {
            result = i / j;
        } else {
            System.out.println("Error: Division by zero");
        }

        System.out.println(result);
    }
}