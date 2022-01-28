package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("input your score : ");
        int score = inputUser.nextInt();

        if( score >= 80 )
            System.out.println("your score is A");
        else if ( score >= 70 )
            System.out.println("your score is B");
        else if ( score >= 55 )
            System.out.println("your score is C");
        else if ( score >= 40 )
            System.out.println("your score is D");
        else
            System.out.println("your score is E");

    }
}
