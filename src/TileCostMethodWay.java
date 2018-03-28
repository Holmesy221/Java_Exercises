import java.util.Scanner;

public class TileCostMethodWay {

    static Scanner scanner = new Scanner(System.in);

    private static double floorPlan(double height, double width){


        double area = (height * width);
        return area;




    }

    public static void main(String args[]){
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println(floorPlan(height,width));
    }


}
