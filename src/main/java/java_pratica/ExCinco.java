package java_pratica;

public class ExCinco {

    public static void main (String[] args) {

        int n1 = 7;
        int n2 = 16;
        int n3 = 28;
        int n4 = 4;
        int n5 = 9;
        int n6 = 13;
        int n7 = 8;
        int n8 = 6;
        int n9 = 32;
        int n10 = 3;

        double somatoria = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);
        double media = (somatoria / 10);

        System.out.println("Valor 1: " + n1 + " Valor 2: " + n2 + " Valor 3: " + n3 + " Valor 4: " + n4 + " Valor 5: " + n5 +
        " Valor 6: " + n6 + " Valor 7: " + n7 + " Valor 8: " + n8 + " Valor 9: " + n9 + " Valor 10: " + n10 + "\n");

        System.out.println("Somatória dos valores: " + somatoria);
        System.out.println("Média dos valores: " + media);
    }
}
