import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideA = 0;
        double sideB = 0;

        double area;
        double perimeter;
        double diagonal;

        boolean validA = false;
        boolean validB = false;
        
        do {
            System.out.println("Enter the length of Side A [Any positive integer]");
            if (scan.hasNextDouble()) {
                sideA = scan.nextDouble();
                if (sideA > 0) {
                    validA = true;
                    scan.nextLine();
                }
                else {
                    System.out.println("Invalid length for side A, try again");
                    System.out.println();
                }
            }
            else {
                scan.nextLine();
                System.out.println("Invalid data type, try again");
                System.out.println();
            }
        } while (!validA);

        do {
            System.out.println("Enter the length of Side B [Any positive integer]");
            if (scan.hasNextDouble()) {
                sideB = scan.nextDouble();
                if (sideB > 0) {
                    validB = true;
                }
                else {
                    System.out.println("Invalid length for side B, try again");
                    System.out.println();
            }
        }
            else {
                scan.nextLine();
                System.out.println("Invalid data type, try again");
                System.out.println();
            }
        } while (!validB);

        area = sideA * sideB;
        perimeter = sideA + sideB;
        diagonal = Math.pow(sideA,2) + Math.pow(sideB, 2);

        System.out.printf("Side 1: %15.2f", sideA);
        System.out.printf("\nSide 2: %15.2f", sideB);
        System.out.printf("\nArea: %18.2f", area);
        System.out.printf("\nPerimeter: %12.2f", perimeter);
        System.out.printf("\nDiagonal: %14.2f", diagonal);
    }
}