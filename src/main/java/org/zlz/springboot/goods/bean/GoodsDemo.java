package org.zlz.springboot.goods.bean;

public class GoodsDemo {
	private int id;
	private String name;
	private double price;
	private String creatDate;
	private String keepDate;
	private int ml;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the creatDate
	 */
	public String getCreatDate() {
		return creatDate;
	}
	/**
	 * @param creatDate the creatDate to set
	 */
	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}
	/**
	 * @return the keepDate
	 */
	public String getKeepDate() {
		return keepDate;
	}
	/**
	 * @param keepDate the keepDate to set
	 */
	public void setKeepDate(String keepDate) {
		this.keepDate = keepDate;
	}
	/**
	 * @return the ml
	 */
	public int getMl() {
		return ml;
	}
	/**
	 * @param ml the ml to set
	 */
	public void setMl(int ml) {
		this.ml = ml;
	}
	public GoodsDemo(int id, String name, double price, String creatDate, String keepDate, int ml) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.creatDate = creatDate;
		this.keepDate = keepDate;
		this.ml = ml;
	}
	public GoodsDemo() {
		super();
	}
	
}
