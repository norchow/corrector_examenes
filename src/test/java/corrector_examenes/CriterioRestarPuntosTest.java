package corrector_examenes;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CriterioRestarPuntosTest {
	
	private CriterioRestarPuntos criterio = new CriterioRestarPuntos();
	
	@Before
	public void setUp() throws Exception {
		criterio.setPuntosARestar(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPuntajeTotalCuandoRecibe10DePuntosTotalY20DePuntaje() {
		
		Assert.assertEquals("El puntaje total deberia ser 10f", 10f, criterio.puntajeTotal(10, 10f));
	}
}
