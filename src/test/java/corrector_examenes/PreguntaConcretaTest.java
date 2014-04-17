package corrector_examenes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PreguntaConcretaTest {

	private PreguntaConcreta preguntaConcreta = new PreguntaConcreta();
	
	@Before
	public void setUp() throws Exception {	
		preguntaConcreta.setRespuesta("respuesta correcta");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEsCorrectaTrue() {
		Assert.assertTrue((preguntaConcreta.esCorrecta("respuesta correcta")));
	}
	
	@Test
	public void testEsCorrectaFalse() {
		Assert.assertFalse((preguntaConcreta.esCorrecta("respuesta incorrecta")));
	}

}
