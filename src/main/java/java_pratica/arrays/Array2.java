package java_pratica.arrays;

public class Array2 {

    //byte, short, int, long, float, double = 0 (Valor padrão desse tipo de array)
    //char '\u0000' (Valor espaço vazio para array do tipo char)
    //boolean (Valor false para array do tipo boolean)
    //reference Ex:String (Valor null para array de referência a um objeto)

    public static void main(String[] args) {
        int [] ex1 = new int[2];
        char [] ex2 = new char[2];
        boolean [] ex3 = new boolean[2];
        String [] ex4 = new String[2];

        System.out.println(ex1[0]);
        System.out.println(ex1[1]);

        System.out.println(ex2[0]);
        System.out.println(ex2[1]);

        System.out.println(ex3[0]);
        System.out.println(ex3[1]);

        System.out.println(ex4[0]);
        System.out.println(ex4[1]);

    }
}
