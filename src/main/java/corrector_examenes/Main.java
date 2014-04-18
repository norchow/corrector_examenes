package corrector_examenes;

public class Main {
	public void main(){
		CriterioRestarPuntos crit1 = new CriterioRestarPuntos();
		crit1.setPuntosARestar(6);
		CriterioRegla3Simple crit2 = new CriterioRegla3Simple();
		CriterioFiltroPromedio criterio = new CriterioFiltroPromedio();
		criterio.agregarCriterioCorreccion(crit1);
		criterio.agregarCriterioCorreccion(crit2);
		float puntajeTotal = criterio.puntajeTotal(16, 14f);
		System.out.print(puntajeTotal);
	}
	
}
 