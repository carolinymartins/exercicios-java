import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
       final double PI = 3.14159;
        double raio,base,altura,area;
        int op;
        Scanner leitor;
        leitor = new Scanner(System.in);
        System.out.println("CÁLCULO DE ÁREA DAS FORMAS PLANAS");
        System.out.println("1- Calcular Círculo: ");
        System.out.println("2- Calcular Triângulo: ");
        System.out.println("3- Calcular Quadrado: ");
        System.out.println("4- Calcular Retângulo: ");
        System.out.println("Digite a sua opção: ");
        op = leitor.nextInt();
        switch (op) {

            case 1:
                System.out.println("Digite o raio do círculo:");
                raio = leitor.nextDouble();
                area = PI * Math.pow(raio, 2);
                System.out.println("Área do círculo é: " + area);
                break;
            case 2:
                System.out.println("Digite o base do triângulo: ");
                base = leitor.nextDouble();
                System.out.println("Digite a altura do triângulo: ");
                altura = leitor.nextDouble();
                area = (base * altura) / 2;
                System.out.println("Área do triângulo é: " + area);
                break;
            case 3:
                System.out.println("Digite o lado do quadrado:");
                altura = leitor.nextDouble();
                area = Math.pow(altura, 2);
                System.out.println("Área do quadrado é: " + area);
                break;
            case 4:
                System.out.println("Digite a base do retângulo:");
                base = leitor.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                altura = leitor.nextDouble();
                area = base * altura;
                System.out.println("Área do círculo é: " + area);
                break;
        }
        leitor.close();
    }
}
