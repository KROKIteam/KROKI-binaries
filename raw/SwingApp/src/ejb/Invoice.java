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
@Table(name = "IA_INVOICE")
public class Invoice implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "INV_INVOICE_NUMBER", unique = false, nullable = false)
	private java.lang.String a_invoice_number;
	@Column(name = "INV_INVOICE_DATE", unique = false, nullable = false)
	private java.util.Date a_invoice_date;
	@Column(name = "INV_INVOICE_TOTAL", unique = false, nullable = false)
	private java.math.BigDecimal a_invoice_total;
	@ManyToOne
	@JoinColumn(name="invoice_order", referencedColumnName="ID",  nullable = true)
	private Order invoice_order;
	@Column(name = "INV_CANCELED", unique = false, nullable = false)
	private java.lang.Boolean a_canceled;
	
	public Invoice(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_invoice_number() {
		return this.a_invoice_number;
	}
	
	public void setA_invoice_number(java.lang.String a_invoice_number) {
		this.a_invoice_number = a_invoice_number;
	}
	
	public java.util.Date getA_invoice_date() {
		return this.a_invoice_date;
	}
	
	public void setA_invoice_date(java.util.Date a_invoice_date) {
		this.a_invoice_date = a_invoice_date;
	}
	
	public java.math.BigDecimal getA_invoice_total() {
		return this.a_invoice_total;
	}
	
	public void setA_invoice_total(java.math.BigDecimal a_invoice_total) {
		this.a_invoice_total = a_invoice_total;
	}
	
	public Order getInvoice_order() {
		return this.invoice_order;
	}
	
	public void setInvoice_order(Order invoice_order) {
		this.invoice_order = invoice_order;
	}
	
	public java.lang.Boolean getA_canceled() {
		return this.a_canceled;
	}
	
	public void setA_canceled(java.lang.Boolean a_canceled) {
		this.a_canceled = a_canceled;
	}
	
}