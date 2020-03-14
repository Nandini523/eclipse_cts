package com.cts.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "stockex")

public class StockExchange {

	@Id
	private Integer seid;

	private String stockx;

	private String brief;

	private String remarks;

	private String caddress;

	@Override
	public String toString() {
		return "StockExchange [seid=" + seid + ", stockx=" + stockx + ", brief=" + brief + ", remarks=" + remarks
				+ ", caddress=" + caddress + "]";
	}

	public Integer getSeid() {
		return seid;
	}

	public void setSeid(Integer seid) {
		this.seid = seid;
	}

	public String getStockx() {
		return stockx;
	}

	public void setStockx(String stockx) {
		this.stockx = stockx;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	

}