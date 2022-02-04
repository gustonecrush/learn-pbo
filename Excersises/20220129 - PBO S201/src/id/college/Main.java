package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        float IMT; // Index Massa Tubuh -> b / t * t

        System.out.print("input weight(kg) : ");
        float weight = inputUser.nextFloat();

        System.out.print("input height(m)  : ");
        float height = inputUser.nextFloat();

        IMT = weight / ( height * height );

        if( IMT > 30 )
            System.out.println("Obesity");
        else if ( IMT > 25 && IMT <= 30)
            System.out.println("Fat");
        else if ( IMT > 18.5 && IMT <= 25 )
            System.out.println("Normal");
        else
            System.out.println("Boney");

    }
}
