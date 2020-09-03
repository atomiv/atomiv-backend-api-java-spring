package org.atomiv.template.lite.web.restapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "orderItems")
@ApiModel(description = "Details about the contact")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "The unique id of the OrderItem")
	private long id;
	@NotNull(message = "ProductId cannot be null")
	@ApiModelProperty(notes = "The unique id of the Product")
	private long productId;
	@ApiModelProperty(notes = "The product`s unit price")
	private double unitPrice;
	@Min(1)
	@ApiModelProperty(notes = "The quantity of the product")
	private int quantity;
	
	public OrderItem() {
		
	}

	public OrderItem(long id, long productId, double unitPrice, int quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	
	

}
