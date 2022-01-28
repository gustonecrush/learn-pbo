package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int score;

        System.out.print("input your score : ");
        score = inputUser.nextInt();

        if( score < 55 ) {
            System.out.println("Student is fail");
        } else {
            System.out.println("Student is success");
        }

    }
}
