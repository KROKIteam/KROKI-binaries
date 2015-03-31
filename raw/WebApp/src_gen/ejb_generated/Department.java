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
@Table(name = "IA_DEPARTMENT")
public class Department implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "DEP_DEPARTMENT_NAME", unique = false, nullable = false )
	private java.lang.String a_department_name;
	@Column(name = "DEP_ADDRESS", unique = false, nullable = false )
	private java.lang.String a_address;
	@ManyToOne
	@JoinColumn(name="department_city", referencedColumnName="ID",  nullable = true)
	private City department_city;
	@ManyToOne
	@JoinColumn(name="department_enterprise", referencedColumnName="ID",  nullable = true)
	private Enterprise department_enterprise;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "stock_department")
	private Set<Stock> stock_departmentSet;
	
	public Department(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_department_name() {
		return this.a_department_name;
	}
	
	public void setA_department_name(java.lang.String a_department_name) {
		this.a_department_name = a_department_name;
	}
	
	public java.lang.String getA_address() {
		return this.a_address;
	}
	
	public void setA_address(java.lang.String a_address) {
		this.a_address = a_address;
	}
	
	public City getDepartment_city() {
		return this.department_city;
	}
	
	public void setDepartment_city(City department_city) {
		this.department_city = department_city;
	}
	
	public Enterprise getDepartment_enterprise() {
		return this.department_enterprise;
	}
	
	public void setDepartment_enterprise(Enterprise department_enterprise) {
		this.department_enterprise = department_enterprise;
	}
	
	public Set<Stock> getStock_departmentSet() {
		return this.stock_departmentSet;
	}
	
	public void setStock_departmentSet(Set<Stock> stock_departmentSet) {
		this.stock_departmentSet = stock_departmentSet;
	}
	
}