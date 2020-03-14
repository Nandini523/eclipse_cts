package com.cts.pojos;

import java.sql.Time;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "stockp")

public class StockPrice {
	@Id

	private String stockex;

	private String companyname;

	private String cprice;

	private Date date;

	@Override
	public String toString() {
		return "StockPrice [companyname=" + companyname + ", stockex=" + stockex + ", cprice=" + cprice + ", date="
				+ date + "]";
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getStockex() {
		return stockex;
	}

	public void setStockex(String stockex) {
		this.stockex = stockex;
	}

	public String getCprice() {
		return cprice;
	}

	public void setCprice(String cprice) {
		this.cprice = cprice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	}
