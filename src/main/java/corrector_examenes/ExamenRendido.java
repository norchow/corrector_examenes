package corrector_examenes;

import java.util.*;

public class ExamenRendido 
{
	private Alumno _alumno;
	
	private Examen _examen;
	
	private ArrayList<Object> _respuestas = new ArrayList<Object>();
	
	public void setAlumno(Alumno unAlumno)
	{
		_alumno = unAlumno;
	}
	
	public Alumno getAlumno()
	{
		return _alumno;
	}
	
	public void setExamen(Examen unExamen)
	{
		_examen = unExamen;
	}
	
	public Examen getExamen()
	{
		return _examen;
	}
	
	public void setRespuestas(ArrayList<Object> unasRespuestas)
	{
		_respuestas = unasRespuestas;
	}
	
	public Collection<Object> getRespuestas()
	{
		return _respuestas;
	}

	public void agregarRespuesta(Object respuesta)
	{
		_respuestas.add(respuesta);
	}

	public float puntajeObtenido()
	{
		return _examen.corregir(_respuestas);
	}
}
