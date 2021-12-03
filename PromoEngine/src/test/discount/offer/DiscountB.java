package test.discount.offer;

import test.discount.sku.Sku;

public class DiscountB  implements IDiscountOnSingleItems{

	public float calculateDiscount(Sku sku1, int qty) {
		final String discountFor3B = "45";
		float totalDiscount = 0 ;
		int quotient = qty/2;
		int remainder = qty%2;
		
		if("B".equalsIgnoreCase(sku1.getSkuId())   ){
			totalDiscount = 
					totalDiscount+ sku1.getSkuPrice() * remainder +
					Integer.parseInt(discountFor3B) * quotient;
		}
		System.out.println("Discounted Price  for SKU B :" + totalDiscount );
		
	return totalDiscount;
	}

}
