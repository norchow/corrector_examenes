package corrector_examenes;

public abstract class Pregunta 
{
	private String _enunciado;
	
	private int _pesoEspecifico;
	
	public String getEnunciado()
	{
		return _enunciado;
	}
	
	public void setEnunciado(String unEnunciado)
	{
		_enunciado = unEnunciado;
	}
	
	public int getPesoEspecifico()
	{
		return _pesoEspecifico;
	}
	
	public void setPesoEspecifico(int unPesoEspecifico)
	{
		_pesoEspecifico = unPesoEspecifico;
	}
	
	public abstract boolean esCorrecta(Object unaRespuesta);
}
