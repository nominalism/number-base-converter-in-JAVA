import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        
        System.out.println("1. Binary\n");
        System.out.println("2. Hexadecimal\n");
        System.out.println("3. Octal\n");
        int choice = scanner.nextInt();
        System.out.println("Choose the base you want to convert to:");

        switch (choice) {
            case 1:
                String binaryNumber = Integer.toBinaryString(decimalNumber);
                System.out.println("Binary equivalent: " + binaryNumber);
                break;
            case 2:
                String hexNumber = Integer.toHexString(decimalNumber);
                System.out.println("Hexadecimal equivalent: " + hexNumber);
                break;
            case 3:
                String octalNumber = Integer.toOctalString(decimalNumber);
                System.out.println("Octal equivalent: " + octalNumber);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
