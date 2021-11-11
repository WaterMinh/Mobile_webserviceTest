package com.bkap.entity;


public class Mobile {
	
	private int mobId; 
	
	private String mobName; 
	
	private String producer;
	
	private float price;
	
	private String description;
	
	
	public Mobile() {
		super();
	}


	public Mobile(String mobName, String producer, float price, String description) {
		super();
		this.mobName = mobName;
		this.producer = producer;
		this.price = price;
		this.description = description;
	}


	public int getMobId() {
		return mobId;
	}


	public void setMobId(int mobId) {
		this.mobId = mobId;
	}


	public String getMobName() {
		return mobName;
	}


	public void setMobName(String mobName) {
		this.mobName = mobName;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	

}
