package dao;

import java.util.List;

import model.Prestamo;

public interface PrestamoDao {

	Prestamo find(String[] keys);
	
	List<Prestamo> findAll(Prestamo filtro);
	
	void add(String[] valores);
	
	void update(String[] valores, String[] keys);
	
	void delete(String[] keys);
		
	
}
