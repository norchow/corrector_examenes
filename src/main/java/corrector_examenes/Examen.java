package corrector_examenes;

import java.util.*;

public class Examen 
{
	private ArrayList<Pregunta> _preguntas = new ArrayList<Pregunta>();
	
	private CriterioCorreccion _criterioCorreccion;
	
	public Collection<Pregunta> getPreguntas()
	{
		return _preguntas;
	}
	
	public void setPreguntas(ArrayList<Pregunta> unasPreguntas)
	{
		_preguntas = unasPreguntas;
	}
	
	public CriterioCorreccion getCriterioCorrecion()
	{
		return _criterioCorreccion;
	}
	
	public void setCriterioCorrecion(CriterioCorreccion unCriterio)
	{
		_criterioCorreccion = unCriterio;
	}
	
	public void agregarPregunta(Pregunta unaPregunta)
	{
		_preguntas.add(unaPregunta);
	}

	public int puntos()
    {
		return _preguntas.stream().mapToInt(pregunta->pregunta.getPesoEspecifico()).sum();
    }

	public float corregir(ArrayList<Object> respuestas)
	{
		float puntaje = 0f;
		
		for(int i=0;i <= _preguntas.size()-1; i++)
		{
			if(_preguntas.get(i).esCorrecta(respuestas.get(i)))
			{
				puntaje = puntaje + _preguntas.get(i).getPesoEspecifico();
			}	
		};
		
		return _criterioCorreccion.puntajeTotal(this.puntos(), puntaje);
	}
}
