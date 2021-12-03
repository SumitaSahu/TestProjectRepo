package test.discount.offer;

import test.discount.sku.Sku;

public class DiscountCD  implements IDiscountOnComboItems{

	public float calculateDiscount(Sku sku1,  Sku sku2, 
			Sku sku3,  Sku sku4) {
		float totalDiscount = 0;
		final int discountForCandD = 30;

		int qty1 = sku1.getQty();
		int qty2 = sku2.getQty();
		int qty3 = sku3.getQty();
		int qty4 = sku4.getQty();
		
		if("C".equalsIgnoreCase(sku3.getSkuId()) && "D".equalsIgnoreCase(sku4.getSkuId()) 
				&& qty3 > 0 && qty4 >0){
			
			int commonQty  = 0;
			
			if(qty3 >= qty4) { //D is more than or equals  C 
				 commonQty = qty4;
				totalDiscount  = totalDiscount  + (discountForCandD * qty4);
				int remainingQty = qty3 - qty4;
				if(remainingQty >0 )
					totalDiscount = totalDiscount + sku4.getSkuPrice() * remainingQty;
			}else if (qty4 > qty3){ //C is more than D 
				 commonQty = qty3;
				totalDiscount  = totalDiscount  + (discountForCandD * qty3);
				int remainingQty = qty4 - qty3;
				if(remainingQty >0 )
					totalDiscount = totalDiscount + sku3.getSkuPrice() * remainingQty;
			}
				
			//totalDiscount = totalDiscount + discntB.calculateDiscount(sku2, qty2);
		}else  if ("C".equalsIgnoreCase(sku3.getSkuId())  && qty3 >0 ){
			totalDiscount = totalDiscount +sku3.getSkuPrice() * qty3 ;
		}else  if ("D".equalsIgnoreCase(sku4.getSkuId())  && qty4 >0 ){
			totalDiscount = totalDiscount +sku4.getSkuPrice() * qty4 ;
		}
		
		System.out.println("Discounted Price  for SKU C - D   :" + totalDiscount );
		return totalDiscount;
	}
	

}
