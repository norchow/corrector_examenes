package corrector_examenes;

public class PreguntaVoF extends Pregunta
{
	private boolean _respuesta;
	
	public boolean getRespuesta()
	{
		return _respuesta;
	}
	
	public void setRespuesta(boolean unaRespuesta)
	{
		_respuesta = unaRespuesta;
	}
	
	@Override
	public boolean esCorrecta(Object unaRespuesta)
	{
		return _respuesta == (boolean)unaRespuesta;
	}
}
