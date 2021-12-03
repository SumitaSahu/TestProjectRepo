package test.discount.offer;

import test.discount.sku.Sku;

public interface IDiscountOnComboItems {
	public float  calculateDiscount(Sku sku1,  Sku sku2, 
			Sku sku3,   Sku sku4  );

}
