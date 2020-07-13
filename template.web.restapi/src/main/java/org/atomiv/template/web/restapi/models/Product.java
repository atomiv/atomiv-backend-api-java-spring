package org.atomiv.template.web.restapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	@NotNull(message = "Code cannot be null")
	@Size(min = 1, max = 10, message = "Code must be max length 10 characters")
	@Column(name = "code")
	private String code;
	
	@NotNull(message = "Discription cannot be null")
	@Size(min = 1, max = 100, message = "Discription must be max length 100 characters")
	@Column(name = "discription")
	private String discription;
	
	@PositiveOrZero
	@DecimalMin(value = "0.0", inclusive = false)
	@Digits(integer=3, fraction=2)
	@Column(name = "unitPrice")
	private double unitPrice;
	
	@Column(name = "isListed")
	private boolean isListed;
	
	
	
	public Product() {
		super();
	}
	public Product(long id, String code, String discription, double unitPrice, boolean isListed) {
		super();
		this.id = id;
		this.code = code;
		this.discription = discription;
		this.unitPrice = unitPrice;
		this.isListed = isListed;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public boolean getIsListed() {
		return isListed;
	}
	public void setIsListed(boolean isListed) {
		this.isListed = isListed;
	}
	
	

}
