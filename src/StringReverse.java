import java.util.Scanner;

public class StringReverse {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String reversedWord = new StringBuilder(word).reverse().toString();

        System.out.println("The word reversed is: " + reversedWord);




    }

}
