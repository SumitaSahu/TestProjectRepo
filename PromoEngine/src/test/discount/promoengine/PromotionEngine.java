package test.discount.promoengine;

import java.util.Scanner;

import test.discount.offer.DiscountA;
import test.discount.offer.DiscountB;
import test.discount.offer.DiscountCD;
import test.discount.sku.Sku;

public class PromotionEngine {

	public static void main(String[] args) {
		Sku skuA = new Sku();
		Sku skuB = new Sku();
		Sku skuC = new Sku();
		Sku skuD = new Sku();

		setAllSkus(skuA, skuB, skuC, skuD);

		calcultateTotalAfterPromotion(skuA, skuB, skuC, skuD);
		

	}

	private static void calcultateTotalAfterPromotion(Sku skuA, Sku skuB,
			Sku skuC, Sku skuD) {
		float totalDiscount = 0;
		DiscountA disctonA = new DiscountA();
		DiscountB disctonB = new DiscountB();
		DiscountCD disctonCD = new DiscountCD();
		
		System.out.println("Entered  Qty for SKU A  , B, C, D  :" + skuA.getQty() +":"+ 
		skuB.getQty() +":" + skuC.getQty() + ";" +skuD.getQty());
		
		
		if (skuA.getQty() > 0) {
			totalDiscount = totalDiscount
					+ disctonA.calculateDiscount(skuA, skuA.getQty());
		}
		if (skuB.getQty() > 0) {
			totalDiscount = totalDiscount
					+ disctonB.calculateDiscount(skuB, skuB.getQty());
		}

		// check for combo items
		if (skuC.getQty() > 0 || skuD.getQty() > 0) {
			totalDiscount = totalDiscount
					+ disctonCD.calculateDiscount(skuA, skuB, skuC, skuD);
		}

		System.out.println("Total Discounted Price  On Order    :"
				+ totalDiscount);
	}

	private static void setAllSkus(Sku skuA, Sku skuB, Sku skuC, Sku skuD) {
		skuA.setSkuPrice(50);
		skuA.setSkuId("A");
		skuA.setSkuName("A");
		skuB.setSkuPrice(30);
		skuB.setSkuId("B");
		skuB.setSkuName("B");
		skuC.setSkuPrice(20);
		skuC.setSkuId("C");
		skuC.setSkuName("C");
		skuD.setSkuPrice(15);
		skuD.setSkuId("D");
		skuD.setSkuName("D");
		try {
			// Using Scanner for Getting Input from User
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Qty for SKU A  :");
			int qtyForSkuA = in.nextInt();
			skuA.setQty(qtyForSkuA);
			System.out.println("Enter Qty for SKU B :");
			int qtyForSkuB = in.nextInt();
			skuB.setQty(qtyForSkuB);
			System.out.println("Enter Qty for SKU C :");
			int qtyForSkuC = in.nextInt();
			skuC.setQty(qtyForSkuC);
			System.out.println("Enter Qty for SKU D :");
			int qtyForSkuD = in.nextInt();
			skuD.setQty(qtyForSkuD);
			// closing scanner
			in.close();
		} catch (Exception e) {
			System.out.println("Exception caught :");
			e.printStackTrace();
		}
	}

}
