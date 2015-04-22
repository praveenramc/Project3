import java.util.HashSet;



/**
 * @author Praveen
 * Wrapper class for Customer. Each customer will hold
 * id : A unique id that identifies the customer
 * categories : A list of categories that interests the customer
 * amount : A wrapper object that represents amount in dollar and cents
 *
 */

public class Customer {
	private long id;
	
	private HashSet<Integer> category;
	private double amount;
	private int transactionCount;

	Customer(long id, HashSet<Integer> category2, double amount) {
		this.id = id;
		this.category = category2;
		this.amount = amount;
		this.transactionCount = 0;
	}
	
	/**
	 * @return the transactionCount
	 */
	public int getTransactionCount() {
		return transactionCount;
	}

	/**
	 * @param transactionCount the transactionCount to set
	 */
	public void setTransactionCount(int transactionCount) {
		this.transactionCount = this.transactionCount +  transactionCount;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the category
	 */
	public HashSet<Integer> getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(HashSet<Integer> category) {
		this.category = category;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", category=" + category + ", amount="
				+ amount + "]";
	}


}
