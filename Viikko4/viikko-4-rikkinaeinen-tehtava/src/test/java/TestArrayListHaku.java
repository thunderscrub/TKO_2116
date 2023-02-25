import fi.utu.tko2116.lista.OmaArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayListHaku {


    @Test
    public void testaaListaSisältääLisätynArvon() {
        int arvo = 9;
        OmaArrayList oma = new OmaArrayList();
        oma.lisaa(arvo);

        assertEquals(true,oma.sisaltaako(arvo));
    }

    @Test
    public void testaaOlematonArvonIndeksiOnMiinusYksi() {
        int arvo = 9;
        int eilöydy = arvo-1;
        OmaArrayList oma = new OmaArrayList();
        oma.lisaa(arvo);

        assertEquals(-1,oma.indeksi(eilöydy));
    }


}
