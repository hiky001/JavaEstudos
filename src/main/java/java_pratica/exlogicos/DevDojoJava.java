package java_pratica.exlogicos;

public class DevDojoJava {

    public static void main(String[] args) {
        ReutilizandoVariaveis();

    }

    public static void PorcentagemSalario() {

        double porcentagem = 30D;
        double salario = 1200.00F;

        double porcentagemDoSalario = (porcentagem * salario) / 100;
        System.out.println(" Porcentagem do salario é: " + porcentagemDoSalario);
    }

    public static void ReutilizandoVariaveis() {

        double salario = 5000;
        double resultado = salario * 30 / 100;
        System.out.println("30% do salario é " + resultado);

        resultado = salario * 0.15;
        System.out.println("15% do salario é " + resultado);

        resultado = salario * 0.05;
        System.out.println("5% do salario é " + resultado);
    }


}
