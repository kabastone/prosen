package entite;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Table(name="clients")
public class Client implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NUM_CLIENT")
	private Long numClient;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "TELEPHONE")
	private String telephone;
	@Column(name = "ADRESSE")
	private String adresse;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="client")
	Set<Facturation> facturations;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public Long getNumClient() {
		return this.numClient;
	}

	public void setNumClient(Long numClient) {
		this.numClient = numClient;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Set<Facturation> getFacturations() {
		return facturations;
	}
	public void setFacturations(Set<Facturation> facturations) {
		this.facturations = facturations;
	}
   
}
