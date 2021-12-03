package test.discount.offer;

import test.discount.sku.Sku;

public interface IDiscountOnSingleItems {

	public float  calculateDiscount(Sku sku1, int qty);

}
