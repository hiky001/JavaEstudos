package java_pratica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteVeiculo {
    private static Veiculo gm = new Veiculo();

    @BeforeAll
    public static void iniciaTudo(){
        gm.setModelo("Cruze");
        gm.setCor("Preto");
        gm.setAno("2020");

    }

    @Test
    public void testecor(){

        Assertions.assertEquals("Cruze", gm.getModelo(), "Veiculo está com o modelo incorreto");
        Assertions.assertEquals("Preto", gm.getCor());
        Assertions.assertEquals("2020", gm.getAno());

    }
}
