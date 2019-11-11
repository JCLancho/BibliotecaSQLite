package dao;

import java.util.List;

import model.Alumno;

/**
 * Interfaz de Alumno
 * Con los metodos que usara para objetener información de la bbdd
 * @author Lancho
 *
 */
public interface AlumnoDao {

	Alumno find(String dni);
	
	List<Alumno> findAll(Alumno filtro);
	
	void add(String[] valores);
	
	void update(String[] valores, String dni);
	
	void delete(String dni);
	
	void procedureInsertar(String [] valores);
		
	
}
