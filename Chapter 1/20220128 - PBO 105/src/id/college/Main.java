package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int var_a, var_b;

        System.out.print("Input a value : ");
        var_a = inputUser.nextInt();

        System.out.print("Input b value : ");
        var_b = inputUser.nextInt();

        System.out.println();
        System.out.println("Variable a : " + var_a);
        System.out.println("Variable b : " + var_b);


    }

}
