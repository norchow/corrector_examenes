package corrector_examenes;

public class CriterioRestarPuntos implements CriterioCorreccion 
{
	private int _puntosARestar;
	
	public int getPuntosARestar()
	{
		return _puntosARestar;
	}
	
	public void setPuntosARestar(int puntosARestar)
	{
		_puntosARestar = puntosARestar;
	}
	
	@Override
	public float puntajeTotal(int puntosTotal, float puntaje) 
	{
		return puntaje - _puntosARestar;
	}
}
