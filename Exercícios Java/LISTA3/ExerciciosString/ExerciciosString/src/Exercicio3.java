import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String texto;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um texto:");
        texto = leitor.nextLine();

        int caracter = texto.length();


        String[] palavras= texto.trim().split("[\\s,.]+");
        int qtdpalavras = palavras.length;

        System.out.println("Quantidade de caracteres: " + caracter);
        System.out.println("Quantidade de Palavras: " + qtdpalavras);

    }
}
