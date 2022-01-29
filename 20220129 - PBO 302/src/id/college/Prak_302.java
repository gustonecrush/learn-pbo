package id.college;
import java.util.Scanner;

public class Prak_302 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("input n-number : ");
        int n = inputUser.nextInt();

        System.out.println("even numbers start from 2 until " + n);
        for(int i = 2; i <= n; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }

    }
}
