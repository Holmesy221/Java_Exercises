import java.util.Scanner;

public class FibonacciMethodWay {

    public static void  fibonacci(int number){

        int sumOftwo, num1 = 0, num2 = 1;

        for (int i = 0; i < number ; i++) {
            System.out.println(num1 + "");
            sumOftwo = num1 + num2;
            num1 = num2;
            num2 = sumOftwo;

        }

    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        fibonacci(number);

    }

}
