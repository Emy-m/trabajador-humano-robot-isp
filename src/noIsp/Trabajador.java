package noIsp;

public interface Trabajador {

	// El humano tiene que implementar checkeo de bateria o cargar bateria aunque
	// queden vacios sin uso.
	// El robot implementaria pausa para comer o recreo con la misma consecuencia.

	void registrarEntrada();

	void registrarSalida();

	void trabajar();

	void recreo();

	void pausaParaComer();

	void checkeoDeBateria();

	void cargarBateria();
}
