package corrector_examenes;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PreguntaMultipleChoiceTest {
    
    private PreguntaMultipleChoice preguntaMultipleChoice = new PreguntaMultipleChoice();
    @Before
    public void setUp() throws Exception {
        preguntaMultipleChoice.agregarOpcion(1, "respuesta 1");
        preguntaMultipleChoice.agregarOpcion(2, "respuesta 2");
        preguntaMultipleChoice.agregarOpcion(3, "respuesta 3");
        preguntaMultipleChoice.agregarOpcion(4, "respuesta 4");
        preguntaMultipleChoice.setOpcionCorrecta(3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEsCorrectaTrue() {
        Assert.assertTrue((preguntaMultipleChoice.esCorrecta(3)));
    }
    
    @Test
    public void testEsCorrectaFalse() {
        Assert.assertFalse((preguntaMultipleChoice.esCorrecta(2)));
    }


}
