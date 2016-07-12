package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entite.Billet;
import entite.Client;
import entite.Facturation;

@Stateless
public class ClientFacade extends AbstractFacade<Client> {
	@PersistenceContext
	EntityManager em;
	public ClientFacade() {
		super(Client.class);
		
	}

	@Override
	protected EntityManager getEntityManager() {
		
		return em;
	}
	public Client findByName(String nom){
		Query query;
		Client c = new Client();
		try{
		query= em.createQuery("From Client c where c.nom = :nom")
				         .setParameter("nom", nom);
		c = (Client) query.getSingleResult();
		}catch(Exception e){
			return null;
		}
		return c ;
		
	}

	public void removeCascade(Client c) {
		Query q = null;
		try{
			q = em.createQuery("From Client c where c.numClient :=numClient")
					.setParameter("numClient", c.getNumClient());
			c = (Client) q.getSingleResult();
			for(Facturation f : c.getFacturations() )
					{
				      for(Billet b : f.getBillets()){
				    	  em.remove(b);
				      }
				      em.remove(f);
					}
			em.remove(c);
		}catch(Exception e){
			
		}
		
	}

	public Client add(Client client) {
		em.persist(client);
		em.flush();
		return client;
	}
}
