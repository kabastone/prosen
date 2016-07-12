package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entite.Fonction;
@Stateless
public class FonctionFacade extends AbstractFacade<Fonction> {
@PersistenceContext
private EntityManager em;
	public FonctionFacade() {
		super(Fonction.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
