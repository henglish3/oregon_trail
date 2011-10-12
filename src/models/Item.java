/**
 * This class represents an Item
 * @author S.H.L.A.T.
 * @version 1.0 10/10/2011
 */

package edu.gatech.cs2340.shlat.models;

public class Item {
	private String name;
	private int amount; 
	private final int MAX_AMOUNT = 200;
	private int weight;
	private double price;
        private int id;
        private String desc;
        private boolean start;
	
	/**
	 * This constructor creates a new default Item object
	 */
	public Item(){
          /*
		name = "";
		amount = 0;
		weight = 0;
		price = 0;
          */
	}

        public Item(Item item, int amount) {
          this.name = item.getName();
          this.amount = amount;
          this.weight = item.getWeight();
          this.id = item.getId();
        }
	/**
	 * This constructor creates an Item object with a name, amount, weight, and price
	 * @param name
	 * 		The name of this Item
	 *	@param amount
	 *			The amount of this Item
	 *	@param weight
	 *			The weight of this Item
	 *	@param price
	 *			The price of this Item
	 */
	public Item(String name, int amount, int weight, double price){
		this.name = name;
		this.amount = amount;
		this.weight = weight;
		this.price = price;
		MAXAMOUNT = 200;//Feel free to change this amount
	}
	/**
	 * This method changes this Item's amount
	 * @param amount
	 *			This Item's new amount
	 */
	public void changeAmount(int amount){
		this.amount = amount;
	}
	/**
	 * This method changes this Item's name
	 * @param name
	 * 		This Item's new name
	 */
	public void setName(String name){
		this.name = name;
	}

        // Sets the description
        public void setDesc(String desc) {
            this.desc = desc;
        }

        // Sets the item id
        public void setId(String id) {
            this.id = Integer.parseInt(id);
        }

        // Sets whether or not a user starts with this item.
        public void setStart(String start) {
            this.start = Boolean.valueOf(start);
        }

	/**
	 * This method changes this Item's weight
	 * @param weight
	 * 		This Item's new weight
	 */
	public void changeWeight(int weight){
		this.weight = weight;
	}
	/**
	 * This method changes this Item's price
	 * @param price
	 * 		This Item's new price
	 */
	public void changePrice(double price){
		this.price = price;
	}
	/**
	 * This method returns this Item's amount
	 * @return amount 
	 * 		This Item's amount
	 */
	public int getAmount(){
		return amount;
	}
	/**
	 * This method returns this Item's name
	 * @return name
	 * 		This Item's name
	 */
	public String getName(){
		return name;
	}
	/**
	 * This method returns this Item's weight
	 * @return weight
	 * 		This Item's weight
	 */
	public int getWeight(){
		return weight;
	}
	/**
	 * This method returns this Item's price
	 * @return price
	 * 		This Item's price
	 */
	public double getPrice(){
		return price;
	}
	/**
	 * This method returns this Item's maximum amount
	 * @return MAXAMOUNT
	 * 		This Item's maximum amount
	 */
	public int getMaxAmount(){
		return MAXAMOUNT;
	}

        public boolean getStart() {
            return start;
        }

        public int getId() {
            return id;
        }
}
