import java.util.Scanner;

public class CheckPalindromeMethodWay {


    private static  String palindrome(String word){

        String palindrome = new StringBuilder(word).reverse().toString();

        if (palindrome.equals(word)){
            System.out.println("The word is a palindrome");
        }else{
            System.out.println("The word is not a palindrome");
        }

        return "";

    }



    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word  = scanner.nextLine();

        System.out.println(palindrome(word));

    }



}
