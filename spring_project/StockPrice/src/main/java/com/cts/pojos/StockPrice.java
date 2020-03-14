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

	private int cprice;

	private String date;
	private String time;
    private String uploadfile;
	@Override
	public String toString() {
		return "StockPrice [stockex=" + stockex + ", companyname=" + companyname + ", cprice=" + cprice + ", date="
				+ date + ", time=" + time + ", uploadfile=" + uploadfile + "]";
	}
	public String getStockex() {
		return stockex;
	}
	public void setStockex(String stockex) {
		this.stockex = stockex;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(String uploadfile) {
		this.uploadfile = uploadfile;
	}
	
			}
