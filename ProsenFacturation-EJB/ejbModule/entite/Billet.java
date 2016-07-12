package entite;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Billet
 *
 */
@Entity
@Table(name = "billets")
public class Billet implements Serializable {

	   
	@Id
	@Column(name="NUM_BILLET")
	private String numBillet;
	@Column(name="COMPAGNIE")
	private String compagnie;
	@Column(name="BENEFICIAIRE")
	private String beneficiaire;
	@Column(name="PARCOURS")
	private String parcours;
	@Column(name="MONTANT")
	private Double montant;
	@Column(name="DATE")
	private Date dateBillet;
	@Column(name="COMMISSION")
	private Double commission;
	@Column(name="TARIF_TTC")
	private Double tarifTTC;
	@Column(name="TARIF_HFEES")
	private Double tarifHFEES;
	@Column(name="TARIF_Agence")
	private Double tarifAgence;
	@Column(name="TARIF_HC")
	private Double tarifHC;
	@Column(name="MARGE_TOTALE")
	private Double margeTotale;
	@Column(name="MARGE_Agence")
	private Double margeAgence;
	@Column(name="MARGE_PROSEN")
	private Double margeProsen;
	@Column(name="NOM_AGENCE")
	private String agence;
	@ManyToOne
	Facturation facturation;
	private static final long serialVersionUID = 1L;

	public Billet() {
		super();
	}   
	public String getNumBillet() {
		return this.numBillet;
	}

	public void setNumBillet(String numBillet) {
		this.numBillet = numBillet;
	}   
	public String getCompagnie() {
		return this.compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}   
	public String getBeneficiaire() {
		return this.beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}   
	public String getParcours() {
		return this.parcours;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}   
	public Double getMontant() {
		return this.montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Date getDateBillet() {
		return dateBillet;
	}
	public void setDateBillet(Date dateBillet) {
		this.dateBillet = dateBillet;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	public Double getTarifTTC() {
		return tarifTTC;
	}
	public void setTarifTTC(Double tarifTTC) {
		this.tarifTTC = tarifTTC;
	}

	public Double getMargeTotale() {
		return margeTotale;
	}
	public void setMargeTotale(Double margeTotale) {
		this.margeTotale = margeTotale;
	}
	
	public Double getTarifAgence() {
		return tarifAgence;
	}
	public void setTarifAgence(Double tarifAgence) {
		this.tarifAgence = tarifAgence;
	}
	public Double getMargeAgence() {
		return margeAgence;
	}
	public void setMargeAgence(Double margeAgence) {
		this.margeAgence = margeAgence;
	}
	public String getAgence() {
		return agence;
	}
	public void setAgence(String agence) {
		this.agence = agence;
	}
	public Double getMargeProsen() {
		return margeProsen;
	}
	public Double getTarifHFEES() {
		return tarifHFEES;
	}
	public void setTarifHFEES(Double tarifHFEES) {
		this.tarifHFEES = tarifHFEES;
	}
	public void setMargeProsen(Double margeProsen) {
		this.margeProsen = margeProsen;
	}
	public Double getTarifHC() {
		return tarifHC;
	}
	public Facturation getFacturation() {
		return facturation;
	}
	public void setFacturation(Facturation facturation) {
		this.facturation = facturation;
	}
	public void setTarifHC(Double tarifHC) {
		this.tarifHC = tarifHC;
	}
   
}
