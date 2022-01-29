package id.college;

import java.util.Scanner;

public class Prak_303 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("input a number : ");

        int number = inputUser.nextInt();
        boolean prima = true;

        for(int i = 2; i < number; i++) {
            if( (number % i) == 0 )
                prima = false; break;
        }

        if( prima )
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is NOT prime number");

    }
}
