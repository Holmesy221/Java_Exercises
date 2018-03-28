import java.util.Scanner;

public class CheckPalindrome {

public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word = scanner.nextLine();

    String palindrome = new StringBuilder(word).reverse().toString();

    if(palindrome.equals(word)){
        System.out.println("The word is a palindrome");
    }else{
        System.out.println("The word is not a palindrome");
    }





}


}
