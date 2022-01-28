package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("input working hours : ");
        int workingHours = inputUser.nextInt();
        int salary;

        if ( workingHours >= 60 ) {
            salary = 7500 * workingHours;
            System.out.println("your salary is Rp." + salary);
        }
        else if( workingHours > 50 && workingHours < 60 ) {
            salary = 5000 * workingHours;
            System.out.println("your salary is Rp." + salary);
        }
        else if ( workingHours <= 50 ) {
            salary = 2500 * workingHours;
            System.out.println("your salary is Rp." + salary);
        }

    }
}
