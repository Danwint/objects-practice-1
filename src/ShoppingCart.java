
/**
 * This class represents a shopping cart that you can add different priced items to.  
 * Note that you cannot remove items from the cart (better for business!)
 */
public class ShoppingCart {
	private int itemTotal = 0;
	private double amountOwed = 0;
	
	public ShoppingCart() {

	}
	
	/**
	 * Adds items to the cart.
	 * 
	 * @param numberOfItems the number of items being added to the cart
	 * @param pricePerItem the price per item being added to the cart
	 */
	public void addItems(int numberOfItems, double pricePerItem) {
		itemTotal += numberOfItems;
		amountOwed += (numberOfItems * pricePerItem);
	}
	
	/**
	 * @return the total number of items that have been added to this cart
	 */
	public int getTotalNumberOfItems() {
		return itemTotal;
	}
	
	/**
	 * @return the total price of all items that have been added to the cart
	 */
	public double getTotalAmountOwed() {
		return amountOwed;
	}
	
	/**
	 * The average price of all items that have been added to the cart.  This should be equal to 
	 * the totalAmountOwed divided by the totalNumberOfItems.
	 * 
	 * @return the average price of items added to the cart
	 */
	public double getAveragePricePerItem() {
		double averagePrice;
		if (itemTotal > 0) {
		averagePrice = amountOwed / itemTotal;
		} else {
			averagePrice = 0;
		}
		return averagePrice;
	}
}
