package session;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entite.Client;
import entite.Facturation;

@Stateless
public class FacturationFacade extends AbstractFacade<Facturation> {
	@PersistenceContext
	EntityManager em;
	public FacturationFacade() {
		super(Facturation.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	public Set<Facturation> getFactures(Client client) {
		Query query = em.createQuery("From Facturation f where f.client = :client and f.deleted = :deleted")
		                .setParameter("client", client)
		                .setParameter("deleted", false);
		Set<Facturation> facturations = new HashSet<Facturation>();
		facturations.addAll(query.getResultList());
		return facturations ;
	}
	public List<Facturation> findInvoices(String keyword){
		Query query = em.createQuery("From Facturation f where f.client.nom like :keyword and f.deleted = :deleted")
				        .setParameter("keyword",  keyword + "%")
				        .setParameter("deleted", false);
		return query.getResultList();
		
	}
	public List<Facturation> getlistfacture(Date value, Date value2) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Facture f WHERE f.dateFacture BETWEEN :value AND :value2")
				.setParameter("value", value).setParameter("value2", value2);
		return query.getResultList();
	}
}
