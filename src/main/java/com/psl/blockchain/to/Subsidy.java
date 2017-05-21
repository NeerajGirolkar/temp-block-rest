package com.psl.blockchain.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subsidy {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int subsidyId;
	private String subsidyName;
	private boolean consumed;
	private double amount;
	
	public Subsidy() { }
	
	public Subsidy(int subsidyId, String subsidyName, boolean consumed, double amount) {
		super();
		this.subsidyId = subsidyId;
		this.subsidyName = subsidyName;
		this.consumed = consumed;
		this.amount = amount;
	}

	public int getSubsidyId() {
		return subsidyId;
	}

	public void setSubsidyId(int subsidyId) {
		this.subsidyId = subsidyId;
	}

	public String getSubsidyName() {
		return subsidyName;
	}

	public void setSubsidyName(String subsidyName) {
		this.subsidyName = subsidyName;
	}

	public boolean isConsumed() {
		return consumed;
	}

	public void setConsumed(boolean consumed) {
		this.consumed = consumed;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}