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
   Creation date: 31.03.2015  13:14:03h
   **/

@Entity
@Table(name = "IA_PRODUCT")
public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "PRO_PRODUCT_NAME", unique = false, nullable = false )
	private java.lang.String a_product_name;
	@Column(name = "PRO_DESCRIPTION", unique = false, nullable = false )
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="product_category", referencedColumnName="ID",  nullable = true)
	private Category product_category;
	@ManyToOne
	@JoinColumn(name="product_stockKeepingUnit", referencedColumnName="ID",  nullable = true)
	private StockKeepingUnit product_stockKeepingUnit;
	@ManyToOne
	@JoinColumn(name="product_priceListItem", referencedColumnName="ID",  nullable = true)
	private PriceListItem product_priceListItem;
	@ManyToOne
	@JoinColumn(name="product_vendor", referencedColumnName="ID",  nullable = true)
	private Vendor product_vendor;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "orderitem_product")
	private Set<OrderItem> orderitem_productSet;
	
	public Product(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_product_name() {
		return this.a_product_name;
	}
	
	public void setA_product_name(java.lang.String a_product_name) {
		this.a_product_name = a_product_name;
	}
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public Category getProduct_category() {
		return this.product_category;
	}
	
	public void setProduct_category(Category product_category) {
		this.product_category = product_category;
	}
	
	public StockKeepingUnit getProduct_stockKeepingUnit() {
		return this.product_stockKeepingUnit;
	}
	
	public void setProduct_stockKeepingUnit(StockKeepingUnit product_stockKeepingUnit) {
		this.product_stockKeepingUnit = product_stockKeepingUnit;
	}
	
	public PriceListItem getProduct_priceListItem() {
		return this.product_priceListItem;
	}
	
	public void setProduct_priceListItem(PriceListItem product_priceListItem) {
		this.product_priceListItem = product_priceListItem;
	}
	
	public Vendor getProduct_vendor() {
		return this.product_vendor;
	}
	
	public void setProduct_vendor(Vendor product_vendor) {
		this.product_vendor = product_vendor;
	}
	
	public Set<OrderItem> getOrderitem_productSet() {
		return this.orderitem_productSet;
	}
	
	public void setOrderitem_productSet(Set<OrderItem> orderitem_productSet) {
		this.orderitem_productSet = orderitem_productSet;
	}
	
}