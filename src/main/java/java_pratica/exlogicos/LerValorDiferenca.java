package java_pratica.exlogicos;

public class LerValorDiferenca {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 7;
        System.out.println("Número 1 é: " + n1 +" e número 2 é: " + n2 + "\n");

        if (n1 < n2){

            double resultado = n2 - n1;
            System.out.println("Diferença do maior número pelo menor número é: " + resultado);

        } else {

            double resultado = n1 - n2;
            System.out.println("Diferença do maior número pelo menor número é: " + resultado);
        }

    }

}
