package corrector_examenes;

import java.util.*;

public class CriterioTablaConversion implements CriterioCorreccion 
{
	Map<Float, Integer> _tablaConversion = new HashMap<Float, Integer>();
	
	public Map<Float, Integer> getTablaConversion()
	{
		return _tablaConversion;
	}
	
	public void setTablaConversion(HashMap<Float, Integer> unaEntrada)
	{
		_tablaConversion = unaEntrada;
	}
	
	public void agregarEntradaConversion(Float clave, int valor)
	{
		_tablaConversion.put(clave,valor);
	}
	
	public int obtenerValorPorClave(float puntaje)
	{
		return _tablaConversion.get(puntaje);
	}
	
	@Override
	public float puntajeTotal(int puntosTotal, float puntaje) 
	{
		return this.obtenerValorPorClave(puntaje);
	}
}
