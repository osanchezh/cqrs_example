package com.buffer.productservice.command.api.model;

import java.math.BigDecimal;


public class ProductRestModel {
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
	private String name;
    private BigDecimal price;
    private Integer quantity;
    
    public ProductRestModel(ProductRestModelBuilder builder) {
		super();
		this.name = builder.name;
		this.price = builder.price;
		this.quantity = builder.quantity;
	}



	public ProductRestModel() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "ProductRestModel [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}



	public static class ProductRestModelBuilder{
		
    	public ProductRestModelBuilder() {
			super();
		}

		public ProductRestModelBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public ProductRestModelBuilder setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}

		public ProductRestModelBuilder setQuantity(Integer quantity) {
			this.quantity = quantity;
			
			return this;
		}
		private String name;
        private BigDecimal price;
        private Integer quantity;
        
		public ProductRestModel build(){
			return new ProductRestModel(this);
		}
    }
}
