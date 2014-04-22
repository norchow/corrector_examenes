package corrector_examenes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CriterioTablaConversionTest {
	private CriterioTablaConversion criterio=new CriterioTablaConversion();;
	
	@Before
	public void setUp() throws Exception {
		criterio.agregarEntradaConversion(16f, 10);
		criterio.agregarEntradaConversion(15f, 9);
		criterio.agregarEntradaConversion(14f, 8);
		criterio.agregarEntradaConversion(13f, 7);
		criterio.agregarEntradaConversion(12f, 6);
		criterio.agregarEntradaConversion(10f, 5);
		criterio.agregarEntradaConversion(9f, 4);
		criterio.agregarEntradaConversion(8f, 3);
	}

	@Test
	public void testObtenerValor6PorClave12EsCorrecto() {
		
		Assert.assertTrue((criterio.obtenerValorPorClave(12f)) == 6);
		
	}
	
	@Test
	public void testObtenerValor10PorClave12EsIncorrecto() {
		
		Assert.assertFalse((criterio.obtenerValorPorClave(12f)) == 10);
		
	}

	@Test
	public void testPuntajeTotalConClave12Es6() {
		Assert.assertTrue((criterio.puntajeTotal(10, 12f)) == 6);
	}

}
