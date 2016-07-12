package session;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import entite.Billet;

@Stateless
public class BilletFacade extends AbstractFacade<Billet> {
	@PersistenceContext
	EntityManager em;

	public BilletFacade() {
		super(Billet.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	public List<Billet> findBetween(Date dtBefore, Date dtAfter) {
		Query query = null;
		List<Billet> billets;
		try {
			query = em.createQuery(
					"From Billet b where b.dateBillet BETWEEN :dtBefore and :dtAfter")
					.setParameter("dtBefore", dtBefore)
				    .setParameter("dtAfter", dtAfter);
			billets = query.getResultList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return billets;
	}

}
