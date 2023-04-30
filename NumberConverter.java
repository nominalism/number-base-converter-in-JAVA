import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary equivalent: " + binaryNumber);

        String hexNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("Hexadecimal equivalent: " + hexNumber);

        String octalNumber = decimalToOctal(decimalNumber);
        System.out.println("Octal equivalent: " + octalNumber);
    }

    public static String decimalToBinary(int decimal) {
        String binary = "";
        int quotient = decimal;

        while (quotient != 0) {
            int remainder = quotient % 2;
            binary = remainder + binary;
            quotient /= 2;
        }

        return binary;
    }

    public static String decimalToHexadecimal(int decimal) {
        String hex = "";
        int quotient = decimal;

        while (quotient != 0) {
            int remainder = quotient % 16;
            char hexDigit = getHexDigit(remainder);
            hex = hexDigit + hex;
            quotient /= 16;
        }

        return hex;
    }

    public static String decimalToOctal(int decimal) {
        String octal = "";
        int quotient = decimal;

        while (quotient != 0) {
            int remainder = quotient % 8;
            octal = remainder + octal;
            quotient /= 8;
        }

        return octal;
    }

    public static char getHexDigit(int decimal) {
        if (decimal < 10) {
            return (char) ('0' + decimal);
        } else {
            return (char) ('A' + (decimal - 10));
        }
    }
}
