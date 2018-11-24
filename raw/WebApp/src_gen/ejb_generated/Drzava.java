package ejb_generated;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.CascadeType;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;

   /** 
   Class generated using Kroki EJBGenerator 
   @Author KROKI Team 
   Creation date: 24.11.2018  17:20:35h
   **/

@Entity
@Table(name = "PRO_DRZAVA")
public class Drzava implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "DRZ_NAZIV", unique = false, nullable = true,columnDefinition = "VARCHAR")
	protected java.lang.String ka_naziv;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "grad_drzava")
	protected Set<Grad> grad_drzavaSet;
	
	public Drzava(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_naziv() {
		return this.ka_naziv;
	}
	
	public void setKa_naziv(java.lang.String ka_naziv) {
		this.ka_naziv = ka_naziv;
	}
	
	public Set<Grad> getGrad_drzavaSet() {
		return this.grad_drzavaSet;
	}
	
	public void setGrad_drzavaSet(Set<Grad> grad_drzavaSet) {
		this.grad_drzavaSet = grad_drzavaSet;
	}
	
}