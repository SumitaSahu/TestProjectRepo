package test.discount.sku;

public class Sku {
	private String skuId;
	private String skuName;
	private float skuPrice;
	private float skuDiscount;
	private int qty;
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public float getSkuPrice() {
		return skuPrice;
	}
	public void setSkuPrice(float skuPrice) {
		this.skuPrice = skuPrice;
	}
	public float getSkuDiscount() {
		return skuDiscount;
	}
	public void setSkuDiscount(float skuDiscount) {
		this.skuDiscount = skuDiscount;
	}
	
	

}
