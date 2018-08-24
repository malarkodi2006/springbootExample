package com.malar.orderprocessing.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "ORDER_PROCESSING")
public class Order implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "ORDER_ID")
	private int orderId;
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	

	@Column(name = "ORDER_DATE")
	private String orderDate;
	@Column(name = "SHIP_DATE")
	private String shipDate;
	@Column(name = "TO_STREET")
	private String toStreet;
	@Column(name = "TO_CITY")
	private String toCity;
	@Column(name = "TO_STATE")
	private String toState;
	@Column(name = "TO_ZIPCODE")
	private String toZipcode;
	
	public Order()
	{
		
	}
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getToStreet() {
		return toStreet;
	}

	public void setToStreet(String toStreet) {
		this.toStreet = toStreet;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getToState() {
		return toState;
	}

	public void setToState(String toState) {
		this.toState = toState;
	}

	public String getToZipcode() {
		return toZipcode;
	}

	public void setToZipcode(String toZipcode) {
		this.toZipcode = toZipcode;
	}

	public Order(int orderId, int customerId, String orderDate, String shipDate, String toStreet, String toCity,
			String toState, String toZipcode) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.toStreet = toStreet;
		this.toCity = toCity;
		this.toState = toState;
		this.toZipcode = toZipcode;
	}

	
}
