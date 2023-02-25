import fi.utu.tko2116.lista.OmaArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Huom! Tässä testiluokassa ei ole virheitä, mutta voit huviksesi tutustua syntaksiin.
 *
 * Jos halutaan, että jokin metodi epäonnistuu, ei sen pitäisi heittää poikkeus, voidaan suoritettava koodi antaa
 * lambdalausekkeena assertThrows -metodille, suorittaa koodin ja varmistaa että poikkeus lentää varmasti.
 *
 */

public class TestaaMuitaJuttujaHienommallaSyntaksilla {



    @Test
    public void testaaKiellettyIndeksiHeittääPoikkeuksen() {

        OmaArrayList oma = new OmaArrayList();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> oma.hae(-1));
    }



}
