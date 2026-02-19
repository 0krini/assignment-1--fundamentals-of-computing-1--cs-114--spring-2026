import java.util.Scanner;

public class Assignment1Program2 {

    //Finds largest 4‑digit value in the chosen base
    public static int maxFourDigitValue(int base) {
        return (base - 1) * (int)(Math.pow(base, 3) + Math.pow(base, 2) + base + 1);
    }

    //Converts base‑10 number to chosen base
    public static String convertToBase(int n, int base) {
        if (n < base) {
            return Integer.toString(n);
        }
        return convertToBase(n / base, base) + (n % base);
    }

    //Adds leading zeros to add up to 4 digits
    public static String padToFour(String s) {
        if (s.length() >= 4) {
            return s;
        }
        return padToFour("0" + s);
    }

    //Input and printing
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Base Conversion Program\n"); //used \n for spacing instead of blank println as used in program 1 because it was more efficient and readable

        System.out.print("Please enter a base (2 - 9): ");
        int base = input.nextInt();

        int maxValue = maxFourDigitValue(base);
        System.out.println("\nThe maximum, 4-digit, base 10 number in base " + base + " is " + maxValue + ".");

        System.out.print("Now, enter a base 10 number in the range 0 to " + maxValue + " to convert: ");
        int number = input.nextInt();

        String converted = convertToBase(number, base);
        converted = padToFour(converted);

        System.out.println("\n" + number + " (base 10) = " + converted + " (base " + base + ")");
    }
}