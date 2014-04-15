package corrector_examenes;

import java.util.*;

public class CriterioFiltroMayor extends CriterioMultiple
{
	@Override
	public float puntajeTotal(int puntosTotal, float puntaje) 
	{
		Collection<Float> filtrados = (Collection<Float>) this.getCriteriosCorrecion().stream()
							    	  .map(criterio -> criterio.puntajeTotal(puntosTotal, puntaje));
		
		
		return Collections.max(filtrados);
	}
}
