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
@Table(name = "IA_ORDER_ITEM")
public class OrderItem implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "ORD_ORDERED_QUANTITY", unique = false, nullable = false)
	private java.lang.String a_ordered_quantity;
	@Column(name = "ORD_AVAILABLE", unique = false, nullable = false)
	private java.lang.Boolean a_available;
	@Column(name = "ORD_UNIT_PRICE", unique = false, nullable = false)
	private java.math.BigDecimal a_unit_price;
	@Column(name = "ORD_UNIT_TAX", unique = false, nullable = false)
	private java.math.BigDecimal a_unit_tax;
	@Column(name = "ORD_VALUE", unique = false, nullable = false)
	private java.math.BigDecimal a_value;
	@ManyToOne
	@JoinColumn(name="orderitem_product", referencedColumnName="ID",  nullable = true)
	private Product orderitem_product;
	@ManyToOne
	@JoinColumn(name="orderitem_order", referencedColumnName="ID",  nullable = true)
	private Order orderitem_order;
	
	public OrderItem(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_ordered_quantity() {
		return this.a_ordered_quantity;
	}
	
	public void setA_ordered_quantity(java.lang.String a_ordered_quantity) {
		this.a_ordered_quantity = a_ordered_quantity;
	}
	
	public java.lang.Boolean getA_available() {
		return this.a_available;
	}
	
	public void setA_available(java.lang.Boolean a_available) {
		this.a_available = a_available;
	}
	
	public java.math.BigDecimal getA_unit_price() {
		return this.a_unit_price;
	}
	
	public void setA_unit_price(java.math.BigDecimal a_unit_price) {
		this.a_unit_price = a_unit_price;
	}
	
	public java.math.BigDecimal getA_unit_tax() {
		return this.a_unit_tax;
	}
	
	public void setA_unit_tax(java.math.BigDecimal a_unit_tax) {
		this.a_unit_tax = a_unit_tax;
	}
	
	public java.math.BigDecimal getA_value() {
		return this.a_value;
	}
	
	public void setA_value(java.math.BigDecimal a_value) {
		this.a_value = a_value;
	}
	
	public Product getOrderitem_product() {
		return this.orderitem_product;
	}
	
	public void setOrderitem_product(Product orderitem_product) {
		this.orderitem_product = orderitem_product;
	}
	
	public Order getOrderitem_order() {
		return this.orderitem_order;
	}
	
	public void setOrderitem_order(Order orderitem_order) {
		this.orderitem_order = orderitem_order;
	}
	
}