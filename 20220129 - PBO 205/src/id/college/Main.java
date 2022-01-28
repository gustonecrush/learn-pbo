package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("input math's score : ");
        int mathScore = inputUser.nextInt();

        System.out.print("input physics's score : ");
        int physicScore = inputUser.nextInt();

        if( (mathScore > 80) && (physicScore > 70) ) {
            System.out.println("Student is accepted!");
        } else {
            System.out.println("Student is rejected!");
        }

    }
}
