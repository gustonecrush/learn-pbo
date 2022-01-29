package id.college;

import java.util.Scanner;

public class Prak_401 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int choose = 9;

        do {
            System.out.println("\nMENU\n");
            System.out.println("1. Find Rectangle's Area");
            System.out.println("2. Find Circle's Area");
            System.out.println("0. Exit");
            System.out.print("input menu : ");
            choose = inputUser.nextInt();
            switch( choose ) {
                case 1:
                    findRectangleArea();
                    break;
                case 2:
                    findCircleArea();
                    break;
                case 0:
                    System.out.println("you exit of program");
                    break;
            }
        } while( choose != 0);

    }

    private static void findRectangleArea() {
        int length, width, area;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("input length: ");
        length = inputUser.nextInt();
        System.out.print("input width: ");
        width = inputUser.nextInt();

        area = length * width;

        System.out.printf("Area = length * width = %d * %d = %d", length, width, area);
        System.out.println();
    }

    private static void findCircleArea() {
        float radius, area;
        float phi = 3.14f;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("input radius: ");
        radius = inputUser.nextFloat();

        area = phi * radius * radius;

        System.out.printf("Circum = phi * r * r = %f * %f * %f = %f", phi, radius, radius, area);
        System.out.println();
    }

}
