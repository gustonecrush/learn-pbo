package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("import number in range 1-3 : ");
        int number = inputUser.nextInt();

        switch( number ) {
            case 1:
                System.out.println("One"); break;
            case 2:
                System.out.println("Two"); break;
            case 3:
                System.out.println("Three"); break;
            default:
                System.out.println("Number is out of range");
        }

    }
}
