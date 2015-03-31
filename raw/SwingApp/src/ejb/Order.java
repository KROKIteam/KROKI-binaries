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
@Table(name = "IA_ORDER")
public class Order implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "ORD_ORDER_NUMBER", unique = false, nullable = false)
	private java.lang.String a_order_number;
	@Column(name = "ORD_ORDER_DATE", unique = false, nullable = false)
	private java.util.Date a_order_date;
	@Column(name = "ORD_SHIPMENT_ADDRESS", unique = false, nullable = false)
	private java.lang.String a_shipment_address;
	@ManyToOne
	@JoinColumn(name="order_city", referencedColumnName="ID",  nullable = true)
	private City order_city;
	@Column(name = "ORD_ORDER_TOTAL", unique = false, nullable = false)
	private java.math.BigDecimal a_order_total;
	@Column(name = "ORD_ORDER_STATUS", unique = false, nullable = false)
	private java.lang.String a_order_status;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "invoice_order")
	private Set<Invoice> invoice_orderSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "orderitem_order")
	private Set<OrderItem> orderitem_orderSet;
	
	public Order(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_order_number() {
		return this.a_order_number;
	}
	
	public void setA_order_number(java.lang.String a_order_number) {
		this.a_order_number = a_order_number;
	}
	
	public java.util.Date getA_order_date() {
		return this.a_order_date;
	}
	
	public void setA_order_date(java.util.Date a_order_date) {
		this.a_order_date = a_order_date;
	}
	
	public java.lang.String getA_shipment_address() {
		return this.a_shipment_address;
	}
	
	public void setA_shipment_address(java.lang.String a_shipment_address) {
		this.a_shipment_address = a_shipment_address;
	}
	
	public City getOrder_city() {
		return this.order_city;
	}
	
	public void setOrder_city(City order_city) {
		this.order_city = order_city;
	}
	
	public java.math.BigDecimal getA_order_total() {
		return this.a_order_total;
	}
	
	public void setA_order_total(java.math.BigDecimal a_order_total) {
		this.a_order_total = a_order_total;
	}
	
	public java.lang.String getA_order_status() {
		return this.a_order_status;
	}
	
	public void setA_order_status(java.lang.String a_order_status) {
		this.a_order_status = a_order_status;
	}
	
	public Set<Invoice> getInvoice_orderSet() {
		return this.invoice_orderSet;
	}
	
	public void setInvoice_orderSet(Set<Invoice> invoice_orderSet) {
		this.invoice_orderSet = invoice_orderSet;
	}
	
	public Set<OrderItem> getOrderitem_orderSet() {
		return this.orderitem_orderSet;
	}
	
	public void setOrderitem_orderSet(Set<OrderItem> orderitem_orderSet) {
		this.orderitem_orderSet = orderitem_orderSet;
	}
	
}