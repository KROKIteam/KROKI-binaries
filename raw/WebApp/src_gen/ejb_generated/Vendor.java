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
@Table(name = "IA_VENDOR")
public class Vendor implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "VEN_NAME", unique = false, nullable = false )
	private java.lang.String a_name;
	@Column(name = "VEN_ADDRESS", unique = false, nullable = false )
	private java.lang.String a_address;
	@ManyToOne
	@JoinColumn(name="vendor_city", referencedColumnName="ID",  nullable = true)
	private City vendor_city;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "product_vendor")
	private Set<Product> product_vendorSet;
	
	public Vendor(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_name() {
		return this.a_name;
	}
	
	public void setA_name(java.lang.String a_name) {
		this.a_name = a_name;
	}
	
	public java.lang.String getA_address() {
		return this.a_address;
	}
	
	public void setA_address(java.lang.String a_address) {
		this.a_address = a_address;
	}
	
	public City getVendor_city() {
		return this.vendor_city;
	}
	
	public void setVendor_city(City vendor_city) {
		this.vendor_city = vendor_city;
	}
	
	public Set<Product> getProduct_vendorSet() {
		return this.product_vendorSet;
	}
	
	public void setProduct_vendorSet(Set<Product> product_vendorSet) {
		this.product_vendorSet = product_vendorSet;
	}
	
}