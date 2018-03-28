import java.util.Scanner;

public class CountVowels {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        int count = 0;
        for (int i = 0; i <word.length(); i++) {
            if(word.charAt(i) == 'a' | word.charAt(i) == 'e' | word.charAt(i) =='i'
                | word.charAt(i) == 'o' | word.charAt(i) =='u'){
                count++;
            }
        }
        System.out.println("There is " + count + " many vowels");


    }


}
