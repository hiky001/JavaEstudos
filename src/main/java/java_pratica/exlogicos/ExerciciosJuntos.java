package java_pratica.exlogicos;

public class ExerciciosJuntos {

    public static void main(String[] args) {
        ex1(6, 4);

    }

    /**
     * Printa dois numeros, do menor para o maior
     * @param valor1 Passe o primeiro valor
     * @param valor2 Passe o segundo valor
     */

    public static void ex1(int valor1, int valor2){

        if (valor1 > valor2){
            System.out.println(valor2 + ", " + valor1);

        } else {
            System.out.println(valor1 + ", " + valor2);
        }
    }

    /**
     * Printa o maior dentre os tres numeros apresentados
     * @param n1 Passe o primeiro número de parâmetro
     * @param n2 Passe o segundo número de parâmetro
     * @param n3 Passe o terceiro número de parâmetro
     */

    private static void ex2(int n1, int n2, int n3){


        System.out.println(n1 + ", " + n2 + ", " + n3);

        if (n1 > n2 && n1 > n3){
            System.out.println("O maior dos numeros é: " + n1);

        }else if (n2 > n1 && n2 > n3){
            System.out.println("O maior dos numeros é: " + n2);

        }else if (n3 > n1 && n3 > n2){
            System.out.println("O maior dos numeros é: " + n3);
        }
    }

    /**
     * Soma e printa os dois maiores valores
     * @param valor1 De o valor1
     * @param valor2  De o valor2
     * @param valor3 De o valor3
     */

    public static void ex3(int valor1, int valor2, int valor3){

        if (valor1 > valor2 & valor1 > valor3 & valor2 > valor3){
            System.out.println("O maior número é: " + (valor1 + valor2));

        }else if (valor2 > valor1 && valor2 > valor3 & valor3 > valor1){
            System.out.println("O maior número é: " + (valor2 + valor3));

        }else if (valor3 > valor1 & valor3 > valor2 & valor1 > valor2){
            System.out.println("O maior número é: " + (valor1 + valor3));
        }
    }

    /**
     * Printa a sequência fibonacci 11 vezes
     */

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

    /**
     * Equação de segundo grau, descobre o valor de delta, passando os parametros a, b, c da equação de
     * segundo grau e printa se delta é igual, maior ou menor que 0
     * @param a Passe o valor de a na equação ax²+bx+c=0
     * @param b Passe o valor de b na equação ax²+bx+c=0
     * @param c Passe o valor de c na equação ax²+bx+c=0
     */

    public static void ex4(double a, double b, double c){

//        double a = 2;     Ex's de valores de a, b, c
//        double b = 6;
//        double c = 4;

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
