package corrector_examenes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;


public class CriterioFiltroPromedioTest {
	
	private CriterioFiltroMayor criterioFiltro = new CriterioFiltroMayor();
	
	@MockitoAnnotations.Mock
	private CriterioRestarPuntos criterio1;
	private CriterioRegla3Simple criterio2;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		criterioFiltro.agregarCriterioCorreccion(criterio1);
		criterioFiltro.agregarCriterioCorreccion(criterio2);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPuntajeTotal() {
		fail("Not yet implemented");
	}

}

