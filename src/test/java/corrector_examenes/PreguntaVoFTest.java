package corrector_examenes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PreguntaVoFTest {

	private PreguntaVoF preguntaVoF = new PreguntaVoF();
	
	@Before
	public void setUp() throws Exception {
		preguntaVoF.setRespuesta(true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEsCorrectaTrue() {
		Assert.assertTrue((preguntaVoF.esCorrecta(true)));
	}
	
	@Test
	public void testEsCorrectaFalse() {
		Assert.assertFalse((preguntaVoF.esCorrecta(false)));
	}

}
