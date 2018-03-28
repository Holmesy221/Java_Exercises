import java.util.Scanner;

public class TileCost {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width ");
        double width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        double amountOfTile = (width * height);

        System.out.println("Total amount of tile is: ");
        System.out.println(amountOfTile);


    }




}
