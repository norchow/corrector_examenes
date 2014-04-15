package corrector_examenes;

import java.util.*;

public class PreguntaMultipleChoice extends Pregunta
{
	private int _opcionCorrecta;
	
	Map<Integer, String> _opciones = new HashMap<Integer, String>();
	
	public int getOpcionCorrecta()
	{
		return _opcionCorrecta;
	}
	
	public void setOpcionCorrecta(int unaOpcionCorrecta)
	{
		_opcionCorrecta = unaOpcionCorrecta;
	}
	
	public Map<Integer, String> getOpciones()
	{
		return _opciones;
	}
	
	public void setOpciones(HashMap<Integer,String> unasOpciones)
	{
		_opciones = unasOpciones;
	}
	
	public void agregarOpcion(int indiceOpcion, String respuestaOpcion)
	{
		_opciones.put(indiceOpcion, respuestaOpcion);
	}
	
	@Override
	public boolean esCorrecta(Object unaRespuesta)
	{
		return _opcionCorrecta == (int)unaRespuesta;
	}
}
