package corrector_examenes;

public class CriterioRegla3Simple implements CriterioCorreccion 
{	
	@Override
	public float puntajeTotal(int puntosTotal, float puntaje) 
	{
		return puntaje * 10 / puntosTotal;
	}
}