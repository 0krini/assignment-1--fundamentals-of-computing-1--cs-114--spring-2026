import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("TTTTTTTTTTTTTTT   PPPPPPPPP");
    System.out.println("      TTT         P        P");
    System.out.println("      TTT         P        P");
    System.out.println("      TTT         PPPPPPPPP");
    System.out.println("      TTT         PPP      ");
    System.out.println("      TTT         PPP      ");
    System.out.println("      TTT         PPP      ");

    System.out.println(); //blank line for spacing

    //String reversion and trimming
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a 5-character string: ");
    String stringOfCharacters = input.nextLine();
    //Reverses the string
    String reversedString = new StringBuilder(stringOfCharacters).reverse().toString();
    //Trims the outer characters
    String trimmedString = reversedString.substring(1, reversedString.length() - 1);
    //Sets original variable to its reversed and trimmed version
    stringOfCharacters = trimmedString;
    
    System.out.println(); //blank line for spacing

    //Farhrenheit to celsius recieving and conversion
    System.out.println("Please enter a number in Fahrenheit: ");
    double fahrenheit = input.nextDouble();
    //Converts Fahrenheit to Celsius
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;
    
    System.out.println(); //blank line for spacing

    //Random number generation
    int randomNumber = (int)(Math.random() * (16384 - 32 + 1)) + 32;
    System.out.println("Random number generated. Continuing...");
   
    System.out.println(); //blank line for spacing

    System.out.println("Your new string is " + celsius + stringOfCharacters + randomNumber);

  }
}
