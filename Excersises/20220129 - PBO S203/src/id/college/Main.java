package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int x, y, kuadran;

        System.out.print("input x coordinate : ");
        x = inputUser.nextInt();

        System.out.print("input y coordinate : ");
        y = inputUser.nextInt();

        if( x > 0 )
            if( y > 0 )
                System.out.println("Quadran 1");
            else
                System.out.println("Quadran 4");
        else
            if( y > 0 )
                System.out.println("Quadran 2");
            else
                System.out.println("Quadran 3");



    }
}
