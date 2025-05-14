import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int dia,mes,ano, diasMes=0, totalDias=0;
        boolean bissexto =true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia:");
        dia = entrada.nextInt();
        System.out.println("Digite o mês:");
        mes = entrada.nextInt();
        System.out.println("Digite o ano:");
        ano = entrada.nextInt();

       bissexto = (ano % 4 ==0 && ano % 100 !=0) || (ano % 400 == 0);


       if(mes < 1 && mes > 12){
           System.out.println("Mês inválido");
       }
       else
       {
           if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
               diasMes = 31;
           } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
               diasMes = 30;
           } else{
               if(bissexto)
                   diasMes = 29;
               else
                   diasMes= 28;
           }

           if (dia < 1 && dia > diasMes )
           {
               System.out.println("Dia inválido!");
           }
           else
           {
               for(int i=1; i<mes;i++)
               {
                   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                   {
                       totalDias += 31;

                   } else if (i == 4 || i == 6 || i == 9 || i == 11){
                       totalDias += 30;

                   } else{
                       if(bissexto)
                           totalDias += 29;
                       else
                           totalDias += 28;
                   }
               }
               totalDias+= dia;
               System.out.println("Dias desde 1º de janeiro: " + totalDias);

           }
       }
    }
}
