package corrector_examenes;

import java.util.*;
import java.util.stream.Collectors;

public class CriterioFiltroPromedio extends CriterioMultiple
{
	@Override
	public float puntajeTotal(int puntosTotal, float puntaje) 
	{
		ArrayList<Float> filtrados = (ArrayList<Float>) this.getCriteriosCorrecion().stream()
							    	  .map(criterio -> criterio.puntajeTotal(puntosTotal, puntaje))
							    	  .collect(Collectors.toList());
		
		float suma = filtrados.stream()
					.reduce(0f, (acum, valor) -> acum + valor);
		
		return suma / filtrados.size();
	}
}
