package entite;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Achat
 * 
 */
@Entity
@Table(name = "ACHAT")
public class Achat implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NUM_ACHAT")
	private Long numAchat;
	@Column(name = "NUM_PIECE",unique=true)
	private String numPiece;
	@Column(name = "DATE_ACHAT")
	private Date dateAchat;
	@Column(name = "LIBELLE_ACHAT", length = 255)
	private String libelle;
	@Column(name = "NUM_FACT", length = 255)
	private String numFact;
	@Column(name = "REFERENCE_ACHAT", length = 255)
	private String reference;
	@Column(name = "MONTANT_ACHAT")
	private Double montant;
	private static final long serialVersionUID = 1L;

	public Achat() {
		super();
	}

	public Long getNumAchat() {
		return this.numAchat;
	}

	public void setNumAchat(Long numAchat) {
		this.numAchat = numAchat;
	}

	public Date getDateAchat() {
		return this.dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNumFact() {
		return this.numFact;
	}

	public void setNumFact(String numFact) {
		this.numFact = numFact;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Double getMontant() {
		return this.montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getNumPiece() {
		return numPiece;
	}

	public void setNumPiece(String numPiece) {
		this.numPiece = numPiece;
	}

}
