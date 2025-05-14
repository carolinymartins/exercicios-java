import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        float celsius, fahrenheit, kelvin, rankine;
        Scanner leitor;
        leitor = new Scanner(System.in);
        System.out.println("Informe a temperauta em graus celsius: ");
        celsius = leitor.nextFloat();
        fahrenheit = (celsius * 1.8F) + 32;
        kelvin = celsius + 273.15F;
        rankine = (celsius * 1.8000F) + 491.67F;
        System.out.println("A temperatura de " + celsius + " graus equivale a " + fahrenheit
                + " Fahrenheits " + kelvin + " Kelvin e " + rankine + " Rankine");

        leitor.close();
    }
}

