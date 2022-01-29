package id.college;

import java.util.Scanner;

public class Prak_305 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.print("input number-1 : ");
        int number = inputUser.nextInt();
        int total_result = 0;
        int i = 2;
        String str = "";

        while(number != 0) {
            total_result += number;
            str += number + " + ";
            System.out.print("input number-" + i + " : ");
            number = inputUser.nextInt();
            i++;
        }

        System.out.print(str + " = " + total_result);

    }
}
