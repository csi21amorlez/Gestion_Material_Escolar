package main.modelos.DAL.Portatil;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class PortatilImpl implements PortatilService {

	@PersistenceContext
	EntityManager em;

	@Override
	public Portatil findByCodigo(String codigo) {
		String sql = "FROM Portatil p where p.codPortatil = " + codigo;
		return (Portatil) em.createQuery(sql).getSingleResult();
	}

	@Override
	public ArrayList<Portatil> buscarTodos() {
		String sql = "FROM Portatil p";
		return (ArrayList<Portatil>) em.createQuery(sql).getResultList();
	}

	@Override
	public void insertarPortatil(Portatil portatil) {
		em.persist(portatil);

	}

	@Override
	public void eliminarPortatil(Portatil portatil) {
		em.remove(portatil);

	}

}
