import java.util.Scanner;

public class StringReverseMethodWay {


    public static String reverseWord(String word){
        String newWord = new StringBuilder(word).reverse().toString();

        return newWord;
    }


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word  = scanner.nextLine();

        System.out.println(reverseWord(word));






    }




}
