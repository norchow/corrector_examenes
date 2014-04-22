package corrector_examenes;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CriterioRegla3SimpleTest {

	private CriterioRegla3Simple criterio = new CriterioRegla3Simple();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPuntajeTotalEs10SiPuntosTotalEs10YPuntajeEs10() {
		
		Assert.assertEquals("El puntaje total deberia ser 10f", 10f, criterio.puntajeTotal(10, 10f));
	}
	


}
