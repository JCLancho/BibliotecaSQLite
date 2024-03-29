package dao;

import java.util.List;

import model.Asignatura;

public interface AsignaturaDao {

	Asignatura find(Long cod_asignatura);
	
	List<Asignatura> findAll(Asignatura filtro);
	
	void add(String[] valores);
	
	void update(String[] valores, String cod_asignatura);
	
	void delete(String cod_asignatura);
		
	
}
