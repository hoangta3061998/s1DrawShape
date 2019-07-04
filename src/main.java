import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isoscales triangle");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println();
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 8; i++) {
                        System.out.println();
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 7; i++) {
                        System.out.println();
                        for (int j = 0; j < 7 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } while (choice != 0);
    }
}
