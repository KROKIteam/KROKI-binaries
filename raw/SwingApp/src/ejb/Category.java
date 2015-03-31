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
@Table(name = "IA_CATEGORY")
public class Category implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "CAT_CATEGORY_NAME", unique = false, nullable = false)
	private java.lang.String a_category_name;
	@Column(name = "CAT_DESCRIPTION", unique = false, nullable = false)
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="category_category", referencedColumnName="ID",  nullable = true)
	private Category category_category;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "category_category")
	private Set<Category> category_categorySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "product_category")
	private Set<Product> product_categorySet;
	
	public Category(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_category_name() {
		return this.a_category_name;
	}
	
	public void setA_category_name(java.lang.String a_category_name) {
		this.a_category_name = a_category_name;
	}
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public Category getCategory_category() {
		return this.category_category;
	}
	
	public void setCategory_category(Category category_category) {
		this.category_category = category_category;
	}
	
	public Set<Category> getCategory_categorySet() {
		return this.category_categorySet;
	}
	
	public void setCategory_categorySet(Set<Category> category_categorySet) {
		this.category_categorySet = category_categorySet;
	}
	
	public Set<Product> getProduct_categorySet() {
		return this.product_categorySet;
	}
	
	public void setProduct_categorySet(Set<Product> product_categorySet) {
		this.product_categorySet = product_categorySet;
	}
	
}