import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String op;
        System.out.println("------- MENU DE EXERCÍCIOS --------");
        System.out.println("1- Gerar Iniciais de um Nome:");
        System.out.println("2- Retornar Idade:");
        System.out.println("3 - Embaralhar palavras: ");
        System.out.println("4- Testa Regex:");
        System.out.println("5- Colunas:");

        Scanner leitor = new Scanner(System.in);
        System.out.println("DIGITE SUA OPÇÃO");
        op = leitor.nextLine();

        String aux, titulo,mensagem,palavra,tipo,frase;
        int colunas;

        switch(op)
        {
            case "1":
                System.out.println("Digite o seu nome Completo:");
                aux = leitor.nextLine();
                System.out.println("Iniciais:" + Exercicio2.gerarIniciais(aux));
                break;
            case "2":
                System.out.println("Digite o título:");
                titulo = leitor.nextLine();
                System.out.println("Digite a mensagem de exibição:");
                mensagem = leitor.nextLine();
                System.out.println("Valor Inteiro: " + Exercicio4.lerInteiro(titulo, mensagem));
                System.out.printf("Valor Reais: %.2f", Exercicio4.lerReal(titulo, mensagem) );
                break;
            case "3":
                System.out.println("Digite a Palavra:");
                palavra = leitor.nextLine();
                System.out.println("Palavra Normal: " + palavra);
                System.out.println("Palavra Embaralhada: " + Exercicio5.embaralha(palavra));
                break;
            case "4":
                System.out.println("Entrada:");
                tipo = leitor.nextLine();
                System.out.println("A String passada é do tipo: " + Exercicio6.tipoVariavel(tipo));
                break;
            case "5":
                System.out.println("Digite uma frase:");
                frase = leitor.nextLine();
                System.out.println("Número de colunas:");
                colunas = leitor.nextInt();
                System.out.println(ExercicioExtra.coluna(frase,colunas));
                break;


        }


    }
}
