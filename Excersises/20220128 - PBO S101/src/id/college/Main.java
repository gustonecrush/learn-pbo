package id.college;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        float radius, area, circumstances;
        float phi = 3.14f;

        System.out.print("input radius : ");
        radius = inputUser.nextFloat();

        area = phi * radius * radius;
        circumstances = 2 * phi * radius;

        System.out.print("Circle's Area          : " + area + "\n");
        System.out.print("Circle's Circumstances : " + circumstances);

    }
}
