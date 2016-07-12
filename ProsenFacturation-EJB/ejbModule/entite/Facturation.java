package entite;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "facturations")
public class Facturation implements Serializable,Comparable<Facturation> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Facturation() {
		super();
		this.solde = 0d;
		this.deleted=false;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "NUM_FACTURE")
	private Long numFacture;
	@Column(name = "DATE_FACTURE")
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CLIENT_ID",nullable=false)
	private Client client;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy="facturation")
	Set<Billet> billets;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Set<Reglement> reglements;
	@Column(name = "NUM_STATUS")
	private boolean statut;
	@Column(name = "DELETED")
	private boolean deleted;
	@Column(name = "SOLDE")
	private Double solde;
	public Long getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(Long numFacture) {
		this.numFacture = numFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Set<Billet> getBillets() {
		return billets;
	}

	public void setBillets(Set<Billet> billets) {
		this.billets = billets;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public boolean getStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public Set<Reglement> getReglements() {
		return reglements;
	}

	public void setReglements(Set<Reglement> reglements) {
		this.reglements = reglements;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int compareTo(Facturation arg0) {
		// TODO Auto-generated method stub
		return getDateFacture().compareTo(arg0.getDateFacture());
	}
    
}