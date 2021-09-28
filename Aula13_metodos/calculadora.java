package Aula13_metodos;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
       cabecalho();
       menu();
        
    }
    static void menu(){
        System.out.println("\n 1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir \n 5-Sair");
        System.out.print(" Escolha uma opção:");
    }
    static int ler_numero(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int numero_lido = Integer.parseInt(sc.nextLine());
        return numero_lido;
    }

    static void escolha_menu(int opcao){
        
        switch(opcao){
            case 1: 
                int s1 = ler_numero("Digite um número:");
                int s2 = ler_numero("Digite um número:");
                int r = somar(s1,s2);
                System.out.println("O resultado da soma é: "+r);
            break;

            case 2:
                int sub1 = ler_numero("Digite um número:");
                int sub2 = ler_numero("Digite um número:");
                int r1 = subtrair(sub1, sub2);
                System.out.println("O resultado da subtração é: "+r1);
            break;

            case 3:
                int m1 = ler_numero("Digite um número:");
                int m2 = ler_numero("Digite um número:");
                int r2 = multiplicar(m1, m2);
                System.out.println("O resultado da multiplicação é: "+r2);
            break;

            case 4:
                int d1 = ler_numero("Digite um número:");
                int d2 = ler_numero("Digite um número:");
                int r3 = multiplicar(d1, d2);
            System.out.println("O resultado da divisão é: "+r3);
            break;
            
            case 5:
                System.out.println("---------------Saindo--------------");
            break;

            default:
                System.out.println("Opção Inválida");
            break;           
              
        }
    }

   
    static void cabecalho() {
        System.out.println("========== CALCULADORA ============");
    }  

     static int somar(int n1, int n2){
        int soma = n1 + n2;
        return soma;
    }
    static int subtrair(int n1, int n2){
        int subtracao = n1 - n2;
        return subtracao;
    }

    static int multiplicar(int n1, int n2){
        int multiplicacao = n1 * n2;
        return multiplicacao;
    }
    static int dividir(int n1, int n2){
        int divisao = n1 / n2;
        return divisao;
    }

}
