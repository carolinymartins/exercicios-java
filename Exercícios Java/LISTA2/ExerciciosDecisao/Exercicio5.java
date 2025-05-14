import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor;
        int notas, moedas, notas100, notas50, notas20, notas10, notas5, notas2, moedas1, moedas50, moedas25, moedas10, moedas5, moedas01;
        System.out.println("Digite o valor a decompor:");
        valor = leitor.nextDouble();
        notas = (int) Math.round(valor * 100);

        notas100 = notas / 10000;
        notas %= 10000;
        notas50 = notas / 5000;
        notas %= 5000;
        notas20 = notas / 2000;
        notas %= 2000;
        notas10 = notas / 1000;
        notas %= 1000;
        notas5 = notas / 500;
        notas %= 500;
        notas2 = notas / 200;
        notas %= 200;

        moedas = notas;
        moedas1 = moedas/100;
        moedas %= 100;
        moedas50 = moedas / 50;
        moedas %= 50;
        moedas25 = moedas / 25;
        moedas %= 25;
        moedas10 = moedas / 10;
        moedas %= 10;
        moedas5 = moedas / 5;
        moedas %= 5;
        moedas01 = moedas;

        if (notas100 > 0) System.out.println(notas100 + " nota(s) de 100");
        if (notas50 > 0) System.out.println(notas50 + " nota(s) de 50");
        if (notas20 > 0) System.out.println(notas20 + " nota(s) de 20");
        if (notas10 > 0) System.out.println(notas10 + " nota(s) de 10");
        if (notas5 > 0) System.out.println(notas5 + " nota(s) de 5");
        if (notas2 > 0) System.out.println(notas2 + " nota(s) de 2");

        if (moedas1 > 0) System.out.println(moedas1 + " moeda(s) de 1 real");
        if (moedas50 > 0) System.out.println(moedas50 + " moeda(s) de 50 centavos");
        if (moedas25 > 0) System.out.println(moedas25 + " moeda(s) de 25 centavos");
        if (moedas10 > 0) System.out.println(moedas10 + " moeda(s) de 10 centavos");
        if (moedas5 > 0) System.out.println(moedas5 + " moeda(s) de 5 centavos");
        if (moedas01 > 0) System.out.println(moedas01 + " moeda(s) de 1 centavo");

        leitor.close();
    }
}
