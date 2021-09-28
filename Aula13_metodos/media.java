package Aula13_metodos;
import java.util.Scanner;

public class media{
    static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
       
        int r;
        double r1;
        cabecalho();
        int somatotal =0;
        int repeticoes = 4;
        for(int i = 0;i < repeticoes ;i++){
            System.out.print("\nInforme um número: ");
            int n1 = Integer.parseInt(sc.nextLine());
            System.out.print("Informe um número: ");
            int n2 = Integer.parseInt(sc.nextLine());
            r = somar(n1,n2);
            System.out.printf("O resultado da soma de %d e %d é: %d", n1,n2,r);
            somatotal = somatotal + r;
        }
        r1 = calculo_media(somatotal,repeticoes);
        System.out.println("\nA média é: " + r1);

        
     }

    static void cabecalho() {
        System.out.println("====== Cálculo de Média =========");
    
    }

    static int somar(int n1, int n2){
        int soma = n1 + n2;
        return soma;
        
        
    }
    static double calculo_media(double somatoria, int divisor){
        double media = somatoria/divisor;
        return media;
    }

}
    


