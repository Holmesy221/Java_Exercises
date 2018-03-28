import java.util.Scanner;

public class Fibbonachi {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int count1=1;
        for (int i = 1; i <= number; i++){
            System.out.println(count+ " ");
            int sumofTwo = count + count1;
            count = count1;
            count1 = sumofTwo;

        }

    }

}
