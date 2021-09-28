package Aula13_metodos;

public class calculadora {
    public static void main(String[] args) {
       cabecalho();
       menu();
        
    }
    static void menu(){
        System.out.println("\n 1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir");
        System.out.print(" Escolha uma opção:");
    }
    static void escolha_menu(){
        
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
