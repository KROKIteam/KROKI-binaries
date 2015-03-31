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
@Table(name = "IA_PRICE_LIST_ITEM")
public class PriceListItem implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "PRI_PRICE", unique = false, nullable = false)
	private java.math.BigDecimal a_price;
	@Column(name = "PRI_TAX", unique = false, nullable = false)
	private java.math.BigDecimal a_tax;
	@ManyToOne
	@JoinColumn(name="pricelistitem_priceList", referencedColumnName="ID",  nullable = true)
	private PriceList pricelistitem_priceList;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "product_priceListItem")
	private Set<Product> product_priceListItemSet;
	
	public PriceListItem(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.math.BigDecimal getA_price() {
		return this.a_price;
	}
	
	public void setA_price(java.math.BigDecimal a_price) {
		this.a_price = a_price;
	}
	
	public java.math.BigDecimal getA_tax() {
		return this.a_tax;
	}
	
	public void setA_tax(java.math.BigDecimal a_tax) {
		this.a_tax = a_tax;
	}
	
	public PriceList getPricelistitem_priceList() {
		return this.pricelistitem_priceList;
	}
	
	public void setPricelistitem_priceList(PriceList pricelistitem_priceList) {
		this.pricelistitem_priceList = pricelistitem_priceList;
	}
	
	public Set<Product> getProduct_priceListItemSet() {
		return this.product_priceListItemSet;
	}
	
	public void setProduct_priceListItemSet(Set<Product> product_priceListItemSet) {
		this.product_priceListItemSet = product_priceListItemSet;
	}
	
}