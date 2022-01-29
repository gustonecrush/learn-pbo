package id.college;

import java.util.Scanner;

public class Prak_306 {

    public static void main(String[] args) {

        int result = 0;
        int i = 1;
        int number;
        String str = "";
        Scanner inputUser = new Scanner(System.in);

        do {
            System.out.print("input number-" + i + " : ");
            number = inputUser.nextInt();
            result += number;
            str += number + " + ";
            i++;
        } while( number != 0 );

        System.out.println(str + " = " + result);


    }

}
