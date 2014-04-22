package corrector_examenes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class CriterioFiltroPromedioTest {
	
	CriterioFiltroPromedio criterioFiltro = new CriterioFiltroPromedio();
	
	@Mock
	CriterioRestarPuntos criterioRestar;
	@Mock
	CriterioRegla3Simple criterio3simple;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		criterioFiltro.agregarCriterioCorreccion(criterioRestar);
		criterioFiltro.agregarCriterioCorreccion(criterio3simple);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPuntajeTotalConRestarYReglaDe3Para16Y14Es7() {
		Mockito.doReturn(8f).when(criterioRestar).puntajeTotal(16, 14f);
		Mockito.doReturn(6f).when(criterio3simple).puntajeTotal(16, 14f);
		Assert.assertTrue((criterioFiltro.puntajeTotal(16, 14f)) == 7f);
	}

}

