package test.discount.offer;

import test.discount.sku.Sku;

public class DiscountA  implements IDiscountOnSingleItems{
	
	private Sku sku1; 

	public float  calculateDiscount(Sku sku1, int qty){
		
		final String discountFor3A = "130";
		float totalDiscount = 0 ;
		int quotient  = 0;
		int remainder = 0  ;
		if(qty >0){
		 quotient = qty/3;
		 remainder = qty%3;
		}
		if("A".equalsIgnoreCase(sku1.getSkuId())   ){
			totalDiscount = 
					totalDiscount+ sku1.getSkuPrice() * remainder +
					Integer.parseInt(discountFor3A) * quotient;
		}
		System.out.println("Discounted Price  for SKU A  :" + totalDiscount );
	return totalDiscount;	
	}
	
}
