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
@Table(name = "IA_ENTERPRISE")
public class Enterprise implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "ENT_NAME", unique = false, nullable = false)
	private java.lang.String a_name;
	@Column(name = "ENT_ADDRESS", unique = false, nullable = false)
	private java.lang.String a_address;
	@ManyToOne
	@JoinColumn(name="enterprise_city", referencedColumnName="ID",  nullable = true)
	private City enterprise_city;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "department_enterprise")
	private Set<Department> department_enterpriseSet;
	
	public Enterprise(){
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
	
	public City getEnterprise_city() {
		return this.enterprise_city;
	}
	
	public void setEnterprise_city(City enterprise_city) {
		this.enterprise_city = enterprise_city;
	}
	
	public Set<Department> getDepartment_enterpriseSet() {
		return this.department_enterpriseSet;
	}
	
	public void setDepartment_enterpriseSet(Set<Department> department_enterpriseSet) {
		this.department_enterpriseSet = department_enterpriseSet;
	}
	
}