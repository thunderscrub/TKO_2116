import fi.utu.tko2116.lista.OmaArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayListAlustus {

    @Test
    public void testaaArrayListOnTyhjäAluksi() {
        OmaArrayList oma = new OmaArrayList();
        assertEquals(0,oma.koko());
    }


    @Test
    public void testaaAlkuKapasiteettiEiVaikutaKokoon() {
        OmaArrayList oma = new OmaArrayList(10);
        assertEquals(0,oma.koko());
    }


    @Test
    public void testaaKopionKokoOnSamaKuinAlkuperaisella() {
        OmaArrayList oma = new OmaArrayList();
        oma.lisaa(5);
        oma.lisaa(7);

        OmaArrayList kopio = new OmaArrayList(oma);

        assertEquals(oma.koko(),kopio.koko());

    }

}
