import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        long numero, resto=0, soma=0;
        Scanner leitor;
        leitor = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        numero = leitor.nextLong();
        while (numero > 0)
        {
            resto = numero%10;
            soma += resto;
            numero = numero/10;
        }
        System.out.println("A soma dos números é " + soma);

        leitor.close();
    }
}
