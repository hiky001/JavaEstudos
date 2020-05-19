package java_pratica;

public class ExerciciosJuntos {

    public static void main(String[] args) {
        ex4();

    }


    public static void ex1(){
        int valor1 = 8;
        int valor2 = 3;

        if (valor1 > valor2){
            System.out.println(valor2 + ", " + valor1);

        } else {
            System.out.println(valor1 + ", " + valor2);
        }
    }

    public static void ex2(){

        int n1 = 10;
        int n2 = 13;
        int n3 = 6;
        System.out.println(n1 + ", " + n2 + ", " + n3);

        if (n1 > n2 && n1 > n3){
            System.out.println("O maior dos numeros é: " + n1);

        }else if (n2 > n1 && n2 > n3){
            System.out.println("O maior dos numeros é: " + n2);

        }else if (n3 > n1 && n3 > n2){
            System.out.println("O maior dos numeros é: " + n3);
        }
    }


    public static void ex3(){

        int valor1 = 12;
        int valor2 = 3;
        int valor3 = 7;

        if (valor1 > valor2 & valor1 > valor3 & valor2 > valor3){
            System.out.println("O maior número é: " + (valor1 + valor2));

        }else if (valor2 > valor1 && valor2 > valor3 & valor3 > valor1){
            System.out.println("O maior número é: " + (valor2 + valor3));

        }else if (valor3 > valor1 & valor3 > valor2 & valor1 > valor2){
            System.out.println("O maior número é: " + (valor1 + valor3));
        }
    }

    public static void ex5(){

        int anterior = 0;
        int atual = 0;
        int proximo = 1;
        System.out.println("Sequência Fibonacci começa em , Atual = " + atual + ", " + "Próximo = " + proximo);

        for (int i = 0; i < 11; i++) {

            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
            System.out.println(proximo);
        }
    }

    public static void ex4(){

        double a = 2;
        double b = 6;
        double c = 4;

        double delta = (b * b) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta == 0) {

            System.out.println("Equação possui apenas um resultado real(delta = 0), Delta = "
                    + delta + " X1 = " + x1);

        }else if (delta > 0){

            System.out.println("Equação possui dois resultado reais (delta maior que 0), Delta = "
                    + delta + " X1 = " + x1 + " e X2 = " + x2);

        }else if (delta < 0){

            System.out.println("Equação não possui resualtado real (delta menor que 0)");
        }
    }


}
