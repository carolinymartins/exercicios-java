import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       int mes;
       double valor, juros, parcela, prestacao, totalJuros, jurosMensal, saldoDev, somaJuros =0;
       String tabulado;
        System.out.println("Valor do empréstimo: ");
        valor = leitor.nextDouble();
        System.out.println("Meses: ");
        mes = leitor.nextInt();
        System.out.println("Juros mensais (%):");
        juros = leitor.nextDouble() / 100;

        parcela = valor/mes;
        saldoDev = valor;
        System.out.println(String.format("%-5s %-10s %-10s %-12s %-17s", "MÊS", "PARCELA", "JUROS", "PRESTAÇÃO", "SALDO DEVEDOR"));
        for (int i=1; i <= mes; i++)
        {
            totalJuros = saldoDev * juros;
            saldoDev -= parcela;
            prestacao = parcela + totalJuros;
            somaJuros += totalJuros;

            tabulado = String.format("%-5d %-10.2f %-10.2f %-12.2f %-17.2f",i, parcela, totalJuros, prestacao, saldoDev);
            System.out.println(tabulado);


        }
        System.out.println("TOTAL DE JUROS PAGO: R$" + String.format("%-12.2f", somaJuros));
        leitor.close();
    }
}
