package com.buffer.productservice.command.api.events;

import java.math.BigDecimal;

public class ProductCreatedEvent {
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
	private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    
    public ProductCreatedEvent() {
		super();
	}
	public ProductCreatedEvent(ProductCreatedEventBuilder builder) {
		super();
		this.productId = builder.productId;
		this.name = builder.name;
		this.price = builder.price;
		this.quantity = builder.quantity;
	}
	@Override
	public String toString() {
		return "ProductCreatedEvent [productId=" + productId + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	public static class ProductCreatedEventBuilder{

		public ProductCreatedEventBuilder setProductId(String productId) {
			this.productId = productId;
			return this;
		}

		public ProductCreatedEventBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public ProductCreatedEventBuilder setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}

		public ProductCreatedEventBuilder setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}
		
		public ProductCreatedEventBuilder() {
			super();
		}

		private String productId;
        private String name;
        private BigDecimal price;
        private Integer quantity;	
        
        public ProductCreatedEvent build() {
        	return new ProductCreatedEvent(this);
        }
    	
    }
}
