/**
 * @author Praveen
 * Wrapper class for amount object
 * dollar : variable to hold the dollar value
 * cents : variable to hold the cents value
 */
public class Amount {
	private int dollar;
	private int cent;
	
	Amount(int dollar, int cent) {
		this.dollar = dollar;
		this.cent = cent;
	}

	/**
	 * @return the dollar
	 */
	public int getDollar() {
		return dollar;
	}

	/**
	 * Set method adds the new revenue amount if the customer
	 * already has the some dollar or cent set.
	 * If the value of dollar and cent is zero, it sets it to
	 * the newAmount object
	 * 
	 * @param dollar the dollar to set
	 */
	public void setDollar(Amount amt) {
		this.dollar = this.dollar + amt.getDollar();
	}
	
	/*
	 * This set method will be invoked only when we add a revenue to a customer 
	 * because of which the cent value becomes greater than 100.
	 * 
	 * @param dollar the dollar to be added to existing dollar. The dollar 
	 * value will be usually $1 
	 */
	private void setDollar(int dollar) {
		this.dollar = this.dollar + dollar;
	}

	/**
	 * @return the cent
	 */
	public int getCent() {
		return cent;
	}

	/**
	 * @param cent the cent to set
	 */
	public void setCent(Amount amt) {
		/*
		 * check if cent is a negative value.
		 * If it is negative set it to Zero and notify the user about 
		 * the value that cent variable uses.
		 */
		this.cent = this.cent + amt.getCent();
		
		//Make sure the cent value is not greater than 100.
		if(this.cent > 100) {
			setDollar(1);
			setCent(this.cent - 100);
		}
	}
	
	private void setCent(int cent) {
		this.cent = cent;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return dollar + "." + cent;
	}	
}
