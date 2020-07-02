package java_pratica.media;

public class ConsumoMedio {

    public static void main (String[] args) {

        double distanciaPercorrida = 60;     // Distância percorrida em Km
        double combustivelUsado = 12;        // Combustivel consumido em Litros

        double consumoMedio = distanciaPercorrida / combustivelUsado;

        System.out.println("Dado a distancia percorrida pelo automovel de 60 Km, e seu consumo total de 12 litros, tem se " +
                " em media " + consumoMedio + " Km por litro consumidos pelo carro" + "\n");
        System.out.println("O consumo médio é de 1L de combustível a cada 5Km percorridos");
    }
}
