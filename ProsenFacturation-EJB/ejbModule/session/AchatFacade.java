package session;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entite.Achat;

@Stateless
public class AchatFacade extends AbstractFacade<Achat> {
	@PersistenceContext
	EntityManager em;

	public AchatFacade() {
		super(Achat.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	public Long findLast() {
		Query query;

		// Patient p = new Patient();
		query = em.createQuery("Select MAX(a.numAchat) from Achat a ");

		return (Long) query.getSingleResult();
	}

	public List<Achat> getlistachat(Date debut, Date fin) {
		return em
				.createQuery(
						" from Achat a where a.dateAchat between :debut and :fin")
				.setParameter("debut", debut).setParameter("fin", fin).getResultList();
	}
   public Boolean delete(Object obj){
	   try{
	   em.createQuery("delete from Achat a where a.numPiece=:obj")
          .setParameter("obj", obj).executeUpdate();
	   }catch(Exception e){
		   return false;
	   }
	   return true;
   }
}
