package java_pratica.media;

public class MediaNota {

    public static void main (String[] args) {

        double nota1 = 7;
        double nota2 = 4;
        double nota3 = 7.5;

        System.out.println("Nota 1 é 7, nota 2 é 4, e nota 3 é 7.5"+ "\n");

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media do aluno: " + media);

        if (media >= 9) {

            System.out.println("Nota Conceito do aluno é A!");

        }  else if(media >= 7.5 && media < 9){

            System.out.println("Nota Conceito do aluno é B");

        } else if (media >= 6 && media < 7.5){

            System.out.println("Nota conceito do aluno é C");

        } else if(media >= 4 && media <6){

            System.out.println("Nota conceito do aluno é D");

        } else {

            System.out.println("Nota conceito do aluno é E");
        }

    }
}
