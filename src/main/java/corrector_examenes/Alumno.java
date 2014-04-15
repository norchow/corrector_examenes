package corrector_examenes;

import java.util.*;

public class Alumno {
	private String _nombre;
	
	private Collection<Examen> _examenes = new ArrayList<Examen>();
	
	public String getNombre()
	{
		return _nombre;
	}
	
	public void setNombre(String unNombre)
	{
		_nombre = unNombre;
	}
	
	public Collection<Examen> getExamenes()
	{
		return _examenes;
	}
	
	public void setExamenes(ArrayList<Examen> unosExamenes)
	{
		_examenes = unosExamenes;
	}
	
	public void agregarExamen(Examen unExamen)
	{
		_examenes.add(unExamen);
	}
}
