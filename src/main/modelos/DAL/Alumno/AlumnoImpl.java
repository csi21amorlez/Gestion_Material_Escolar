package main.modelos.DAL.Alumno;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class AlumnoImpl implements AlumnoService {

	@PersistenceContext
	EntityManager em;

	@Override
	public void insertarAlumno(Alumno alumno) {
		em.persist(alumno);

	}

	@Override
	public Alumno findByNombre(String nombre) {
		String sql = "From Alumno a where a.nombre=" + nombre;
		return (Alumno) em.createQuery(sql).getSingleResult();

	}

	@Override
	public void eliminarAlumno(Alumno alumno) {
		em.remove(alumno);

	}

	@Override
	public ArrayList<Alumno> buscarTodos() {
		String sql = "From Alumno a";
		return (ArrayList<Alumno>) em.createQuery(sql);
	}

}
