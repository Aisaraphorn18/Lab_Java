package lab09_01;

import java.util.Scanner;

public class TextEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input Command-line argument 
        String inputText = "";
        if (args.length > 0) {
            inputText = args[0];
        } else {
            // input pass Console
            System.out.print("Original Message: ");
            inputText = scanner.nextLine();
        }

        String encodedText = encodeText(inputText);

        System.out.println("Encoded message: " + encodedText);

        scanner.close();
    }

    public static String encodeText(String text) {
        StringBuilder encodedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                // change upper to lowwer
                encodedText.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                // change follow rule
                char encodedChar = (char) ('a' + ('z' - currentChar));
                encodedText.append(encodedChar);
            } else {
                // no change if not a-z
                encodedText.append(currentChar);
            }
        }

        return encodedText.toString();
    }
}
