package corrector_examenes;

public class PreguntaConcreta extends Pregunta
{
	private String _respuesta;
	
	public String getRespuesta()
	{
		return _respuesta;
	}
	
	public void setRespuesta(String unaRespuesta)
	{
		_respuesta = unaRespuesta;
	}
	
	@Override
	public boolean esCorrecta(Object unaRespuesta) 
	{
		return _respuesta == (String)unaRespuesta;
	}
}
