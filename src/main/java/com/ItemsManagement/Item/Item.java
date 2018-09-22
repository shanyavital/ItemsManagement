package com.ItemsManagement.Item;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private String itemNo;
	private String name;
	private String amount;
	private String inventoryCode;
	
	public Item() {
	}
	
	public Item(String itemNo, String name, String amount, String inventorycode) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.amount = amount;
		this.inventoryCode = inventorycode;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getInventoryCode() {
		return inventoryCode;
	}

	public void setInventoryCode(String inventorycode) {
		this.inventoryCode = inventorycode;
	}
}
