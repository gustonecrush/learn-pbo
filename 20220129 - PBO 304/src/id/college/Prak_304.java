package id.college;

import java.util.Scanner;

public class Prak_304 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("input number : ");
        int n = inputUser.nextInt();
        int result = 0;

        for(int i = 0; i <= n; i++) {
            if(i == n)
                System.out.print(i + " = ");
            else
                System.out.print(i + " + ");
            result += i;
        }

        System.out.print(result);

    }
}
