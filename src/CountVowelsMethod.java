import java.util.Scanner;

public class CountVowelsMethod {




    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("The numbers of vowles in the word is: " + countVowels(word));
    }


    public static int countVowels(String word){

        int count = 0;
        for (int i = 0; i <word.length() ; i++) {

            if(word.charAt(i) == 'a' | word.charAt(i) == 'e' | word.charAt(i) =='i'
                    | word.charAt(i) == 'o' | word.charAt(i) =='u'){
                count++;
            }
        }

        return count;

        }


    }

