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
@Table(name = "IA_STOCK_KEEPING_UNIT")
public class StockKeepingUnit implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "STO_AVAILABLE", unique = false, nullable = false )
	private java.lang.Boolean a_available;
	@ManyToOne
	@JoinColumn(name="stockkeepingunit_stock", referencedColumnName="ID",  nullable = true)
	private Stock stockkeepingunit_stock;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "product_stockKeepingUnit")
	private Set<Product> product_stockKeepingUnitSet;
	
	public StockKeepingUnit(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.Boolean getA_available() {
		return this.a_available;
	}
	
	public void setA_available(java.lang.Boolean a_available) {
		this.a_available = a_available;
	}
	
	public Stock getStockkeepingunit_stock() {
		return this.stockkeepingunit_stock;
	}
	
	public void setStockkeepingunit_stock(Stock stockkeepingunit_stock) {
		this.stockkeepingunit_stock = stockkeepingunit_stock;
	}
	
	public Set<Product> getProduct_stockKeepingUnitSet() {
		return this.product_stockKeepingUnitSet;
	}
	
	public void setProduct_stockKeepingUnitSet(Set<Product> product_stockKeepingUnitSet) {
		this.product_stockKeepingUnitSet = product_stockKeepingUnitSet;
	}
	
}