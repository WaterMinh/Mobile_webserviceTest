package com.bkap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblMobile")
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MobId")
	private int mobId; 
	@Column(name = "MobName")
	private String mobName; 
	@Column(name = "Producer")
	private String producer;
	@Column(name = "Price")
	private float price;
	@Column(name = "Description")
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
