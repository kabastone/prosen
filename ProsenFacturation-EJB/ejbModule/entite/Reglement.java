package entite;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reglement
 *
 */
@Entity
@Table(name="REGLEMENTS")
public class Reglement implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NUM_REGLEMENT")
	private Long numReglement;
	@Column(name="OBSERVATION" , length=500,nullable=true)
	private String observation;
    @Column(name="DATE_REGLEMENT" ,nullable=false)
	private Date dateReglement;
    private Double montant;
    
	private static final long serialVersionUID = 1L;

	public Reglement() {
		super();
		this.dateReglement = new Date();
	}   
	public Long getNumReglement() {
		return this.numReglement;
	}

	public void setNumReglement(Long numReglement) {
		this.numReglement = numReglement;
	}   
	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}   
	public Date getDateReglement() {
		return this.dateReglement;
	}

	public void setDateReglement(Date dateReglement) {
		this.dateReglement = dateReglement;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
   
}
