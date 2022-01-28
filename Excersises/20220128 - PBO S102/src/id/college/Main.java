package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        float inputRupiah, convertUsDollar, convertEuro;
        float oneUsDollarToRupiah = 14377f;
        float oneEuroToRupiah = 16058.304f;

        System.out.print("input rupiah : Rp. ");
        inputRupiah = inputUser.nextFloat();

        convertUsDollar = inputRupiah / oneUsDollarToRupiah;
        convertEuro = inputRupiah / oneEuroToRupiah;

        System.out.println("========== CONVERT =======");
        System.out.println("US Dollar : $ " + convertUsDollar + " USD.");
        System.out.println("Euro      : € " + convertEuro);

    }
}
