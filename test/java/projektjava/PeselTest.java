package projektjava;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static java.lang.String.valueOf;
import static junit.framework.TestCase.assertTrue;

import static junit.framework.TestCase.assertFalse;

public class PeselTest {

    CheckPesel pesel;
    final static Logger logger = Logger.getLogger(valueOf(CheckPesel.class));

    @Before
    public void setUp()
    {
        logger.info("Odpalam setUp");
        pesel = new CheckPesel();
    }

    @Test
    public void CorrectPesel()//pesel poprawny
    {
        String pesel = "98072105882";
        assertTrue(CheckPesel.IsValidPesel(pesel));
    }

    @Test
    public void InCorrectPesel()//pesel ze zła liczba kontrolna
    {
        String pesel = "98072105883";
        assertFalse(CheckPesel.IsValidPesel(pesel));
    }

    @Test
    public void ShortPesel()//za krotki pesel
    {
        String pesel="6721813";
        assertFalse(CheckPesel.IsValidPesel(pesel));
    }





}
