package id.college;
import java.util.Scanner;

public class Prak_106 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        float celcius, reamur;

        System.out.print("Input degree(celcius) : ");
        celcius = inputUser.nextFloat();

        reamur = 0.8f * celcius;

        System.out.println();
        System.out.printf("degree of reamur from %f celcius is %f reamur", celcius, reamur);

    }
}
