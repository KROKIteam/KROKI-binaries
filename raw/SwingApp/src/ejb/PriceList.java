package ejb;

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
   Creation date: 24.12.2014  14:50:37h
   **/

@Entity
@Table(name = "IA_PRICE_LIST")
public class PriceList implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "PRI_LIST_NUMBER", unique = false, nullable = false)
	private java.lang.String a_list_number;
	@Column(name = "PRI_ACTIVE_FROM", unique = false, nullable = false)
	private java.util.Date a_active_from;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "pricelistitem_priceList")
	private Set<PriceListItem> pricelistitem_priceListSet;
	
	public PriceList(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_list_number() {
		return this.a_list_number;
	}
	
	public void setA_list_number(java.lang.String a_list_number) {
		this.a_list_number = a_list_number;
	}
	
	public java.util.Date getA_active_from() {
		return this.a_active_from;
	}
	
	public void setA_active_from(java.util.Date a_active_from) {
		this.a_active_from = a_active_from;
	}
	
	public Set<PriceListItem> getPricelistitem_priceListSet() {
		return this.pricelistitem_priceListSet;
	}
	
	public void setPricelistitem_priceListSet(Set<PriceListItem> pricelistitem_priceListSet) {
		this.pricelistitem_priceListSet = pricelistitem_priceListSet;
	}
	
}