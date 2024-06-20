package com.buffer.productservice.command.api.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;



import java.math.BigDecimal;


public class CreateProductCommand {

    @TargetAggregateIdentifier
    private String productId;
	private String name;
    private BigDecimal price;
    private Integer quantity;

    public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public CreateProductCommand(CreateProductCommandBuilder builder) {
		super();
		this.productId = builder.productId;
		this.name = builder.name;
		this.price = builder.price;
		this.quantity = builder.quantity;
	}

	@Override
	public String toString() {
		return "CreateProductCommand [productId=" + productId + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	public static class CreateProductCommandBuilder{
	    private String productId;
		private String name;
	    private BigDecimal price;
	    private Integer quantity;


		public CreateProductCommandBuilder() {
			super();
		}

		public CreateProductCommandBuilder setProductId(String productId) {
			this.productId = productId;
			return this;
		}

		public CreateProductCommandBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public CreateProductCommandBuilder setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}

		public CreateProductCommandBuilder setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}
		public CreateProductCommand build(){
			return new CreateProductCommand(this);
		}
	}

}
