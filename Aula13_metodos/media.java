package Aula13_metodos;

public class media{
 
     public static void main(String[] args) {
         
        cabecalho();
        somar(10, 20);
     }

    static void cabecalho() {
        System.out.println("====== Cálculo de Média =========");
    
    }

    static int somar(int n1, int n2){
        int soma = n1 + n2;
        return soma;
        
    }

}
    


