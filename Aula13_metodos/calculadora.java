package Aula13_metodos;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
       cabecalho();
       menu();
       int opcao = (int)ler_numero("Escolha uma opção: \n");
       escolha_menu(opcao);

        
    }
    static void menu(){
        System.out.println("\n 1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir \n 5-Sair");
        
    }
    static double ler_numero(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        double numero_lido = Double.parseDouble(sc.nextLine());
        return numero_lido;
    }

    
    static void escolha_menu(int opcao){
            switch(opcao){
            case 1:
                double s1 = ler_numero("Digite um número:");
                double s2 = ler_numero("Digite um número:");
                double r = somar(s1,s2);
                System.out.println("O resultado da soma é: "+r);
            break;

            case 2:
                double sub1 = ler_numero("Digite um número:");
                double sub2 = ler_numero("Digite um número:");
                double r1 = subtrair(sub1, sub2);
                System.out.println("O resultado da subtração é: "+r1);
            break;

            case 3:
                double m1 = ler_numero("Digite um número:");
                double m2 = ler_numero("Digite um número:");
                double r2 = multiplicar(m1, m2);
                System.out.println("O resultado da multiplicação é: "+r2);
            break;

            case 4:
                double d1 = ler_numero("Digite um número:");
                double d2 = ler_numero("Digite um número:");
                double r3 = dividir(d1, d2);
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

     static double somar(double n1, double n2){
        double soma = n1 + n2;
        return soma;
    }
    static double subtrair(double n1, double n2){
        double subtracao = n1 - n2;
        return subtracao;
    }

    static double multiplicar(double n1, double n2){
        double multiplicacao = n1 * n2;
        return multiplicacao;
    }
    static double dividir(double n1, double n2){
        double divisao = n1 / n2;
        return divisao;
    }

}
