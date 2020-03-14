package com.cts.pojos;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "ipodetails")

public class IpoDetails {
	@Id
	private Integer ipoid;

	private String companyName;

	private String stockExchange;

	private Integer priceperShare;

	private Integer totalnoofShares;

	private String date;
	 private String time;
	@Override
	public String toString() {
		return "IpoDetails [ipoid=" + ipoid + ", companyName=" + companyName + ", stockExchange=" + stockExchange
				+ ", priceperShare=" + priceperShare + ", totalnoofShares=" + totalnoofShares + ", date=" + date
				+ ", time=" + time + "]";
	}
	public Integer getIpoid() {
		return ipoid;
	}
	public void setIpoid(Integer ipoid) {
		this.ipoid = ipoid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public Integer getPriceperShare() {
		return priceperShare;
	}
	public void setPriceperShare(Integer priceperShare) {
		this.priceperShare = priceperShare;
	}
	public Integer getTotalnoofShares() {
		return totalnoofShares;
	}
	public void setTotalnoofShares(Integer totalnoofShares) {
		this.totalnoofShares = totalnoofShares;
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

	}
