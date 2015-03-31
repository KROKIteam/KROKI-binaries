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
@Table(name = "IA_STOCK")
public class Stock implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "STO_STOCK_NAME", unique = false, nullable = false )
	private java.lang.String a_stock_name;
	@Column(name = "STO_ADDRESS", unique = false, nullable = false )
	private java.lang.String a_address;
	@ManyToOne
	@JoinColumn(name="stock_department", referencedColumnName="ID",  nullable = true)
	private Department stock_department;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "stockkeepingunit_stock")
	private Set<StockKeepingUnit> stockkeepingunit_stockSet;
	
	public Stock(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_stock_name() {
		return this.a_stock_name;
	}
	
	public void setA_stock_name(java.lang.String a_stock_name) {
		this.a_stock_name = a_stock_name;
	}
	
	public java.lang.String getA_address() {
		return this.a_address;
	}
	
	public void setA_address(java.lang.String a_address) {
		this.a_address = a_address;
	}
	
	public Department getStock_department() {
		return this.stock_department;
	}
	
	public void setStock_department(Department stock_department) {
		this.stock_department = stock_department;
	}
	
	public Set<StockKeepingUnit> getStockkeepingunit_stockSet() {
		return this.stockkeepingunit_stockSet;
	}
	
	public void setStockkeepingunit_stockSet(Set<StockKeepingUnit> stockkeepingunit_stockSet) {
		this.stockkeepingunit_stockSet = stockkeepingunit_stockSet;
	}
	
}