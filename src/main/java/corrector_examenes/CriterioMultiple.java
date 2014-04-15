package corrector_examenes;

import java.util.*;

public abstract class CriterioMultiple implements CriterioCorreccion 
{	
	Collection<CriterioCorreccion> _criteriosCorreccion = new ArrayList<CriterioCorreccion>();
	
	public Collection<CriterioCorreccion> getCriteriosCorrecion()
	{
		return _criteriosCorreccion;
	}
	
	public void setCriteriosCorreccion(ArrayList<CriterioCorreccion> criteriosCorreccion)
	{
		_criteriosCorreccion = criteriosCorreccion;
	}
	
	public void agregarCriterioCorreccion(CriterioCorreccion criterioCorreccion)
	{
		_criteriosCorreccion.add(criterioCorreccion);
	}
}