package tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.*;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;


public class TestsFront extends TestBase {

    public static IndexPage indexPage;
    public static ItemPageOne itemPageOne;
    public static ItemPageTwo itemPageTwo;
    public static ItemPageThree itemPageThree;
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    @Before
    public void beforeClass(){
        indexPage = new IndexPage();
        itemPageOne = new ItemPageOne();
        itemPageTwo = new ItemPageTwo();
        itemPageThree = new ItemPageThree();
    }

    @Test
    public void testElementValid() {

        LOGGER.info("Comienza el test");
        indexPage.sendInput("Alexa");
        indexPage.clickButtonSearch();
        itemPageOne.clickButtonNext();
        itemPageTwo.ThreeElement();
        itemPageThree.findButtonAdd();
        String textButtonCart = itemPageThree.textAddCart() ;

        assertEquals(textButtonCart,"Agregar al Carrito");

    }

    @After
    public void afterClass(){
        System.out.println("Fin del test.");
    }

}