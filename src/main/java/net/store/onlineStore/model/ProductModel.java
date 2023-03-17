package net.store.onlineStore.model;

public class ProductModel {
	private int productId;
	private String productName;
	private String productType;
	private String productPrise;
	private String countryOrigin;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductPrise() {
		return productPrise;
	}

	public void setProductPrise(String productPrise) {
		this.productPrise = productPrise;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

}
