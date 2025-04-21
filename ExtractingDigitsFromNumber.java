
public class ExtractingDigitsFromNumber {
    public static void main(String[] args) {
        int number = 12345; // Example number
        System.out.println("Digits in the number: ");
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            System.out.println(digit); // Print the digit
            number = number / 10; // Remove the last digit from the number
        }
    }
    
}
